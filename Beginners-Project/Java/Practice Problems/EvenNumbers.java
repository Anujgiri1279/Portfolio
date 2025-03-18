import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) { 
        
        // Question: Print all even numbers till n (User Input)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
