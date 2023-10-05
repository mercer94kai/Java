package Training102023;

//Q: Palingdrome number
    public class Problem2 {
    public boolean isPalindrome(int x) {
        int sum=0;
        int k=x;
        while (x>0){
            sum=sum*10+(x%10);
            x=x/10;
        }
        return (sum==k)?true:false;
    }
}
