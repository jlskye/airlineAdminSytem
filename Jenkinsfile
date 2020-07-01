pipeline {
  agent {
    docker {
      image 'node:12-alpine'
    }

  }
  stages {
    stage('uat') {
      when {
        expression {
          currentBuild.result == null || currentBuild.result == 'SUCCESS'
        }
      }
      steps {
        sh 'echo deploy success ${currentBuild}'
      }
    }
     stage('deploy') {
      when {
        expression {
          currentBuild.result == null || currentBuild.result == 'SUCCESS'
        }
      }
      steps {
        sh 'echo deploy success ${currentBuild}'
      }
    }
  }
}
