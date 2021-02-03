import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean weekendFeast = numCups >= 15 && numCups <= 25 && weekend;
        boolean weekFeast = numCups >= 10 && numCups <= 20 && !weekend;
        System.out.println(weekendFeast || weekFeast);
    }
}