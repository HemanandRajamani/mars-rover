package com.thoughtworks.navigation;

import com.thoughtworks.robots.Rover;

public interface Navigation {

    public abstract Navigation rotateRight();

    public abstract Navigation rotateLeft();

    public abstract void moveForward(Rover rover);

    public abstract void moveBack(Rover rover);
}
