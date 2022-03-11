public class Main {
     public static void main(String []args){
        // input
        int studentScore = 80;
        
        // Process: Your Solution Code Here
        String result = "";
        
        if (studentScore >= 80 && studentScore <= 100) {
            result = "A";
        } else if (studentScore >= 65 && studentScore <= 79) {
            result = "B+";
        } else if (studentScore >= 50 && studentScore <= 64) {
            result = "B";
        } else if (studentScore >= 35 && studentScore <= 49) {
            result = "C";
        } else if (studentScore >= 0 && studentScore <= 34) {
            result = "D";
        } else {
            result = "";
        }
        // Output
        System.out.println(result);
        // Nilai A
     }
}