public class Bicycle implements Pedalable {
    //LSP violation if we implement startEngine() and recharge()
    //ISP violation 
    // public void startEngine(){ throw new UnsupportedOperationException(); }
    public void pedal(int effort){ System.out.println("Pedal effort " + effort); }
    // public void recharge(int kWh){ throw new UnsupportedOperationException(); }
}