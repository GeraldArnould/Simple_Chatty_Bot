import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int[] queen1 = {sc.nextInt(), sc.nextInt()};
        int[] queen2 = {sc.nextInt(), sc.nextInt()};
        boolean hit = false;

        // Same line or row
        if (queen1[0] == queen2[0] || queen1[1] == queen2[1]) {
            hit = true;
        } else if (Math.abs(queen1[0] - queen2[0]) == Math.abs(queen1[1] - queen2[1])) {
            hit = true;
        }
        System.out.println(hit ? "YES" : "NO");
    }
}