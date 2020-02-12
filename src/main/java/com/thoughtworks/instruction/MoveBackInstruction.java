package com.thoughtworks.instruction;

import com.thoughtworks.robots.Rover;

public class MoveBackInstruction implements Instruction {

    @Override
    public void apply(Rover rover) {
        rover.moveBack();
    }
}
