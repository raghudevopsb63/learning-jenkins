pipeline {
  agent any

  stages {

    stage('One') {
      steps {
        addBadge icon: '', id: '', link: '', text: 'ONE'
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
