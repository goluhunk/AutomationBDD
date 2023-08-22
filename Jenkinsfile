pipeline {
    agent any
 
    stages {
        stage('Test') {
            steps {
               bat "Run"
            }
        }
        stage ('Cucumber Reports'){
            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/CucumberTestReport.json",
                    jsonReportDirectory: 'target'
            }
        }
           
        }
    
}

