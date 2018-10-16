package com.example.helloHTML.model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
    public String generateLotto(){
        Set<Integer> set = new HashSet<>();
        Random random = new Random();

        while (set.size()!=6) {

            int number = random.nextInt(49) + 1;
            set.add(number);
        }
        return set.toString();
    }

}
