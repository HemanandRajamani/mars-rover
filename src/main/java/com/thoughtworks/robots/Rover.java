package com.thoughtworks.robots;

import com.thoughtworks.Plateau;
import com.thoughtworks.instruction.Instruction;
import com.thoughtworks.instruction.InstructionDirectives;
import com.thoughtworks.navigation.Navigation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Rover {
    private Navigation navigation;
    private final Plateau plateau;
    private int xCoordinate;
    private int yCoordinate;
    private char[] instructions;

    public void executeInstructions() {
        for(Character character : instructions) {
            Instruction instruction = InstructionDirectives.valueOf(Character.toString(character)).getInstruction();
            instruction.apply(this);
        }
        System.out.println(xCoordinate + " " + yCoordinate + " " + getNavigation().getClass().getSimpleName().charAt(0));
    }
    public void spinRight() {
        navigation = getNavigation().rotateRight();
    }

    public void spinLeft() {
        navigation = getNavigation().rotateLeft();
    }

    public void moveForward() {
        getNavigation().moveForward(this);
    }

    public void moveBack() {
        getNavigation().moveBack(this);
    }
}
