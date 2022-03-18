import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int[] input = {1,2,3,4};
        int[] input2 = {1,3,5,10,16};
        ArrayUnique(input, input2);

        int[] input3 = {3,8};
        int[] input4 = {2,8};
        ArrayUnique(input3, input4);
    }

    public static void ArrayUnique(int[] input1, int[] input2){
        ArrayList<String> container = new ArrayList<>();
        int check = 0;
        for (int i = 0;i < input1.length;i++){
            check = 0;
            for (int j = 0;j < input2.length;j++){
                if(input1[i] == input2[j]){
                    check++;
                }
            }

            if(check == 0){
                container.add(String.valueOf(input1[i]));
            }

        }

        System.out.println(container);
    }

}
