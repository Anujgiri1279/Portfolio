import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows 
        int m = sc.nextInt(); // columns 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
