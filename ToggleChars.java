import java.util.*;

public class ToggleChars
{
    public static String toggle(String str) {
        char[] charArray = str.toCharArray();

        for (int i=0; i<charArray.length; i++) {
            char currentChar = charArray[i];

            if (Character.isUpperCase(currentChar)) {
                charArray[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                charArray[i] = Character.toUpperCase(currentChar);
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input ");
        String ip = sc.next();
        String op = toggle(ip);
        System.out.println("Output: " + op);   
    }  
}
