pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        // Execute o comando Maven para compilar o projeto
        sh 'mvn clean compile'
      }
    }

    stage('Test') {
      steps {
        // Execute os testes do projeto Maven
        sh 'mvn test'
      }
    }

    stage('Package') {
      steps {
        // Crie o pacote (por exemplo, um arquivo JAR) do projeto Maven
        sh 'mvn package'
      }
    }

   stage('Build') {
  steps {
    checkout([$class: 'GitSCM', branches: [[name: '*/main']], 
             userRemoteConfigs: [[url: 'https://github.com/repoe2e/automation_selenium.git']]])
    sh 'mvn clean compile'
  }
}

  }
}