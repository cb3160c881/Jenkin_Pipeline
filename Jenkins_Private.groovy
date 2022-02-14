pipeline{
    agent any
    stages{
        stage("Clone"){
            steps{
                println "We download source code from private repo"

                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'gitauth', url: 'https://github.com/cb3160c881/Private_Repo.git']]])
                
            }
        }
        stage("Build"){
            steps{
                println "Build Code"
            }
        }
        stage("Upload"){
            steps{
                println "Upload Artifacts"
            }
        }    
         

        
    }
}