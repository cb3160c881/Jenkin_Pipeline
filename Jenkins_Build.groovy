pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                sh "mvn clean package"

            }
                    
        }
        stage("Upload"){
            steps{
                println "Here we will upload Artifacts to S3 Bucket"
            }
        }
        stage("Deploy"){
            steps{
                println "Here we will deploy"
            }
        }

        
    }
}