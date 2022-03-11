public class Main {
    
    private static void playWithAterisk(int n) {
        // your code here
        for (int i = 0;i < n;i++) {
            
            for (int k = 0;k < (n - i);k++) {
                System.out.print(" ");
            }
            
            for (int j = i;j >= 0;j--) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    
     public static void main(String []args){
        playWithAterisk(5);
     }
}