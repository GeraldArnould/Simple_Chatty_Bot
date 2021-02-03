import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String ref = sc.next().toLowerCase();

        System.out.println(ref.charAt(0) == 'j');
    }
}