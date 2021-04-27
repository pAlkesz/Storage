package com.company;

import java.util.Comparator;

public class SizeSorter implements Comparator<Package> {

    @Override
    public int compare(Package o1, Package o2) {
        return o2.x*o2.y - o1.x*o1.y;
    }
}
