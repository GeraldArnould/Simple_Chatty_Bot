import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        int numRoots = 0;

        for (int i = 0; i <= 1000; i++) {
            if (cubic(a, b, c, d, i) == 0) {
                numRoots++;
                System.out.println(i);
                if (numRoots == 3) {
                    break;
                }
            }
        }
    }

    static long cubic(long a, long b, long c, long d, int x) {
        return (long) (a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d);
    }
}