pipeline {

    agent
    {
      label 'jenkinsslave-teamA'
    }

         maven 'maven 3.9.16'
         }

    stages {

        stage('code compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('code test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('code package') {
            steps {
                sh 'mvn clean package'
            }
        }
    }

    post {

        success {
            echo 'Build successful rannn'
        }

        failure {
            echo 'Build failed .....'
        }
    }
}
