import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        int[] input = {2, 3, 3, 3, 6, 9, 9};
        RemoveDuplicate(input);

        int[] input2 = {2, 2, 2, 11};
        RemoveDuplicate(input2);
    }

    public static void RemoveDuplicate(int[] input){
        SortedSet<Integer> output = new TreeSet<>();


        for (int inputs: input){
            output.add(inputs);
        }

        System.out.println(output.size());
    }
}
