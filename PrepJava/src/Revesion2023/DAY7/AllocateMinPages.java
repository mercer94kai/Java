package PrepJava.src.Revesion2023.DAY7;

// Complexity : O(n*logn)
//Desc: Minimise the maximum numbers of pages read by a student
public class AllocateMinPages {
    public static void main(String[] args) {
        int[] arr ={10,20,5,15,5};
        System.out.println(minPages(arr,2));
    }

    public static int minPages(int[] a, int k){

        int min=maxOf(a);
        int max=sumOf(a);
        int res=0;
        while (min<=max){
            int mid=(min+max)/2;
            if (isfeasible(a,k,mid)){
                res=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return res;
    }

    private static boolean isfeasible(int[] a, int k, int res) {
        int stud=1;
        int sum=0;
        for (int i=0;i<a.length;i++){
            if (sum+a[i] > res){
                stud++;
                sum=a[i];
            }
            else{
                sum+=a[i];
            }
        }
        return stud<=k;
    }

    private static int sumOf(int[] a) {

        int sum=0;
        for (int i:a){
            sum+=i;
        }
        return sum;
    }

    private static int maxOf(int[] a) {

        int maxval=0;
        for (int i:a){
            if (maxval<i){
                maxval=i;
            }
        }
        return maxval;
    }
}
