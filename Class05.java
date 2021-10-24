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
//(d) cnt�ϥ����O�ܼơAcnt�p��CCount���O�إߪ�����Acnt�ŧi���O�ܼ����Ҧ�CCount�����󳣯�ϥΡC
//(e) count() method �ŧi��ҩ����O��Ƴ��i�H
