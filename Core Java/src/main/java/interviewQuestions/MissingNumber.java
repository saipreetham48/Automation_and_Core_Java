package interviewQuestions;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,6,7,8,9};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		int sum1=0;
		for (int j=1; j <=9; j++) {
			sum1+=j;
		}
		System.out.println(sum1);
		System.out.println("Missing number is:"+(sum1-sum));
	}

}
