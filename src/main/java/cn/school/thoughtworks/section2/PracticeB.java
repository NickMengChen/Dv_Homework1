package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        if (collection1.isEmpty())
            return null;
        Map<String, Integer> Result = new HashMap<String, Integer>();
        Set<String> Mutiple = new HashSet();    //add a set store duplicate value
        for (String x : collection1)
        {
            //check string
            String Pattern = "[a-zA-z]-[0-9]+";
            if (x.matches(Pattern))
            {
                String [] str = x.split("-");
                Result.put(str[0], Integer.parseInt(str[1]));
                continue;
            }

            //if duplicated, count++
            if (Mutiple.contains(x))
                Result.put(x, Result.get(x)+1);
            else
            {
                Mutiple.add(x);
                Result.put(x, 1);
            }
        }
        return Result;
    }
}
