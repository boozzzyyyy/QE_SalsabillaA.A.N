public class Main {
    
    private static String ubahHuruf(String s) {
        // your code here
        String result = "";
        int IntASCII = 0;
        char StringASCII;
        int lengthString = s.length() - 1;
        for (int i = 0;i <= lengthString;i++) {
            if (s.charAt(i) == ' ') {
                result = result + ' ';
            } else {
                IntASCII = (int) s.charAt(i);
                IntASCII = IntASCII + 10;
                if (IntASCII > 90) {
                    IntASCII = IntASCII - 26;
                }
                StringASCII = (char) IntASCII;
                result = result + StringASCII;
            }
        }
        
        return result;
    }
    
     public static void main(String []args){
        System.out.println(ubahHuruf("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(ubahHuruf("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(ubahHuruf("INDONESIA")); // SXNYXOCSK
        System.out.println(ubahHuruf("GOLANG")); // QYVKXQ
        System.out.println(ubahHuruf("PROGRAMMER")); // ZBYQBKWWOB
     }
}