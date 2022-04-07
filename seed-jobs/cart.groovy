freeStyleJob('example') {
  scm {
    github('jenkinsci/job-dsl-plugin', 'master')
  }
  steps {
    gradle('clean build')
  }
}
