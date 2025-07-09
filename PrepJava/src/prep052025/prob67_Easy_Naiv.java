package prep052025;

public class prob67_Easy_Naiv {
    public static void main(String[] args) {
         String a="1010";
         String b="1011";
        System.out.println(addBinary(a,b));
    }

    private static String addBinary(String a, String b) {

        int i=Integer.parseInt(a,2);
        int j=Integer.parseInt(b,2);

        int sum=i+j;

        return Integer.toBinaryString(sum);
    }
}
