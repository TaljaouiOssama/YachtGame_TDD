package com.ossama.yachtGame;

import java.util.Iterator;
import java.util.List;

public class SequenceDieRoller implements DieRoller {
   private Iterator<Integer> sequence;
    public SequenceDieRoller(List<Integer> sequence) {
        this.sequence = sequence.iterator();
    }

    @Override
    public int roll() {
        return sequence.next();
    }
}
