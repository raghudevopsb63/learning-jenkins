//pipeline {
//
//  options {
//    ansiColor('xterm')
//  }
//
//  environment {
//    ENV_URL = "pipeline.google.com"
//    SSH_CRED = credentials("SSH")
//  }
//
//  triggers {
//    pollSCM('*/2 * * * *')
//  }
//
//  tools {
//    maven 'maven-3.6.3'
//  }
//
//  parameters {
//    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
//    text(name: 'BIOGRAPHY', defaultValue: '', description: 'Enter some information about the person')
//    booleanParam(name: 'TOGGLE', defaultValue: true, description: 'Toggle this value')
//    choice(name: 'CHOICE', choices: ['One', 'Two', 'Three'], description: 'Pick something')
//    password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')
//  }
//
//  stages {
//
//    stage('One') {
//      when {
//        environment name: 'CHOICE', value: 'One'
//      }
//      steps {
//        addShortText background: '', borderColor: '', color: '', link: '', text: 'ONE'
//        sh '''
//          echo Hello1
//          echo Hello2
//          echo ENV_URL = ${ENV_URL}
//        '''
//      }
//    }
//
//    stage('Two') {
//
//      when {
//        environment name: 'CHOICE', value: 'Two'
//      }
//
//      environment {
//        ENV_URL = "stage.google.com"
//      }
//
////      input {
////        message "Should we continue?"
////        ok "Yes, we should."
////        submitter "alice,bob"
////        parameters {
////          string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
////        }
////      }
//
//      steps {
//        echo "Two"
//        sh 'echo ENV_URL = ${ENV_URL}'
//        sh 'env'
//        echo '\033[34mHello\033[0m \033[33mcolorful\033[0m \033[35mworld!\033[0m'
//        sh 'echo -e "\\e[31mHello"'
//        //sh 'terraform apply -auto-approve'
//        sh 'mvn --version'
//      }
//    }
//
//  }
//
//  agent any
//
//}
//


pipeline {
  agent {
    node { label 'workstation1'} // Agent node name
    //label 'ansible'  // Agent labels
  }

  stages {

    stage('Parallel') {
      parallel {

        stage('One') {
          steps {
            sh 'sleep 10'
          }
        }

        stage('Two') {
          steps {
            sh 'sleep 10'
          }
        }

        stage('Three') {
          steps {
            sh 'sleep 10'
          }
        }

      }
    }

  }

  post {
    always {
      cleanWs()
      sh 'echo post'
    }
  }

}

//pipeline {
//  agent any
//  stages {
//    stage('Non-Sequential Stage') {
//      steps {
//        sh 'sleep 10'
//      }
//    }
//    stage('Sequential') {
//      environment {
//        FOR_SEQUENTIAL = "some-value"
//      }
//      stages {
//        stage('In Sequential 1') {
//          steps {
//            sh 'sleep 10'
//          }
//        }
//        stage('In Sequential 2') {
//          steps {
//            sh 'sleep 10'
//          }
//        }
//        stage('Parallel In Sequential') {
//          parallel {
//            stage('In Parallel 1') {
//              steps {
//                sh 'sleep 10'
//              }
//            }
//            stage('In Parallel 2') {
//              steps {
//                sh 'sleep 10'
//              }
//            }
//          }
//        }
//      }
//    }
//  }
//}