package Training102023;
//Q:Majority Element
public class P8 {
    public static void main(String[] args) {
        int[] arr ={3,1,3,3,2}  ;
        System.out.println(majorityElement(arr,arr.length));
    }
    static int majorityElement(int a[], int size)
    {
        int mjr=0;
        int mjr_freq=0;
        int count=1;

        for (int i=1;i<size;i++){
            if (a[mjr]==a[i]){
                count++;
            }
            else{
                count--;
            }
            if (count==0){
                mjr=i;
                count=1;
            }
        }
        for (int i : a){
            if (i==a[mjr]){
                mjr_freq++;
            }
        }
            return (mjr_freq>(a.length/2))?a[mjr]:-1;
    }
}
