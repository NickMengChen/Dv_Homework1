package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        if (collection1.isEmpty())
            return null;
        Map<String, Integer> Result = new HashMap<String, Integer>();
        Set<String> Mutiple = new HashSet();    //add a set store duplicate value
        for (String x : collection1)
        {
            //check string
            String str = x;
            String numberOnly = x;
            if (x.length() > 1)
            {
                str= str.replaceAll("[^a-zA-Z]", "");
                numberOnly= numberOnly.replaceAll("[^0-9]", "");
            }
            else
            {
                str = x;
                numberOnly = "1";
            }

            if (Mutiple.contains(str))
                Result.put(str, Result.get(str)+Integer.parseInt(numberOnly));
            else
            {
                Mutiple.add(str);
                Result.put(str, Integer.parseInt(numberOnly));
            }
        }
        return Result;

    }
}
