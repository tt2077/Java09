package Java09;
class CRectangle
{
    int width;
    int height;

public CRectangle (int w, int h) {
    width = w;
    height = h;
    System.out.println("CRectangle(int w, int h)");
}
public CRectangle () {
    width = 10;
    height = 8;
    System.out.println("CRectangle()");
}
public void show() {
    System.out.println("width = "+width);
    System.out.println("height = "+height);
}
}
public class Class01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CRectangle rec1 = new CRectangle(1,1);
        rec1.show();
        CRectangle rec2 = new CRectangle();
        rec2.show();
    }
}