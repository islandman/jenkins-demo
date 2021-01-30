pipelineJob('pipelineJob1') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob1.groovy'))
            sandbox()
        }
    }
}

pipelineJob('pipelineJob2') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob2.groovy'))
            sandbox()
        }
    }
}

pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

