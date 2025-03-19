import java.util.*;
public class FloydTriangle {
    public static void main(String[] args) {
        int a = 1; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number To Make a Stair");
        int b = sc.nextInt();
        for(int i = 1; i <= b; i++){
            for(int j = 1 ; j <=i ; j++){
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
    }
}
}
