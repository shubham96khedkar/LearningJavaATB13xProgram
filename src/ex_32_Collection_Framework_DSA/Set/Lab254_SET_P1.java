package ex_32_Collection_Framework_DSA.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab254_SET_P1 {

    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts  = new TreeSet();


        hs.add("Pramod");
        hs.add("Pramod");
//As Set does not store duplicate value,so in output Pramod will be only one time
        hs.add("Dutta");
        System.out.println(hs);




    }
}
