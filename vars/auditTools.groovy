def call() {
    node {
      sh '''
        git version
        docker version
        whereis java
      '''
    }
}
