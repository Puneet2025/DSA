import java.util.Scanner;
public class sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number of digits to sum:- ");
        int n = sc.nextInt();
        sum += (n*(n+1))/2;
        System.out.println("The sum of " + n + " digits is:- " +sum);
    }
}
