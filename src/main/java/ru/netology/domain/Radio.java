package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int startStation;
    private int finalStation = 9;
    private int minVolume;
    private int maxVolume = 100;

    public Radio (int maxStation) {
        this.currentStation = currentStation;
        this.finalStation = maxStation - 1;
    }

    public Radio () {

    }

    public void setNextStation (int currentStation) {
        if (currentStation < finalStation) {
            currentStation++;
        } else {
            currentStation = startStation;
        }
        this.currentStation = currentStation;
    }

    public void setPrevStation (int currentStation) {
        if (currentStation > startStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = finalStation;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation () {
        return this.currentStation;
    }

    public void setPlusVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        this.currentVolume = currentVolume;
    }

    public void setMinusVolume(int currentVolume) {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

}