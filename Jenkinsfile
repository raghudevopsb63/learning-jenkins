pipeline {
  agent any

  environment {
    ENV_URL = "pipeline.google.com"
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
      steps {
        echo "Two"
        sh 'echo ENV_URL = ${ENV_URL}'
      }
    }

  }

}
