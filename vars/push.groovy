def call(String Dusername, String Image, String tag) {
    withCredentials([usernamePassword(
        credentialsId: 'dockerHubCred',
        usernameVariable: 'DH_USER',
        passwordVariable: 'DH_PASS')]) {
        bat 'echo %DH_PASS%| docker login -u %DH_USER% --password-stdin'
    }
    bat "docker push ${Dusername}/${Image}:${tag}"
}
