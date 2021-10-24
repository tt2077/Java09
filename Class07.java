package Java09;
class Power {
	public static void power(int x, int n) {
		int sum=1;
		for(int i = 1; i <= n; i++)
			sum *= x;
		System.out.println(x+"ªº"+n+"¦¸¤è = "+sum);
	}
}

public class Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power.power(2,5);
		Power.power(3, 2);
	}

}
