package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        if (collection1.isEmpty())
            return null;
        Map<String, Integer> Result = new HashMap<String, Integer>();
        Set<String> Mutiple = new HashSet();    //add a set store duplicate value
        for (String x : collection1)
        {
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
