public class StringReverse {
    public static void main(String[] args) {
        String str="Hello";
        //1st
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

        //2nd
        char[] ch=str.toCharArray();
        for(int i=ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
    }
}
