package com.heroquest;

import com.heroquest.pnj.Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * Jeu basé sur les règles de Héro Quest
 * Nous incarnons un héros qui se déplace dans
 * une caverne à la recherche du Sceptre de Feu
 *
 * cette classe sert à générer un Scanner
 * qui est envoyé à toutes les méthodes majeur du programme.
 * Les méthodes majeurs sont les méthodes qui permettent à
 * l'user de se déplacer dans la caverne
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayGame start = new PlayGame();
        start.playGame(sc);
    }
}
