public class Main {
    
    private static boolean palindrome(String value) {
        // your code here
        int countChar = 0;
        int lengthValue = value.length();
        int lengthValueCompare = lengthValue - 1;
        for (int i = 0; i < lengthValue;i++) {
            if (value.charAt(i) == value.charAt(lengthValueCompare - i)) {
                countChar++;
            }
        }
        
        if (countChar == lengthValue) {
            return true;
        } else {
            return false;
        }
    }
    
     public static void main(String []args){
        System.out.println(palindrome("civic")); // true
        System.out.println(palindrome("katak")); // true
        System.out.println(palindrome("kasur rusak")); // true
        System.out.println(palindrome("kupu-kupu")); // false
        System.out.println(palindrome("lion")); // false
     }
}