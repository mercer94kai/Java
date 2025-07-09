package prep052025;

public class prob67_Easy_Opt {
    public static void main(String[] args) {
         String a="11";
         String b="1";
        System.out.println(addBinary(a,b));
    }

    private static String addBinary(String a, String b) {

        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;

        StringBuilder res= new StringBuilder();

        while (i>=0 || j>=0){
            int sum=carry;
            if (i>=0){
                sum+=a.charAt(i--)-'0';
            }
            if (j>=0){
                sum+=b.charAt(j--)-'0';
            }
            carry=(sum>1)?1:0;
            res.append(sum%2);
        }
        if(carry!=0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
