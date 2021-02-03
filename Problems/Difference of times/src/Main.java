import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        long firstMoment = scanner.nextInt() * 3600L + scanner.nextInt() * 60L + scanner.nextInt();
        long secondMoment = scanner.nextInt() * 3600L + scanner.nextInt() * 60L + scanner.nextInt();

        System.out.println(secondMoment - firstMoment);
    }
}