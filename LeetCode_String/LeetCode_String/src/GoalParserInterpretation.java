public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command="(al)G(al)()()G";
       // command=interpret(command);

       // command=command.replaceAll(".*[(al)].*","al");
       // command=command.replaceAll("[(G)]","G");
        //command=command.replaceAll("[()]","o");
        System.out.println(command);

    }
    public static String interpret(String command) {
        String string=command+'X';

        StringBuilder stringBuilder=new StringBuilder();
       int n=string.length();
        for (int i=1; i<string.length();i++){
            if (string.charAt(i-1)=='G'){
                stringBuilder.append('G');
            }
            if (string.charAt(i-1)=='(' && (string.charAt(i)==')')){
                stringBuilder.append('o');
            }
            if (string.charAt(i-1)=='a' && (string.charAt(i)=='l')){
                stringBuilder.append("al");
            }
        }
        return  stringBuilder.toString();
    }

    //"(al)G(al)()()G";
    public String interpret2(String command) {
        StringBuilder S = new StringBuilder(command.length());
        for(int i = 0 ; i < command.length() ; i++){
            if(command.charAt(i)=='G')
                S.append('G');
            if(command.charAt(i)=='(')
            {
                if(command.charAt(i+1)==')')
                {
                    S.append('o');
                    i++;
                }
                else{
                    S.append("al");
                    i = i + 3;
                }
            }
        }
        return S.toString();
    }
}
