package Java09;
class Cwin {	//(a)
	private String color;
	private int width;
	private int height;
	private static int cnt = 0;
	
	public Cwin(String str,int w,int h) {	//(b)
		String color = str;
		int width = w;
		int height = h;
		count();
	}
	public Cwin() {		//(c)
		this("Red",2,2);
	}
	private void count() {
	// TODO Auto-generated method stub
		cnt++;
	}
	public static void setZero() {		//(d)
		cnt = 0;
	}
	public static void setValue(int n) { 	//(e)
		cnt = n;
	}
	public static void show() {
		System.out.println("cnt = "+cnt);	}
	
}
public class Classs08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cwin w1 = new Cwin();
		Cwin w2 = new Cwin("Red",2,2);
		Cwin.show();
		
		Cwin.setZero();
		System.out.println("setZero()");
		Cwin.show();
		
		Cwin.setValue(1);
		System.out.println("setValue(1)");
		Cwin.show();
	}
}
//(f) cnt要用類別變數，cnt要用來計算Cwin建立的物件個數，宣告類別變數讓全部Cwin共用
//(g) count() 實例函數或類別函數都可以定義
