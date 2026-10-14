def call(String pname, String tag, String Dckerusername)
{
bat " docker built -t ${Dckerusername}/${pname}:${tag} ."
}
