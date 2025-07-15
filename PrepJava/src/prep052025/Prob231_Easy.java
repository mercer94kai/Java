package prep052025;

public class Prob231_Easy {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isPowerOfTwo(n));
    }

    private static boolean isPowerOfTwo(int n) {
        return (n>0) && ((n &(n-1))==0);
    }
}
