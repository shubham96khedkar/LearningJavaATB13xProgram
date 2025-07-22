package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab250_AL_Interview {

    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);
//From above line,Collections.sort will sort in ascending order
//Remember that Collections is class and Collection is Interface.Both are different
        System.out.println(marks);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, queue may require)

        Collections.sort(marks,Collections.reverseOrder());
//From above line,it will sort in descending order
        System.out.println(marks);



    }
}
