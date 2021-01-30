pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build pipe line 1'
            }
        }
        stage('Test'){
            steps {
                echo 'Test pipe line 1'
            }
        }
    }
}