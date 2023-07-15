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

    stage('Deploy') {
      steps {
        // Realize a implantação do pacote, por exemplo, enviando-o para um servidor de aplicativos
        // ou fazendo o upload para um repositório de artefatos
      }
    }
  }
}