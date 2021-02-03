import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String ref = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println(ref.substring(a, b + 1));
        } else {
            System.out.println(ref.substring(b, a + 1));
        }
    }
}