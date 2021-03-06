package com.thoughtworks.navigation;

import com.thoughtworks.robots.Rover;

public class SouthBound implements Navigation{
    @Override
    public Navigation rotateRight() {
        return new WestBound();
    }

    @Override
    public Navigation rotateLeft() {
        return new EastBound();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setYCoordinate(rover.getYCoordinate() - 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setYCoordinate(rover.getYCoordinate() + 1);
    }
}
