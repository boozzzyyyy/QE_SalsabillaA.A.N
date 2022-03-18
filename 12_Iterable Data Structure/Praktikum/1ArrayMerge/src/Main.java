import java.util.*;

public class Main {
    public static void main(String[] args){
        String[] input1 = {"kazuya", "jin", "lee"};
        String[] input2 = {"kazuya", "feng"};
        ArrayMerge(input1, input2);
        String[] input11 = {"lee", "jin"};
        String[] input22 = {"kazuya", "panda"};
        ArrayMerge(input11, input22);
    }

    public static void ArrayMerge(String[] input1, String[] input2){
        SortedSet<String> output = new TreeSet<>();


        for (String input1s: input1){
            output.add(input1s);
        }

        for (String input2s: input2){
            output.add(input2s);
        }

        System.out.println(output);
    }
}
