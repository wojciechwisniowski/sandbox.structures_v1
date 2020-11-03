package com.wisniowski.sandbox.structures;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SortsTests {

    @Test
    void sortTest(){
        Sorts sorts = new Sorts();
        assert(sorts.isSorted() == false);
    }
}
