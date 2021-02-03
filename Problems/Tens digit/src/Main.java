import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        long number = scanner.nextLong();
        System.out.println((number / 10) % 10);
    }
}