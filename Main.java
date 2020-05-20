package com.heroquest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayGame start = new PlayGame();
        start.playGame(sc);
    }
}
