pipeline {
  agent any

  stages {

    stage('One') {
      steps {
        addShortText background: '', borderColor: '', color: '', link: '', text: 'ONE'
        sh '''
          echo Hello1
          echo Hello2
        '''
      }
    }

    stage('Two') {
      steps {
        echo "Two"
      }
    }

  }

}
