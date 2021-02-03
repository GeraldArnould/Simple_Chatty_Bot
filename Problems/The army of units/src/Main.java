import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        String category;

        if (units < 1) {
            category = "no army";
        } else if (units < 20) {
            category = "pack";
        } else if (units < 250) {
            category = "throng";
        } else if (units < 1000) {
            category = "zounds";
        } else {
            category = "legion";
        }

        System.out.println(category);
    }
}