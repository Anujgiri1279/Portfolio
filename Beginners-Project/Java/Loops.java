public class Loops {
    public static void main(String[] args){
        // For Loop 
        // Syntax: for(initialization; condition; increment/decrement/updation){
        // code to be executed
        // }
        // Example: Print numbers from 1 to 10
        System.out.println("For Loop Output:");
        for(int i = 1; i <=10 ; i++){    // Here i++ can also be written as i = i + 1
        System.out.println(i);} 
        // Output: 1 2 3 4 5 6 7 8 9 10 (In Different lines as println is used instead of print)


        // while loop 
        // Syntax: while(condition){
        // code to be executed
        // }
        // Example: Print numbers from 1 to 10
        System.out.println("While Loop Output:");
        int j = 1;
        while(j <= 10){
            System.out.println(j);
            j++;
        }
        // Output: 1 2 3 4 5 6 7 8 9 10 (In Different lines as println is used instead of print)


        // do while loop
        // In do while loop, the code is executed atleast once even if the condition is false
        //synatax : do{
        // code to be executed
        // }while(condition);
        // Example: Print numbers from 1 to 10
        System.out.println("Do While Loop Output:");
        int k = 1;
        do{
            System.out.println(k);
            k++;
        }while(k <= 10); 
        // Output: 1 2 3 4 5 6 7 8 9 10 (In Different lines as println is used instead of print)
        }
    }
// We can also take user input and use loops to perform operations on them. using Scanner class
