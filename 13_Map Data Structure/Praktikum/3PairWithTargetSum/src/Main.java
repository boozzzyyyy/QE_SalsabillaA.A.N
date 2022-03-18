import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        int[] input = {1,2,3,4,6};
        int target = 6;
        PairWithTargetSum(input, target);
        int[] input1 = {2,5,9,11};
        int target1 = 11;
        PairWithTargetSum(input1, target1);
    }

    public static void PairWithTargetSum(int[] input, int target){
        SortedSet<Integer> output = new TreeSet<>();

        for (int i = 0;i < input.length - 1;i++){
            for (int j = 0;j < input.length;j++){
                if (i != j){
                    if((input[i] + input[j]) == target){
                        output.add(i);
                        output.add(j);
                    }
                }
            }
        }

        System.out.println(output);
    }
}
