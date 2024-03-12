public class ReversePrefixOfWord {
    public static void main(String[] args) {

        String s="abcdefd";
        char  ch='d';

        String result=reversePrefix2(s, ch);
        System.out.println(result);

    }
    public static String reversePrefix(String word, char ch) {
            StringBuilder sb= new StringBuilder();
            boolean flag=false;
            for (int i=0; i<word.length(); i++){
                sb.append(word.charAt(i));
                if (word.charAt(i)==ch && flag==false){
                    sb.reverse();
                    flag=true;
                }
            }
            return sb.toString();
    }
    public static String reversePrefix2(String word, char ch) {
        StringBuilder sb= new StringBuilder();
        int index=word.indexOf(ch);
        for (int i=0; i<=index;i++){
            sb.append(word.charAt(i));
        }
        sb.reverse();
        String s=word.substring(index+1);
        System.out.println(s);
        return sb.toString()+s;
    }
}
