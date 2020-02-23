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
       
    }
}

