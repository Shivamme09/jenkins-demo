pipeline {
    agent any

    tools {
        maven 'Maven-3.9'   // use the exact name you configured
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code'
                // Jenkins already checks out from SCM for a Pipeline job,
                // but this stage is useful for clarity in the UI.
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
    }
}