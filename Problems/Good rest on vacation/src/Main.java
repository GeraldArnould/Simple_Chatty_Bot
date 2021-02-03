import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int oneNightCost = scanner.nextInt();

        System.out.println(duration * foodCost + 2 * oneWayFlightCost + (duration - 1) * oneNightCost);
    }
}