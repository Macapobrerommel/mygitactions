package factory;

/**
 * Singleton implementation.
 */
public final class Singleton {

    /** The single instance of the Singleton. */
    private static Singleton instance;

    /**
     * Private constructor to prevent instantiation.
     */
    private Singleton() {
        System.out.println("Singleton is Instantiated.");
    }

    /**
     * Returns the singleton instance.
     *
     * @return singleton instance
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Performs an example action.
     */
    public static void doSomething() {
        System.out.println("Something is Done.");
    }
}

/**
 * Application entry point.
 */
final class GFG {

    /**
     * Hidden constructor.
     */
    private GFG() {
    }

    /**
     * Main method.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        Singleton.getInstance().doSomething();
    }
}
