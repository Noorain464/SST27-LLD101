public class BasicPrinter implements Printer, Scanner, Fax {
    public void print(String text){ System.out.println("Print: "+text); }
    public void scan(String path){ System.out.println("Scan to: "+path); }
    public void fax(String number){ System.out.println("Fax to: "+number); }
}