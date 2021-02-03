import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String[] lines = {"", "", "", "", ""};
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            lines[i] = scanner.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(lines[i]);
        }
    }
}