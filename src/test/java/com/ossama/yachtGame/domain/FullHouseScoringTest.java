package com.ossama.yachtGame.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FullHouseScoringTest {
    @Test
    public void rollOf12345Score(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(1,2,3,4,5)));
        yacht.roll();
        //When
        int result=yacht.scoreASFullHouse();
        //Then
        assertThat(result).isEqualTo(0);
    }
    @Test
    public void rollOf21333Score(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,1,3,3,3)));
        yacht.roll();
        //When
        int result=yacht.scoreASFullHouse();
        //Then
        assertThat(result).isEqualTo(0);
    }
    @Test
    public void rollOf23333Score(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,3,3,3,3)));
        yacht.roll();
        //When
        int result=yacht.scoreASFullHouse();
        //Then
        assertThat(result).isEqualTo(0);
    }
    @Test
    public void rollOf22333Score(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,2,3,3,3)));
        yacht.roll();
        //When
        int result=yacht.scoreASFullHouse();
        //Then
        assertThat(result).isEqualTo(13);
    }
    @Test
    public void rollOf24442Score(){
        //Given
        Yacht yacht=new Yacht(new SequenceDieRoller(List.of(2,4,4,4,2)));
        yacht.roll();
        //When
        int result=yacht.scoreASFullHouse();
        //Then
        assertThat(result).isEqualTo(16);
    }
}
