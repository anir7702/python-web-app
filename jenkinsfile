pipeline{
    agent any
    
    stages{
        stage('checkout'){
            steps{
                git branch: 'main', url: 'https://github.com/anir7702/python-web-app.git'
            }
        }
        stage('Install Dependencies'){
            steps{
                sh 'pip install -r requirements.txt'
            }
        }
        stage('Test'){
            steps{
                sh 'export PATH="$PATH:/usr/local/bin/pytest"'
            }
        }
    }
}
