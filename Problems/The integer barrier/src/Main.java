import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        long cur = sc.nextLong();
        long sum = 0;


        while (cur != 0) {
            sum += cur;
            if (sum >= 1_000) {
                sum -= 1_000;
                break;
            }
            cur = sc.nextLong();
        }

        System.out.println(sum);
    }
}