package PrepJava.src.practice;
//Moore's Voting Algo
public class MajorElement {

	public static void main(String[] args) {
		
		int[] ip = {1,1,2,3,1};
		
		int major=0;
		int maj_freq=0;
		 int count=1;
		
		for (int i=1; i<ip.length;i++) {
			
			if (ip[i]==ip[major]) {
				count++;
			}
			else {
				count--;
			}
			if (count==0) {

				major=i;
				count=1;
			}
			//System.out.println("Major--> "+ip[major]);
			//System.out.println("Count--> "+count);
		}
		System.out.println("Index: "+major+" Element: "+ip[major]);
		for (int i : ip) {
			if (i==ip[major]) {
				maj_freq++;
			}
		}
		
		System.out.println((maj_freq>(ip.length/2))?true:false);

	}

}
