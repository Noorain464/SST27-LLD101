public class BasicPrinter implements Printer,Scanner{
    //SRP violation 
    //ISP violation
    public void print(String text){ System.out.println("Print: "+text); }
    public void scan(String path){ throw new UnsupportedOperationException(); }
}