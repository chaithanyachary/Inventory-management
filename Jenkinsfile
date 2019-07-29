pipeline {
  agent any
  stages {
    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace... */
      steps {
        checkout scm
      }
    }
    stage('Build Project and Generate Docker Images') {
      steps {
        sh 'mvn -B -DskipTests clean package'
        sh 'echo $USER'
        sh 'echo whoami'
      }
    }
    stage('Run eureka application') {
      steps {
         withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
              sh 'nohup java -jar eureka-registry-service/target/eureka-registry-service-0.0.1-SNAPSHOT.jar &'
            }
      }
    }
    /* stage('Run zuul application') {
      steps {
         withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
             sleep(time:30,unit:"SECONDS")
              sh 'java -jar inventory-mgmt-service/target/inventory-mgmt-service-0.0.1-SNAPSHOT.jar'
              
            }
      }
    } */
  }
}
