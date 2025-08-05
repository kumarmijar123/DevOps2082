pipeline {
    agent any

        stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }




        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $productmanagement .'
            }
        }

        stage('Stop Previous Container') {
            steps {
                sh '''
                docker stop $productmanagment || true
                docker rm $productmanagment || true
                '''
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker run -d --name $productmanagment -p 8080:8080 $productmanagement'
            }
        }
    }

    post {
        always {
            echo 'Pipeline complete. Check http://localhost:8089.'
        }
    }
}


