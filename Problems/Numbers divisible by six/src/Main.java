import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int numElem = sc.nextInt();

        int acc = 0;

        for (int i = 0; i < numElem; i++) {
            int nextNum = sc.nextInt();
            if (nextNum % 6 == 0) {
                acc += nextNum;
            }
        }
        System.out.println(acc);
    }
}