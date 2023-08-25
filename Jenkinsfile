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
        }
    }
}