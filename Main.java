import java.util.*;

 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         scanner.nextLine();
         String[] arr = new String[n];

         for (int i = 0; i < n; i++) {
             arr[i] = scanner.nextLine();
         }

         System.out.println(Arrays.toString(arr));
        
     }
 }