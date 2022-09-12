package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
         List<Integer> result = new LinkedList<>();
        int size = sourceList.size();
        for (int i = 0; i < size; i++) {
            if(sourceList.get(i) % 2 != 0) {
                if (result.size() >= 1)
                    result.add(0, sourceList.get(i));
                else
                    result.add(sourceList.get(i));
            }
            else
                result.add(sourceList.get(i));

        }
        return (LinkedList<Integer>) result;
    }
}
