/**
 * Utility class that prints a star pattern.
 */
public final class Main {

    /**
     * Number of rows used to print the star pattern.
     */
    private static final int NUM = 5;

    private Main() {
        // Prevent instantiation
    }

    /**
     * Program entry point.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {

        for (int i = 1; i <= NUM; i++) {
            for (int j = i; j <= NUM; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
