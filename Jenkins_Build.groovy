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
                sh "aws s3 cp target/hello-*.war s3://pipelineupload01"
            }
        }
        stage("Deploy"){
            steps{
                println "Here we will deploy"
            }
        }

        
    }
}