package leetCode;

public class  BuySellStock1 {
	
		//7,1,5,3,6,4
		//5,2,7,3,6,1,2,4
		//3,5,1,7,4,9,3
		
	public static void main(String[] args) {
		int[] arr = {5,2,7,3,6,1,2,4};
		int profit =0;
		int buy = 0;
		int sell = 0;
		for (int i=0; i<arr.length;i++) {
			for (int j=i+1; j< arr.length;j++) {
				if (arr[j]>arr[i]) {
				  if (profit<arr[j]-arr[i]) {
					  profit = arr[j]-arr[i];
					  buy=i;sell=j;
				  }
				}
			}
			
		}
		System.out.println("Buy and sell Day : "+ ++buy +" "+ ++sell);
	}
}
