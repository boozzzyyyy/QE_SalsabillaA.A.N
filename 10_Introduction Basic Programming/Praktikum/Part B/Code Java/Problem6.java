public class Main {
    
    private static float Mean(float[] numbers) {
        // your code here
        int totalArray = numbers.length;
        float result = 0;
        
        for (int i = 0;i < totalArray;i++) {
            result = result + numbers[i];
        }
        
        return result / totalArray;
    }
    
     public static void main(String []args){
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value)); // 2.5
     }
}