import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long square = 1;
        long i = 1;

        while (square <= n) {
            System.out.println(square);
            square = (long) Math.pow(++i, 2);
        }
    }
}