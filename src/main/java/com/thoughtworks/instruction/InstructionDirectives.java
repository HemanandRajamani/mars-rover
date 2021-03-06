package com.thoughtworks.instruction;

public enum InstructionDirectives {

    L(new RotateLeftInstruction()),
    R(new RotateRightInstruction()),
    M(new MoveForwardInstruction()),
    B(new MoveBackInstruction()),
    ;

    private final Instruction instruction;

    InstructionDirectives (Instruction instruction){
        this.instruction = instruction;
    }

    public Instruction getInstruction() {
        return instruction;
    }
}
