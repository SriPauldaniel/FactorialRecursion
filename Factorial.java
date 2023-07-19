import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findFact(n));
        sc.close();
    }

    static int findFact(int n) {
        if(n == 0) {
            return 1;
        }
        return findFact(n-1)*n;
    }
}