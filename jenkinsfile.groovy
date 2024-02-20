pipeline {
    agent any
    
    environment {
        VENV = "${WORKSPACE}/venv"
        PYTHON = "${VENV}/bin/python"
    }
    
    stages {
        stage('Checkout') {
            steps {
                script {
                    try {
                        git 'https://github.com/anir7702/python-web-app'
                    } catch (Exception e) {
                        echo "Failed to checkout code: ${e.message}"
                        error "Failed to checkout code"
                    }
                }
            }
        }
        
        stage('Setup virtual environment') {
            steps {
                script {
                    try {
                        sh "python3 -m venv ${VENV}"
                        sh "${VENV}/bin/pip install --upgrade pip"
                        sh "${VENV}/bin/pip install -r requirements.txt"
                    } catch (Exception e) {
                        echo "Failed to setup virtual environment: ${e.message}"
                        error "Failed to setup virtual environment"
                    }
                }
            }
        }
        
        stage('Test') {
            steps {
                script {
                    try {
                        sh "source ${VENV}/bin/activate && ${PYTHON} -m unittest discover tests"
                    } catch (Exception e) {
                        echo "Failed to run tests: ${e.message}"
                        error "Failed to run tests"
                    }
                }
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
    }
}
