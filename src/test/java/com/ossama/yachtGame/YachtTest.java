package com.ossama.yachtGame;



import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class YachtTest {
    // Role 1 : never write or change or write code without a failing test
    // Role 2 : write the absolute tiniest easiest amount of code to get the test to pass
    @Test
    public void rollDiceResultIn12345() throws Exception{
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(1,2,3,4,5)));
        //When
        List<Integer> result=yacht.roll();
        //Then
        assertThat(result).isEqualTo(List.of(1,2,3,4,5));

    }
    @Test
    public void rollDiceResultSizeIs5 () throws Exception{
        //Given
        Yacht yacht=new Yacht(new RandomDieRoller());
        //When
        List<Integer> result=yacht.roll();
        //Then
        assertThat(result).hasSize(5);


    }
}
