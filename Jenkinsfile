pipeline {
    agent any
    stages {
        stage('Build'){
            steps {
                withMaven(maven:'maven-3.9.0'){
                    sh 'mvn clean package'
                }


            }
         }
         

    }
}