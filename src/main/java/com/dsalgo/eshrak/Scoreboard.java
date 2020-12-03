package com.dsalgo.eshrak;

public class Scoreboard {
    private int numberEntries = 0;
    private GameEntry[] board;

    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }
}
