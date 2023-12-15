pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'javac Matematica.java'
				sh 'javac -cp junit4.jar;. MatematicaTests1.java'
				sh 'javac -cp junit4.jar;. MatematicaTests2.java'
				sh 'javac -cp junit4.jar;. MatematicaTests3.java'
            }
        }

        stage('Unit Tests') {
            steps {
                sh 'cd ../CompileJob'
				sh 'java -cp junit4.jar;. org.junit.runner.JUnitCore MatematicaTests1'
				sh 'java -cp junit4.jar;. org.junit.runner.JUnitCore MatematicaTests2'
				sh 'java -cp junit4.jar;. org.junit.runner.JUnitCore MatematicaTests3'
            }
        }

    }
}
