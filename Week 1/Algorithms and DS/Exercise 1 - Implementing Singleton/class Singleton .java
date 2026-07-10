class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton instance;

    // Step 2: Make the constructor private so no other class can create object
    private Singleton() {
        System.out.println("Singleton object created!");
    }

    // Step 3: Create a public static method to provide the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello! This is Singleton Pattern.");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        // Access the singleton object
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        // Try to create another reference
        Singleton obj2 = Singleton.getInstance();

        // Check if both references point to the same object
        if (obj1 == obj2) {
            System.out.println("Both obj1 and obj2 refer to the same instance.");
        } else {
            System.out.println("Different instances created.");
        }
    }
}