package ru.netology;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public int round(String playerName1, String playerName2) throws NotRegisteredException {
        Player player1 = null;
        Player player2 = null;
        for (Player player : players) {
            if (player.getName().equals(playerName1)) {
                player1 = player;
            }
            if (player.getName().equals(playerName2)) {
                player2 = player;
            }
        }

        if (player1 == null) {
            throw new NotRegisteredException(
                    "Пользователь не найден:" + playerName1
            );
        }
        if (player2 == null) {
            throw new NotRegisteredException(
                    "Пользователь не найден:" + playerName2
            );
        }
        if (player1.getStrength() == player2.getStrength()) {
            return 0;
        }
        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }
        return 2;
    }

//    public void save(Player player) {
//        Player[] tmp = new Player[players.size() + 1];
//        for (int i = 0; i < players.size(); i++) {
//            tmp[i] = players[i];
//        }
//        tmp[tmp.size - 1] = player;
//        players = tmp;
//    }

}

