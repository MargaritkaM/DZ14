package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {


    Player player1 = new Player(4, "Anya", 500);
    Player player2 = new Player(1, "Alina", 300);
    Player player3 = new Player(2, "Sveta", 100);
    Player player4 = new Player(3, "Nastya", 800);
    Player player5 = new Player(5, "Kurva", 500);

    Game repo = new Game();
    ArrayList<Player> player = new ArrayList<>();

    @Test
    public void equalValues() throws NotRegisteredException {


        Player player1 = new Player(4, "Anya", 500);
        Player player2 = new Player(1, "Alina", 300);
        Player player3 = new Player(2, "Sveta", 100);
        Player player4 = new Player(3, "Nastya", 800);
        Player player5 = new Player(5, "Kurva", 500);


        int expected = 2;
        int actual = repo.round("Anya", "Nastya");

        assertEquals(expected, actual);
    }

}
