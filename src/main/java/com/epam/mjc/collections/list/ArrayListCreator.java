package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        int length = sourceList.size();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            if(i % 3 == 0){
                result.add(sourceList.get(i - 1));
                result.add(sourceList.get(i - 1));
            }
        }

        return result;
    }
}
