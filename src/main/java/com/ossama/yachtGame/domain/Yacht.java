package com.ossama.yachtGame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Yacht {

    private DieRoller dieRoller;
    private List<Integer> rollResult;

    public Yacht(DieRoller dieRoller) {
        this.dieRoller = dieRoller;
    }

    public List<Integer> roll() {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<5;i++){
            result.add(dieRoller.roll());
        }
        this.rollResult=result;
        return result;
    }

    public int scoreForNumbersCategory(int dieSide) {
      return (int) this.rollResult.stream().filter(d->d==dieSide).count()*dieSide;
    }


    public int scoreASFullHouse() {
       List<Integer> distinct=this.rollResult.stream().distinct().collect(Collectors.toList());
        if(distinct.size()!=2)
            return 0;
        int result=0;
        for (int d:distinct){
            if(scoreForNumbersCategory(d)<d*2)
                return 0;
            result+=scoreForNumbersCategory(d);
        }
        return result;
    }
}
