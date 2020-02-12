package com.thoughtworks.navigation;

import com.thoughtworks.robots.Rover;

public class WestBound implements Navigation {
    @Override
    public Navigation rotateRight() {
        return new NorthBound();
    }

    @Override
    public Navigation rotateLeft() {
        return new SouthBound();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setXCoordinate(rover.getXCoordinate() - 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setXCoordinate(rover.getXCoordinate() + 1);
    }
}
