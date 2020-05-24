package com.wiki.game.wizardlabs.Models;

import com.google.firebase.database.ServerValue;

public class Game {
    private String gameKey;
    private String name;
    private String cover;
    private String description;
    private Long players;
    private String platform;
    private String genre;
    private Object time;

    public Game(String name, String cover, String description, Long players, String platform, String genre, String gameKey) {
        this.name = name;
        this.cover = cover;
        this.description = description;
        this.players = players;
        this.platform = platform;
        this.genre = genre;
        this.gameKey = gameKey;
        this.time = ServerValue.TIMESTAMP;
    }

    public Game() {}

    public String getGameKey() { return gameKey; }

    public void setGameKey(String gameKey) { this.gameKey = gameKey; }

    public Object getTime() { return time; }

    public void setTime(Long time) { this.time = time; }

    public String getName() {
        return name;
    }

    public String getCover() {
        return cover;
    }

    public String getDescription() {
        return description;
    }

    public String getPlayers() {
        String txtPlayers = Long.toString(this.players);
        return txtPlayers;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPlayers(Long players) {
        this.players = players;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
