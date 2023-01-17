package com.ossama.yachtGame.domain;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class YachtScoringTest {
    @Test
    public void rollOf23456ScoreForOnesCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,3,4,5,6)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(1);
        //Then
        assertThat(result).isEqualTo(0);
    }
    @Test
    public void rollOf21451ScoreForOnesCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,1,4,5,1)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(1);
        //Then
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void rollOf23456ScoreForTwosCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,3,4,5,6)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(2);
        //Then
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void rollOf11451ScoreForTwosCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(1,1,4,5,1)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(2);
        //Then
        assertThat(result).isEqualTo(0);
    }
    @Test
    public void rollOf23353ScoreForThreesCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,3,3,5,3)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(3);
        //Then
        assertThat(result).isEqualTo(9);
    }
    @Test
    public void rollOf33353ScoreForThreesCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(3,3,3,5,3)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(3);
        //Then
        assertThat(result).isEqualTo(12);
    }
    @Test
    public void rollOf23455ScoreForFoursCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,3,4,5,5)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(4);
        //Then
        assertThat(result).isEqualTo(4);
    }
    @Test
    public void rollOf41451ScoreForFoursCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(4,1,4,5,1)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(4);
        //Then
        assertThat(result).isEqualTo(8);
    }
    @Test
    public void rollOf23455ScoreForFivesCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,3,4,5,5)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(5);;
        //Then
        assertThat(result).isEqualTo(10);
    }
    @Test
    public void rollOf21451ScoreForFivesCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,1,4,5,1)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(5);
        //Then
        assertThat(result).isEqualTo(5);
    }
    @Test
    public void rollOf66666ScoreForSixesCategory(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(6,6,6,6,6)));
        yacht.roll();
        //When
        int result=yacht.scoreForNumbersCategory(6);
        //Then
        assertThat(result).isEqualTo(30);
    }

}
