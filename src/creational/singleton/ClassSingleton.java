package creational.singleton;

class Singleton {

    private static Singleton instance;

    private Singleton() {
    } //private constructor

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class ClassSingleton {
    public static void main(String[] args) {
        System.out.println("--- Creational.Singleton Pattern ---");
        Singleton single1 = Singleton.getInstance();
        Singleton single2 = Singleton.getInstance();
        if (single1.equals(single2)) {
            System.out.println("Unique Instance");
        }
    }
}
