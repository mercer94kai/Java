package practice;

public class upperLower {

	public static void main(String[] args) {
		
		String[] arr = {"kaiFA","avANti"};
		for (int i=0; i<arr.length; i++) {
			arr[i]=arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1, arr[i].length()).toLowerCase();
			System.out.println(arr[i]);
		}
	}
}
