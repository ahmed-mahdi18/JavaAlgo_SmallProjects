import java.util.*;

public class StacksChallenge {
    public static void main(String[] args) {
            // should return true
            System.out.println(checkForPalindrome("abccba"));
            // should return true
            System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
            // should return true
            System.out.println(checkForPalindrome("I did,did I?"));
            // should return false
            System.out.println(checkForPalindrome("hello"));
            // should return true
            System.out.println(checkForPalindrome("Don't nod"));
        }


        public static boolean checkForPalindrome(String string) {

            LinkedList<Character> stack = new LinkedList<>();
            string = string.replace(" ", "");
            string = string.replace(",", "");
            string = string.replace("?", "");
            string = string.replace("'", "");
            string = string.toUpperCase();
            for (int i = 0; i < string.length(); i++) {
                stack.push(string.charAt(i));
            }
            String string1 = "";
            for (Character character : stack) {
                string1 += character + "";
            }
            return string1.equals(string);
        }


}






