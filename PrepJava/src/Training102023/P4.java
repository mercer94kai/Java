package Training102023;

//Q: Minimum number of jumps
public class P4 {
    public static void main(String[] args) {
        int arr[] = {9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1};
        System.out.println(minJumps(arr));

    }

    public static int minJumps(int[] arr) {

        int jump = 0;
        int posi = 0;
        int dest = 0;

        for(int i=0; i<arr.length-1; i++){
            // find maximum destinattion
            dest = Math.max(dest, arr[i]+i);
            //The position is equal to our index than
            if(posi == i){
                posi = dest;
                jump++;
            }
        }
        // position is less than or equal to length-1
        if(posi >=arr.length-1)
        {
            return jump;
        }
        // else return -1
        return -1;
    }
}