package rahulsheettyInterview;

public class PrintOnlyDuplicates {

	public static void main(String[] args) {
		int arr[] = {4,65,87,6,4,87,65,87};
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = i; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					//System.out.print(arr[i]+" ");
					count++;
				}
				
			}
			if(count>=2)
				System.out.println(arr[i]+" ");
			
			
		}
	}

}
