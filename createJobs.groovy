pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('pipelineJob1') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob1.groovy'))
            sandbox()
        }
    }
}