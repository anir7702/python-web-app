pipeline {
    agent any
 
    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the Git repository
                git credentialsId: 'anir7702', url: 'https://github.com/anir7702/python-web-app'
            }
        }
 
        stage('Install dependencies') {
            steps {
                // Install Python dependencies using pip
                sh 'pip install -r requirements.txt'
            }
        }
 
        stage('Run tests') {
            steps {
                // Run tests using pytest or any other testing framework
                sh 'pytest'
            }
        }
 
        stage('Build') {
            steps {
                // Build the Flask application (if applicable)
                // This step could involve running any build commands or scripts
            }
        }
 
        stage('Deploy') {
            steps {
                // Deploy the Flask application (e.g., copy files to a server)
                // This step could involve running any deployment commands or scripts
            }
        }
    }
 
    post {
        always {
            // Clean up or perform any post-build actions
        }
    }
}
 
