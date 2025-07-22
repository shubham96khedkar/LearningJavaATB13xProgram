package ex_31_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab239_Generics_List {

    public static void main(String[] args) {
        List normalList = new ArrayList();
//Generics will be used in collection.So list can also be generic
//In line no.9 even if nothing is used before normalList variable then it means that this <T> is used there which means we can use any datatype there
        normalList.add(10);
        normalList.add("Pramod");
        normalList.add(true);

        List<Integer> integerList = new ArrayList();
        integerList.add(10);
        // integerList.add("Pramod");
//From line no.16 only integers will be allowed here.If we try to add string,then it will show error as in above commented line.
    }
}
