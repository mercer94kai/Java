package src.Training102023;

public class newSumSubarr {

    public static void main(String[] args) {
        int[] arr={10,15,-5,15,-10,5};
        distElem(arr,5);
    }

    private static void distElem(int[] arr,int k) {
        int begin=-1;
        int end=-1;
        for (int i=0;i<arr.length;i++){
            int count=0;
            for (int j=i;j<arr.length;j++){
                count+=arr[j];
                if(count==k){
                    begin=arr[i];
                    end=arr[j];
                    break;
                }
            }
        }
        System.out.println(begin);
        System.out.println(end);

    }

//no sol
}
