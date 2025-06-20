public class Singletonpattern {

    // Step 1: Private static instance of the same class
    private static Singletonpattern instance;

    // Step 2: Private constructor to prevent instantiation
    private Singletonpattern() {
        System.out.println("Singleton object created.");
    }

    // Step 3: Public method to provide access to the instance
    public static Singletonpattern getInstance() {
        if (instance == null) {
            instance = new Singletonpattern();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singletonpattern!");
    }

    // Main method to test the Singleton
    public static void main(String[] args) {
        Singletonpattern obj1 = Singletonpattern.getInstance();
        Singletonpattern obj2 = Singletonpattern.getInstance();

        obj1.showMessage();

        // Check if both objects are the same
        if (obj1 == obj2) {
            System.out.println("Only one instance exists.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}

