package practiceGFG;

public class MinimumNoOfJumpsGFG {

	public static void main(String[] args) {
		
		int[] arr = {2,3,1,1,2,4,2,0,1,1}  ;
		//System.out.println(minJumps(arr));
		minJumps(arr);
	}
		
		public static void minJumps(int[] arr){
	        int i=0;
			int count=0;
			while (i<arr.length && arr[i]!=0) {
				System.out.println(i+" "+count);
				if(i==arr.length-1) {
					break;
				}
				else {
					i+=arr[i];
					count++;
				}
			}
		
			//return (i>=arr.length-1)?count:-1;
	    }
}
