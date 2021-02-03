import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int poleHeight = scanner.nextInt();
        int feetUp = scanner.nextInt();
        int feetDown = scanner.nextInt();

        // X jours et nuits ou il fait feetUp - feetDown
        // dernier jour ne fait que monter de feetUp
        // en X + 1 jours, il aura monté de X * (feetUp - feetDown) + feetUp
        // H <= X * (A - B) + A
        // (H - A) / (A - B) <= X
        int minDays = (poleHeight - feetUp) / (feetUp - feetDown);
        int remainingDay = (poleHeight - feetUp) % (feetUp - feetDown);
        System.out.println(minDays + (remainingDay > 0 ? 1 : 0) + 1);
        // Better solution
        // System.out.println((poleHeight - feetUp - 1) / (feetUp - feetDown) + 1)
    }
}