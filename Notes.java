public class Notes {
    public static void main(String[] args) {
        
        int sum = 0;
        for (int j = 3; j <= 79; j++) {
            sum += j;
        }
        System.out.println("Sum from 3 to 79 = " + sum); // 3157

        for (int j = 1; j <= 10; j++) {
            if (j == 5) break; // exit loop early
            System.out.print(j + " ");
        }
        System.out.println("\nExcited at j=5");

        int total = 0;
        for (int j = 1; j <= 5; j++)
            total += j; // braces optional
        System.out.println("Sum from 1 to 5 = " + total);

        for (int j = 1; j <= 20; j += 4) {
            System.out.print(j + " "); // increments by 4
        }
        System.out.println("\nFinished loop");
    }
}
