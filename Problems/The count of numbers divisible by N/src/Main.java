import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int result = (b - a) / n + 1;

/*        if (a % n == 0 || b % n == 0) {
            result++;
        }*/

        System.out.println(Math.max(result, 0));
    }
}