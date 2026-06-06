import java.util.*;
public class Rotatektimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for (int i=1;i<=k;i++){
            int temp =arr[n-1];
            for(int j=n-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
