import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int divisibleBy3 = 0;
        double result = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                result += i;
                divisibleBy3++;
            }
        }
        System.out.println(result / divisibleBy3);
    }
}