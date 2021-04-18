public class Main {

    public static void main(String[] args) {
        String str = countAndSay(2);
        System.out.println(str);
    }

    private static String countAndSay(int n){
        if(n==1)
            return new String("1");

        int count = 1;
        String say = "1";

        while(count<=n){
            StringBuffer stringBuffer = new StringBuffer();
            for (int i=1; i<say.length(); i++){
                char chr = say.charAt(i);
                int repeat = 1;

                while((i<say.length()) && chr == say.charAt(i-1)){
                    repeat++; i++;
                }
                stringBuffer.append((char)repeat + say.charAt(i-1));
            }

            say = stringBuffer.toString();
            count++;
        }

        return say;
    }
}
