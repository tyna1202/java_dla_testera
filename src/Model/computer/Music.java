package Model.computer;

public interface Music {

    String NAME = "MUSIC";  //public static final String Name = "MUSIC";

    void playMusic();  // public abstract void playMusic();
    void pauseMusic();
    void stopMusic();

    // od JAVY 8

    default void sayHello() {
        System.out.println("Hello from default");
    }

    static String getName() {
        privateMethod();
        return NAME;
    }


    private static void privateMethod() {
        System.out.println("Hello from private method");
    }
}
