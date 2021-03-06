package com.thoughtworks.instruction;

import com.thoughtworks.robots.Rover;

public class MoveForwardInstruction implements Instruction {
    @Override
    public void apply(Rover rover) {
       rover.moveForward();
    }
}
