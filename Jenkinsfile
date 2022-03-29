pipeline {
  agent any

  options {
    ansiColor('xterm')
  }

  environment {
    ENV_URL = "pipeline.google.com"
    SSH_CRED = credentials("SSH")
  }

  stages {

    stage('One') {
      steps {
        addShortText background: '', borderColor: '', color: '', link: '', text: 'ONE'
        sh '''
          echo Hello1
          echo Hello2
          echo ENV_URL = ${ENV_URL}
        '''
      }
    }

    stage('Two') {
      environment {
        ENV_URL = "stage.google.com"
      }
      steps {
        echo "Two"
        sh 'echo ENV_URL = ${ENV_URL}'
        sh 'env'
        sh '''
          echo -e "\\e[31mHello"
        '''
      }
    }

  }

}
