
public class BubbleSort {
	
	public static void BubbleSort(int[] arr) {
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i;j++) {
				if(arr[j-1] > arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}


public static void main(String[] args) {
	int[] arr= {50,20,40,80,10,60,30,70};
	BubbleSort(arr);
	System.out.println("Sorted Using BubbleSort Algorithm: ");
	for(int i: arr) {
	System.out.print(i+" ");
	}

}

}
