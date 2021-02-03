import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int numParts = sc.nextInt();
        int perfect = 0;
        int fix = 0;
        int reject = 0;

        for (int i = 0; i < numParts; i++) {
            int part = sc.nextInt();
            if (part == 0) {
                perfect++;
            } else if (part == -1) {
                reject++;
            } else {
                fix++;
            }
        }
        System.out.println(perfect + " " + fix + " " + reject);
    }
}