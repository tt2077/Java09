package Java09;
class Caaa //定義類別Caaa
{
    private int value;

    public Caaa() 
    {
        value = 10;
        System.out.println("value = "+value); //(a)
    }
    public Caaa(int i)
    {
        value = i;
        System.out.println("value = "+value);
    }
}

public class Class03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Caaa obj1 = new Caaa();
        Caaa obj2 = new Caaa(12);

    }

}
// (b) 21行會呼叫第6行 22行會呼叫第11行
// (c) 不可以，只能有一個public，若要改的話也要把檔案名稱改成Caaa.java
// (d) 不會有影響，因為這個value沒有被其他類別所使用