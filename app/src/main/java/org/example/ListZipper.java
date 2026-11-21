package org.example;

import java.util.List;
import java.util.ArrayList;

public class ListZipper<T> {
    private List<T> listOne;
    private List<T> listTwo;

    public ListZipper(List<T> listOne, List<T> listTwo)
    {
        this.listOne = new ArrayList<>(listOne);
        this.listTwo = new ArrayList<>(listTwo);
    }

    public List<T> zip()
    {
        List<T> zippedList = new ArrayList<>();
        int maxSize = Math.max(listOne.size(), listTwo.size());

        for ( int i = 0; i < maxSize; i++)
        {
            if (i < listOne.size())
            {
                zippedList.add(listOne.get(i));
            }
            if (i < listTwo.size())
            {
                zippedList.add(listTwo.get(i));
            }
        }
        return zippedList;
    }
}
