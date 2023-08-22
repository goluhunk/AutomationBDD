pipeline {
    agent any
 
    stages {
        stage('Test') {
            steps {
               bat "Run"
            }
            
        stage ('Cucumber Reports') {
            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/CucumberTestReport.json",
                    jsonReportDirectory: 'target'
            }
 
            post {                
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                   echo "Deployment Done"
                }
            }
        }
    }
}
