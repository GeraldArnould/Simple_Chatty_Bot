//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int fields = 5;
        String[] lines = new String[fields];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < fields; i++) {
            lines[i] = scanner.nextLine();
        }

        System.out.printf("The form for %s is completed. " +
                "We will contact you if we need a chef that " +
                "cooks %s dishes.", lines[0], lines[4]);
    }
}