public class RemoveVowals {
    public static void main(String[] args) {
        String name="hugo";
       name.replaceAll("[aeiouAEIOU]","");
        System.out.println(name.replaceAll("[aeiouAEIOU]",""));
    }
}