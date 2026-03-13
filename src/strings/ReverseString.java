package strings;

public class ReverseString {
    public static void main(String[] args) {
        String str="HELLO";
        String reverse=" ";
        for (int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reversed: "+reverse);
    }
}
