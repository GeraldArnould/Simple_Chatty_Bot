import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int acc = 0;

        for (int i = a; i <= b; i++) {
            acc += i;
        }

        System.out.println(acc);
    }
}