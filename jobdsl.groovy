pipelineJob('jobprueba3') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/valentinaleal20/applicacionjenkinsfile.git')
                    }       
                    branch('feature')          
                    scriptPath('jenkinsfile')
                }
            }
        }
    triggers {
        scm('* 8-17 * * *')
        }
    }
}