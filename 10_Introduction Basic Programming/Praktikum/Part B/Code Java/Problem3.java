public class Main {
    
    private static void DrawXYZ(int n) {
        // your code here
        int numberXYZ = 1;
        for (int i = 0;i < n;i++) {
            
            for (int j = 0;j < n;j++) {
                if ((numberXYZ%3) == 0) {
                   System.out.print("X "); 
                } else if ((numberXYZ%2) == 0) {
                   System.out.print("Z "); 
                } else {
                    System.out.print("Y "); 
                }
                numberXYZ++;
                
            }
            
            System.out.println();
        }
        System.out.println();
    }
    
     public static void main(String []args){
        DrawXYZ(3);
        /*
        Y Z X
        Z Y X
        Y Z X
        */
        DrawXYZ(5);
        /*
        Y Z X Z Y 
        X Y Z X Z 
        Y X Y Z X 
        Z Y X Y Z 
        X Z Y X Y 
        */
        DrawXYZ(1);
        // Y
     }
}