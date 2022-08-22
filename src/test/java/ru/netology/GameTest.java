package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    Game repo = new Game();
    ArrayList<Player> player = new ArrayList<>();

    Player player1 = new Player(4, "Anya", 500);
    Player player2 = new Player(1, "Alina", 300);
    Player player3 = new Player(2, "Sveta", 100);
    Player player4 = new Player(3, "Nastya", 800);
    Player player5 = new Player(5, "Kurva", 500);


    @BeforeEach
    public void setup() {
        repo.register(player1);
        repo.register(player2);
        repo.register(player3);
        repo.register(player4);
        repo.register(player5);
    }

    @Test
    public void equalValues() throws NotRegisteredException {

        int expected = 0;
        int actual = repo.round("Anya", "Kurva");

        assertEquals(expected, actual);
    }

    @Test
    public void firstStronger() throws NotRegisteredException {


        int expected = 1;
        int actual = repo.round("Anya", "Alina");

        assertEquals(expected, actual);
    }

    @Test
    public void secondStronger() throws NotRegisteredException {


        int expected = 2;
        int actual = repo.round("Sveta", "Alina");

        assertEquals(expected, actual);
    }

    @Test
    public void firstNotFound() throws NotRegisteredException {

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            repo.round("Margarita", "Alina");
        });
    }

    @Test
    public void secondNotFound() throws NotRegisteredException {

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            repo.round("Alina", "Margarita");
        });
    }

    @Test
    public void twoNotFound() throws NotRegisteredException {

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            repo.round("Annet", "Margarita");
        });
    }
}
