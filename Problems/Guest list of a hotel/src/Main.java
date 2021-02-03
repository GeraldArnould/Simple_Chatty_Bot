import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int beds = 8;
        String[] name = new String[beds];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < beds; i++) {
            name[i] = scanner.next();
        }
        for (int i = beds - 1; i >= 0; i--) {
            System.out.println(name[i]);
        }
    }
}