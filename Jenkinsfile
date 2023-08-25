pipeline{
    agent any
    stages{
        stage("chmod")
        {
            steps{
                sh "chmod 755 gradlew"
            }
        }
        stage("Compile"){
            steps{
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test"){
            steps{
                sh "./gradlew test"
            }
	stage("Cod Coverage"){
		steps{
			sh. "./gradlew jacocoTestReport"
			publishHTML (target: [
				reportDir: 'build/reports/jacoco/test/html',
				reportFiles: 'index.html',
				rerpotName: "JaCoCo Report"
			])
			sh. "./gradlew jacocoTestCoverageVerification"
        }
    }
}
