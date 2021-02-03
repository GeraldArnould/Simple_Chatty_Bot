import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String firstLine = sc.nextLine().replaceAll("\\s+", "");
        String secondLine = sc.nextLine().replaceAll("\\s+", "");

        System.out.println(firstLine.equals(secondLine));
    }
}