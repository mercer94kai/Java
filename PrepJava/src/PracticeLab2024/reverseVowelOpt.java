package src.PracticeLab2024;

public class reverseVowelOpt {
    public static void main(String[] args) {

        String s="hello";
        System.out.println(revVowel(s));
    }

    private static String revVowel(String s) {

        boolean[] isVowels = new boolean['z' + 1];
        isVowels['a'] = true;
        isVowels['e'] = true;
        isVowels['i'] = true;
        isVowels['o'] = true;
        isVowels['u'] = true;
        isVowels['A'] = true;
        isVowels['E'] = true;
        isVowels['I'] = true;
        isVowels['O'] = true;
        isVowels['U'] = true;

        int left = 0, right = s.length() - 1;
        char[] result = s.toCharArray();

        while (left < right) {
            while (left < right && !isVowels[result[left]]) {
                left++;
            }
            while (left < right && !isVowels[result[right]]) {
                right--;
            }
            char tmp = result[left];
            result[left] = result[right];
            result[right] = tmp;
            left++;
            right--;
        }
        return new String(result);
    }


}
