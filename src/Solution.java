public class Solution {
    public static void main(String[] args)
    {
        // our initial int[] array containing primitives
        int[] arr = {22, 14, 52, 18, 99, 36, 42, 125, 15}; //1st Test case
        //int[] arr = {42}; //2nd Test case
        //int[] arr = { }; //3rd Test case

        // TODO: call your method here and print out result
        int MinimumNumber = Result.minNumber(arr);
        int MaximumNumber = Result.maxNumber(arr);
        System.out.println("Minimum number of an Array is: " + MinimumNumber);
        System.out.println("Maximum number of an Array is: " + MaximumNumber);
    }
}
