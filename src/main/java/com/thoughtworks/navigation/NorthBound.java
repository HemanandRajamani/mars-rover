package com.thoughtworks.navigation;

import com.thoughtworks.robots.Rover;

public class NorthBound implements Navigation {

    @Override
    public Navigation rotateRight() {
        return new EastBound();
    }

    @Override
    public Navigation rotateLeft() {
        return new WestBound();
    }

    @Override
    public void moveForward(Rover rover) {
        rover.setYCoordinate(rover.getYCoordinate() + 1);
    }

    @Override
    public void moveBack(Rover rover) {
        rover.setYCoordinate(rover.getYCoordinate() - 1);
    }
}
