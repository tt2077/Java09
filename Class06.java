package Java09;
class add {
	public static void add2n(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++)
			sum += i;
		System.out.println("1+2+...+"+n+"="+sum);
	}
}

public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add.add2n(5);
		add.add2n(10);
	}

}
