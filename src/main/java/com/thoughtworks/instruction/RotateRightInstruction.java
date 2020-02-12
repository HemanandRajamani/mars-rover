package com.thoughtworks.instruction;

import com.thoughtworks.robots.Rover;

public class RotateRightInstruction implements Instruction {
    @Override
    public void apply(Rover rover) {
        rover.spinRight();
    }
}
