pipeline{
    
    agent any
    stages{
        

            stage("Build"){
                steps{
                    println "Build Process"
                    println "mvn clean package"
                }
            }
            stage("Deploy"){
                steps{
                println "Deploment Process"
                            
                }
            }

        
    }
}