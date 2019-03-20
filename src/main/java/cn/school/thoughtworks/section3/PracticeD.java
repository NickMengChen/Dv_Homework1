package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeD {




    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {

        if (collectionA.isEmpty() || object.isEmpty())
            return null;

        Map<String, Integer> Result = new HashMap<String, Integer>();
        Set<String> Mutiple = new HashSet();    //add a set store duplicate value
        for (String x : collectionA)
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

        for (String key : object.keySet()) {
            for (String y : object.get(key)) {
                if (Result.containsKey(y)) {
                    int NewValue = Result.get(y);
                    NewValue -= NewValue/3;
                    Result.put(y, NewValue);
                }
            }
        }



        //Exists.removeAll(noExists);








        return Result;


    }
}
