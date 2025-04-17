package importantConcepts;

public class LambdaSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum s1=(a,b)->a+b;
		System.out.println(s1.add(45, 98));

	}

}
@FunctionalInterface
interface sum {
	public int add(int a,int b);
	
}
