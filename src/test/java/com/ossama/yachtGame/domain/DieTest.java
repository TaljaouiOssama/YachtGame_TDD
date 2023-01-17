package com.ossama.yachtGame.domain;


import com.ossama.yachtGame.domain.DieRoller;
import com.ossama.yachtGame.domain.RandomDieRoller;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.*;
@Disabled
public class DieTest {
    @RepeatedTest(10)
   public void rollResultsInBetween1and6(){
        DieRoller dieRoller=new RandomDieRoller();
        int roll=dieRoller.roll();
        assertThat(roll).isBetween(1,6);
    }
}
