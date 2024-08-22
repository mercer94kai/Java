package src.PracticeLab2024;

public class firstunique_ASCII {
    public static void main(String[] args) {

        String s="aacbeb";
        System.out.println(unique(s));
    }

    private static int unique(String s) {

        int[] map=new int[200];

        for (int i=0;i<s.length();i++){
            if (map[s.charAt(i)]==0){
                map[s.charAt(i)]=1;
            }
            else{
                map[s.charAt(i)]=-1;
            }
        }

        for (int i=0;i<s.length();i++){
            if (map[s.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
