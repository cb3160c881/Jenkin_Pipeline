pipeline{
    agent any
    stages{
        stage("Clone"){
            steps{
                println "We download source code from private repo"
            }
        stage("Build"){
            steps{
                println "Build Code"
            }
        stage("Upload"){
            steps{
                println "Upload Artifacts"
            }
        }    
        }    

        }
    }
}