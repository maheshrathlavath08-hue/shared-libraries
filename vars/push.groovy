  def call(String Dusername, String Image, String tag){
    withCredentials([usernamePassword(
                    'credentialsId':'dockerHubCred',
                    usernameVariable:"username",
                    passwordVariable:"password")]){
    bat " docker login -u ${username} -p ${password}
    bat "docker push ${Dusername}/${Image}:${tag}"
  }
  }
