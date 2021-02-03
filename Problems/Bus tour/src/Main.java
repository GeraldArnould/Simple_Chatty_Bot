import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int bridges = sc.nextInt();
        int crash = 0;

        for (int i = 1; i <= bridges; i++) {
            int height = sc.nextInt();
            if (height <= n) {
                crash = i;
                break;
            }
        }

        if (crash > 0) {
            System.out.println("Will crash on bridge " + crash);
        } else {
            System.out.println("Will not crash");
        }
        
    }
}