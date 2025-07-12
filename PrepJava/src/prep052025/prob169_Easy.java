package prep052025;

public class prob169_Easy {
    public static void main(String[] args) {

        int[] num={2,2,1,1,1,2,2};
        System.out.println(majorityElement(num));
    }

    private static int majorityElement(int[] num) {

        int mjr=0;
        int mjr_frq=0;
        int count=1;

        for (int i=1;i<num.length;i++){
            if(num[mjr]==num[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                mjr=i;
                count=1;
            }
        }

        for (int a:num){
            if(a==num[mjr]){
                mjr_frq++;
            }
        }
        return (mjr_frq>(num.length/2))?num[mjr]:-1;
    }
}
