package Java09;
class CCount {
	private static int cnt = 0;
	public CCount() {	//(a)
		count();
	}
	private void count() {
		cnt++;
	}
	public static void setZero() {	//(b)
		cnt = 0;
	}
	public static void setValue(int n) {	//(c)
		cnt = n;
	}
	public  static void show() {
		System.out.println("cnt = "+cnt);
	}
}

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCount cn1 = new CCount();
		CCount cn2 = new CCount();
		CCount.show();
		
		CCount.setZero();
		System.out.println("setZero()");
		CCount.show();
		
		CCount.setValue(10);
		System.out.println("setValue(10)");
		CCount.show();
	}
}
//(d) cnt使用類別變數，cnt計算CCount類別建立的物件，cnt宣告類別變數讓所有CCount的物件都能使用。
//(e) count() method 宣告實例或類別函數都可以
