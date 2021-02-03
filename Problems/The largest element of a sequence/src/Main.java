import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n;
        int max = 0;

        while ((n = sc.nextInt()) > 0) {
            max = Math.max(n, max);
        }
        System.out.println(max);
    }
}