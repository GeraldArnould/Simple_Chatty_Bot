import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();

        if (city.length() > 4) {
            System.out.println(city.endsWith("burg"));
        } else {
            System.out.println(false);
        }
    }
}