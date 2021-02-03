import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cur;
        int max = 0;

        while (n > 0) {
            cur = sc.nextInt();
            if (cur % 4 == 0) {
                max = Math.max(max, cur);
            }
            n--;
        }
        System.out.println(max);
    }
}