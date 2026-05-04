pipeline {
    agent any

    tools {
        maven 'Maven-3.9'    // must match the name you configured in Global Tool Configuration
    }

    stages {
        stage('Build & Test') {
            steps {
                sh 'mvn -version'
                sh 'mvn clean test'
            }
        }
    }
}