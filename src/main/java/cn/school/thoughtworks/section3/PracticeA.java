package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        if (collectionA.isEmpty() || object.isEmpty())
            return null;
        Map<String, Integer> Result = new HashMap<String, Integer>();
        Result = collectionA;
        //loops for find object's value isExist in CollectionA
        for (String key : object.keySet()) {
            for (String y : object.get(key)) {
                if (Result.containsKey(y)) {
                    int NewValue = Result.get(y);
                    NewValue -= 1;
                    Result.put(y, NewValue);
                }
            }
        }
        return Result;
    }
}
