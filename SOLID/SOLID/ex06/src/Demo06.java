public class Demo06 {
    public static void main(String[] args) {
        Flyable f = new Eagle();
        new Aviary().release(f);
        // new Aviary().release(new Penguin()); // runtime error
    }
}
