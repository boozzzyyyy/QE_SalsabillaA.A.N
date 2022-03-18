public class Main {
    public static void main(String[] args){
        int[] input = {2, 1, 5, 1, 3, 2};
        int k = 3;
        MaximumSumSubarrayofSizeK(input, k);

        int[] input2 = {2, 3, 4, 1,5};
        int k2 = 2;
        MaximumSumSubarrayofSizeK(input2, k2);
    }

    public static void MaximumSumSubarrayofSizeK(int[] input, int k){
        int output = 0;
        int container = 0;
        for(int i = 0;i < input.length;i++){
            for(int j = 0; j < k;j++){
                if((i+j) < input.length){
                    container += input[(i+j)];
                }
            }
            if(container >= output){
                output = container;
            }
            container = 0;
        }

        System.out.println(output);
    }
}
