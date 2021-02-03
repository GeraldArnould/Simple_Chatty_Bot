import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int idx = 1;
        int cur = 1;

        while (idx <= n) {
            for (int i = 1; i <= cur; i++) {
                if (idx > n) {
                    break;
                }
                System.out.print(cur + " ");
                idx++;
            }
            cur++;
        }
    }
}