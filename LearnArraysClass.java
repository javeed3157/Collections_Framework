import java.util.Arrays;

public class LearnArraysClass{
    public static void main(String[] args) {
        int[] numbers={2,1,3,5,6,4,8,7,9};
        int index=Arrays.binarySearch(numbers, 4);
        Arrays.sort(numbers);
        for(int i:numbers){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(index);
        int[] arr={4,3,2,1};
        Arrays.fill(arr, 10);
        for(int i:numbers){
            System.out.print(i+" ");
        }
    }
}