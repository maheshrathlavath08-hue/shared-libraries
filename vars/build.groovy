def call(String pname, String tag, String Dckerusername)
{
bat " docker build -t ${Dckerusername}/${pname}:${tag} ."
}
