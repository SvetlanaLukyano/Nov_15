import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("PLease set K - the length of your array");
        int k = scanner.nextInt();
        System.out.println("Please enter your array elements");
        int arr[] = new int[k];
        boolean resume = false;

        for (int i = 0; i < k; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < k; i++) {
            if (arr[i] == arr[i + 1]) {
                resume = true;
                System.out.println(resume);
            } else {
                resume = false;
                System.out.println(resume);
            }
        }
        if (resume == false) System.out.println("No");
        else {
            System.out.println("Yes");
        }
        }
    }



