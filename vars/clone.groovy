def call(String url, String branch) {
    echo "Cloning ${url}, branch: ${branch}"
    git url: url, branch: branch
}
