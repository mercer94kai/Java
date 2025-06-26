package Training102023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class amzProb3 {
    public static void main(String[] args) {

        List<Integer> alist1=new ArrayList<>(7);
        List<Integer> alist2=new ArrayList<>(3);

        alist1.add(3);
        alist1.add(4);
        alist1.add(1);
        alist1.add(8);
        alist2.add(2);
        alist2.add(9);
        alist2.add(5);

        alist1.addAll(alist2);

        Collections.sort(alist1);

        System.out.println(alist1);

    }
}
