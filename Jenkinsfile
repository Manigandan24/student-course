pipeline {
   agent any

   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven "M3"
   }

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
            git 'https://github.com/ManiSoftSolutions/student-course'

            // Run Maven on a Unix agent.
            sh "mvn -Dmaven.test.failure.ignore=true clean package"

            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }

  
      }
      
       stage('Run') {
         steps {

            // Run Maven on a Unix agent.
            sh "mvn mvn spring-boot:run"
         }

      }
      
   }
}
