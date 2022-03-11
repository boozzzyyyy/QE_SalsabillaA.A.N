public class Main {
     public static void main(String []args){
        int bilangan = 20;
        
        // Process: Your Solution Code Here
        for (int i = bilangan;i >= 1;i--) {
            if ((bilangan % i) == 0) {
                System.out.println(i);
            }
        }
     }
}