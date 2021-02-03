import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] digits = {num / 1000, (num / 100) % 10, (num / 10) % 10, num % 10};
        if (digits[0] == digits[3] && digits[1] == digits[2]) {
            System.out.println(1);
        } else {
            System.out.println(42);
        }
    }
}