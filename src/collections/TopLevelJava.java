package collections;

// importing a Kotlin class in Java
import collections.StringFunctions.*;

import java.util.*;
import java.util.ArrayList;

public class TopLevelJava {

    public static void main (String args[]){
        List<Integer> list = new ArrayList() ;
        list.add (-209);
        list.add (3);
        list.add (8972);
        list.add (327);
        list.add (100);

        // Calling it just like normal java method.
        String result = StringFunctions.oldJoinToString (list, ", ", "", "" );
        System.out.println (result);
        StringFunctions.reportOperation();

    }
}
