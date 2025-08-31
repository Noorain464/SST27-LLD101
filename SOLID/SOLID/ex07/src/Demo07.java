public class Demo07 {
    public static void main(String[] args) {
        Printer m = new BasicPrinter();
        Scanner s = new BasicPrinter();
        m.print("Hello");
        s.scan("/tmp/out"); // blows up
    }
}
