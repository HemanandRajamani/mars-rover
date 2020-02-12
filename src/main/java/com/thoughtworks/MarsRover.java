package com.thoughtworks;

import com.thoughtworks.navigation.NavigationDirectives;
import com.thoughtworks.robots.Rover;

import java.util.Scanner;

public class MarsRover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uppedBoundX = scanner.nextInt();
        int uppedBoundY = scanner.nextInt();

        Plateau plateau = Plateau.builder()
                .lowerBoundXCoOrd(0)
                .lowerBoundYCoOrd(0)
                .upperBoundXCoOrd(uppedBoundX)
                .upperBoundYCoOrd(uppedBoundY)
                .build();

        int landingXCoOrdRoverA = scanner.nextInt();
        int landingYCoOrdRoverA = scanner.nextInt();
        String currentNavigationRoverA = scanner.next();

        char[] instructionsRoverA = scanner.next().toCharArray();

        System.out.println(uppedBoundX);
        System.out.println(uppedBoundY);

       int landingXCoOrdRoverB = scanner.nextInt();
       int landingYCoOrdRoverB = scanner.nextInt();
       String currentNavigationRoverB = scanner.next();
       char[] instructionsRoverB = scanner.next().toCharArray();

       Rover roverA = Rover.builder()
                .plateau(plateau)
                .navigation(  NavigationDirectives.valueOf(currentNavigationRoverA).getNavigation())
                .xCoordinate(landingXCoOrdRoverA)
                .yCoordinate(landingYCoOrdRoverA)
                .instructions(instructionsRoverA)
                .build();

        roverA.executeInstructions();

        Rover roverB = Rover.builder()
                .plateau(plateau)
                .navigation( NavigationDirectives.valueOf(currentNavigationRoverB).getNavigation())
                .xCoordinate(landingXCoOrdRoverB)
                .yCoordinate(landingYCoOrdRoverB)
                .instructions(instructionsRoverB)
                .build();

        roverB.executeInstructions();





    }
}
