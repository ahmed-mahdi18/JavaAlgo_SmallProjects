import java.util.LinkedList;

public class QueuesChallenge {

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
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowerCase = string.toLowerCase();

        for (int i= 0; i < lowerCase.length(); i++) {
            char k = lowerCase.charAt(i);
            if (k >= 'a' && k <= 'z') {
                queue.add(k);
            }

        }
        for (int i = 0; i < lowerCase.length(); i++) {
            char k = lowerCase.charAt(i);
            if (k >= 'a' && k <= 'z') {
                stack.push(k);
            }
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (queue.remove().equals(stack.pop())) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
