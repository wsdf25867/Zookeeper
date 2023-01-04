import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int theLargest = 0;
        int n = 0;
        do {
            n = scanner.nextInt();
            theLargest = theLargest <= n ? n : theLargest;
        } while (n != 0);
        System.out.println(theLargest);
    }
}