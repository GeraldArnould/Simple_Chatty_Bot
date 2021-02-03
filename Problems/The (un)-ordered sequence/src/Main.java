import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int cur = sc.nextInt();
        boolean result = true;
        int next = sc.nextInt();

        int order = 0;

        while (next > 0) {
            // Ascending or descending is determined by the order of the first 2 different
            // consecutive numbers
            while (cur == next) {
                next = sc.nextInt();
            }
            if (order == 0) {
                order = cur < next ? 1 : -1;
            }
            if (next == 0) {
                break;
            }
            if (cur * order > next * order) {
                result = false;
                break;
            }
            cur = next;
            next = sc.nextInt();
        }
        System.out.println(result);
    }
}