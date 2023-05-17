pipelineJob('jobprueba3') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/valentinaleal20/applicacionjenkinsfile.git')
                    }
                    branches('main')
                    scriptPath('jenkinsfile')
                }
            }
        }
    }
}