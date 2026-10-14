  def call(String Dusername, String Project<, String tag){
    withCredentials([usernamePassword(
                    'credentialsId':'dockerHubCred',
                    usernameVariable:"username",
                    passwordVariable:"password")])
    bat "docker push ${Dusername}/${project}:${tag}
  }
