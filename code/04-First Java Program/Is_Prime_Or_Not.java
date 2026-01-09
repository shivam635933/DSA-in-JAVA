import java.util.Scanner;

public class Is_Prime_Or_Not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = in.nextInt();
        if(n <= 1) {
            System.out.println("To find out prime number. Number should be greater than 1.");
            return;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("Not Prime");
                return;
            }
            c = c + 1;
            // c++;
        }
        if (c * c > n) {
            System.out.println("Prime");
        }
        
    }
}
