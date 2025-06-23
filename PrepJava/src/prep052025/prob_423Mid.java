package prep052025;

/*
'z'ero
'o'ne
t'w'o
t'h'ree
fo'u'r
'f'ive
si'x'
's'even
ei'g'ht
n'i'ne
 */

public class prob_423Mid {
    public static void main(String[] args) {
        String s="fviefuro";
        System.out.println(originalDigits(s));
    }

    private static String originalDigits(String s) {

        int[] num=new int[10];

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='z')num[0]++;
            if(c=='o')num[1]++;//1-0-2-4
            if(c=='w')num[2]++;
            if(c=='h')num[3]++;//3-8
            if(c=='u')num[4]++;
            if(c=='f')num[5]++;//5-4
            if(c=='x')num[6]++;
            if(c=='s')num[7]++;//7-6
            if(c=='g')num[8]++;
            if(c=='i')num[9]++;//9-8-6-5
        }
        num[7]-=num[6];
        num[5]-=num[4];
        num[3]-=num[8];
        num[9]=num[9]-num[8]-num[5]-num[6];
        num[1]=num[1]-num[0]-num[2]-num[4];
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<=9;i++){
            for(int j=0;j<num[i];j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
