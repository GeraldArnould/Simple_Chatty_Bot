import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        boolean leap = false;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            leap = true;
        }
        System.out.println(leap ? "Leap" : "Regular");
    }
}