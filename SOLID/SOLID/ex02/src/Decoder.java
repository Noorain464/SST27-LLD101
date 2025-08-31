public class Decoder implements Decode {
    public Frame decode(byte[] data) {
        return new Frame(data); 
    }
    
}
