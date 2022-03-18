import java.util.*;

public class Main {
    public static void main(String[] args) {
        AngkaMunculSekali("76523752");
        AngkaMunculSekali("1122");
    }

    public static void AngkaMunculSekali(String angka){
        ArrayList<String> container = new ArrayList<>();
        int check = 0;
        for (int i = 0;i < angka.length() - 1;i++){
            check = 0;
            for (int j = 0;j < angka.length();j++){
                if (i != j){
                    if(angka.charAt(i) == angka.charAt(j)){
                        check++;
                    }
                }
            }

            if(check == 0){
                container.add(String.valueOf(angka.charAt(i)));
            }

        }

        System.out.println(container);
    }
}
