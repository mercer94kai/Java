package src.PracticeLab2024;

//Q:Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.


public class singleNumXOR {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singlenum(arr));
    }

    private static int singlenum(int[] arr) {
        int ans=0;
        for (int i:arr){
            ans^=i;
        }
        return ans;
    }
}
