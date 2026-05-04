pipeline {
    agent any

    tools {
        maven 'Maven-3.9'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project'
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Docker Build (on docker agent)') {
            agent { label 'docker' }
            steps {
                echo 'Building Docker image (conceptual example)'
                sh '''
                    echo "Would run: docker build -t myapp:${BUILD_NUMBER} ."
                    echo "And maybe push with docker push ..."
                '''
            }
        }
    }
}