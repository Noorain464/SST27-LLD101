
public class Demo05 {
    static int areaAfterResize(Rectangle r){
        r.setWidth(5); r.setHeight(4); return r.area();
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,4);
        System.out.println(r.area()); // 20

        Square s = new Square(4);
        System.out.println(s.area()); // 25

    }
}
