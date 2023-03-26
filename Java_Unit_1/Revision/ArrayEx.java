import java.util.Scanner;

public class ArrayEx{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int size,sum;
        float average;

        System.out.println("Enter size of array to enter");
        size = sc.nextInt();

        int[] arr = new int[size];
        sum = 0;

        System.out.println("Enter elements in the array");

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        average = (float)sum / size;

        System.out.println("Sum : " + sum + " Average : "+ average);
    }
}