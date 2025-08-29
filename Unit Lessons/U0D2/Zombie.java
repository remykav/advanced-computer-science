public class Zombie {
    // instance variables (attributes)
    // green
    String skinColor = "Green";
    // rot and dead
    boolean isDead = true;
    // humans eaten count
    int humansEaten = 0;

    // main
    public static void main(String[] args) {
        Zombie phillip = new Zombie();
        phillip.eaten();
        phillip.growl();
        System.out.println(phillip.growl());
        System.out.println("Phillip ate" + phillip.humansEaten() + " humans.");

        Zombie brian = new Zombie();
        brian.eaten();
        brian.growl();
        System.out.println(brian.growl());
        System.out.println(brian.eaten());

    }

    // methods(behaviors)
    // growwl
    public String growl() {
        return "grrrrsssjhhh";
    }

    public int eaten() {
        return humansEaten;
    }

    // Challenge: make a new method that returns the number of humans eaten
}
