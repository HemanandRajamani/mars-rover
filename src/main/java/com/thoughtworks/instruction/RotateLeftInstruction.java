package com.thoughtworks.instruction;

import com.thoughtworks.robots.Rover;

public class RotateLeftInstruction implements Instruction {
    @Override
    public void apply(Rover rover) {
        rover.spinLeft();
    }
}
