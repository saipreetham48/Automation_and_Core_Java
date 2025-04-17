package operators;

public class OperatorsDemo {
	public static void main(String[] args) {

		int a = 3;
		int c = a;
		int d = a + 1;
		int e = a--;
		int b = a++;
		String bdef = "wrg";

		int num = 10;
		num++;// 10
		num--;// 11

		int ad = 30;
		ad--;// 30
		++ad;// 30
		ad++;// 30
		--ad;// 30
		System.out.println(ad);// 30

		// (<,>,!)

		int af = 10;
		int bf = 20;
		// 10 = 0 1 0 1 0
		// 20 = 1 0 1 0 0
		// & = 0 0 0 0 0
		// | = 1 1 1 1 0
		System.out.println(af & bf);
		System.out.println(af | bf);
	}

}
