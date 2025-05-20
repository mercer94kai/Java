package src.prep052025;

public class prob_1963Mid_OPT {

    public static void main(String[] args) {

        String s="]]][[[";
        System.out.println(minSwap(s));
    }

    private static int minSwap(String s) {

        int stackSize=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                stackSize++;
            }
            else{
                if(stackSize>0){
                    stackSize--;
                }
            }
        }

        return (stackSize+1)/2;
    }

}
