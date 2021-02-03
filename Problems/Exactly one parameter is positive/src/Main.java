import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        boolean n1 = scanner.nextInt() > 0;
        boolean n2 = scanner.nextInt() > 0;
        boolean n3 = scanner.nextInt() > 0;
        boolean isPos1 = !n1 && !n2 && n3;
        boolean isPos2 = !n1 && n2 && !n3;
        boolean isPos3 = n1 && !n2 && !n3;
        System.out.println(isPos1 || isPos2 || isPos3);
    }
}