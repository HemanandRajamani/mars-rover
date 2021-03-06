package com.thoughtworks.navigation;

public enum NavigationDirectives {

    S(new SouthBound()),
    N(new NorthBound()),
    E(new EastBound()),
    W(new WestBound());

    private Navigation navigation;

    NavigationDirectives(Navigation navigation) {
        this.navigation = navigation;
    }

    public Navigation getNavigation() {
        return navigation;
    }
}
