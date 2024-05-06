pipeline {

    agent any

    stages {

        stage('Checkout') {

            steps {

                git branch: 'main',
                    url: 'https://github.com/andrereges/ms-procedure.git'
            }

        }

        stage('Install') {

            steps {

                sh './mvnw clean install -DskipTests=false'

            }

        }

        stage('Test') {

            steps {

                sh './mvnw test'

            }

        }

        stage('Package') {

            steps {

                sh './mvnw package -DskipTests=false'

            }
        }

        stage('Capture') {

            steps {

                archiveArtifacts '**/target/*.jar'

                junit '**/target/surefire-reports/TEST-*.xml'

            }

        }

    }
}