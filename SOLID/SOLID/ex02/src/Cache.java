public class Cache {
    Frame last;
    void store(Frame f){
        last = f;
    }
    Frame getLast(){
        return last;
    }
}
