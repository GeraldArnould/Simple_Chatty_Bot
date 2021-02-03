import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int minSleepHours = sc.nextInt();
        int maxSleepHours = sc.nextInt();
        int sleepHours = sc.nextInt();

        if (sleepHours < minSleepHours) {
            System.out.println("Deficiency");
        } else if (sleepHours <= maxSleepHours) {
            System.out.println("Normal");
        } else {
            System.out.println("Excess");
        }
    }
}