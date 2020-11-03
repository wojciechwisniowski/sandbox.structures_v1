package com.wisniowski.sandbox.structures;

import java.util.concurrent.ThreadLocalRandom;

public class Sorts {
    private int[] array;

    /**
     * Default init with small array 1000 elements
     */
    public Sorts() {
        array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt();
        }
    }

    public boolean isSorted() {
        boolean sorted = false;
        if (array != null) {
            if (array.length == 1) {
                sorted = true;
            } else {
                int val = array[0];
                for (int i = 1; i < array.length; i++) {
                    if(array[i]>= val){
                        val = array[i];
                    }else{
                        sorted = false;
                        break;
                    }
                }
            }
        }
        return sorted;
    }
}
