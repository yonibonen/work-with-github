properties([parameters([string(defaultValue: 'yoni', description: '', name: 'name', trim: false)]), pipelineTriggers([pollSCM('*/2 * * * *')])])

node {
    stage("checkout repo"){
        git branch: '*/develop', url: 'git \'https://github.com/yonibonen/work-with-github.git\''
    }
    stage("hellow world"){
        echo "Hello World!"
        }
}
