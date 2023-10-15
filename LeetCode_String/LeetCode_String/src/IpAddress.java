public class IpAddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        String[] array=address.split("");

        address =ipAddress(address);
        System.out.println(address);
    }
    public static String ipAddress(String address){
        StringBuilder builder= new StringBuilder();
        for(int i=0;i<address.length(); i++){
           // System.out.println(address.charAt(i));
            if (address.charAt(i)=='.'){
                builder.append("[.]");
            }
            else{
                builder.append(address.charAt(i));
            }
        }
        return builder.toString();
    }
    public static String ipAddress2(String address){
      address=address.replaceAll("[\\.]","[.]");
      return address;
    }
}
