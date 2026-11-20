import java.util.*;

public class ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int pass = 0; pass < n-1; pass++) {
            boolean swapped = false;

            for(int i = 0;i< n-1-pass;i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
            System.out.print("pass :");
            System.out.println(pass);
            System.out.println(arr.toString());
            
        }

    System.out.println(arr.toString());
    }
}
