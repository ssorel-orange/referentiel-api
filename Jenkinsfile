pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps{
                build job: 'Referentiel_Api_build'
            }
        }
        stage('Package Application'){
           steps {
                step ([$class: 'CopyArtifact', projectName: 'Referentiel_Api_build', filter: 'target/referentiel-api*.jar']);
                sh "pwd"
                sh "ls -a"
                sh "docker build ./ -t referentiel_api_:${env.BUILD_ID}"
            }
            
        }
        stage('Launch Application'){
           steps {
                sh "pwd"
                sh "ls -a"
                sh "docker run -d -p 9093:9091 --name referentiel_api_${env.BUILD_ID} referentiel_api_:${env.BUILD_ID}"
            }
            
        }
    }
}

