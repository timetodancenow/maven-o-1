package ru.netology.domain;

public class Radio {

    public int currentStation;

    public void next(int currentStation) {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void prev(int currentStation) {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {

        return this.currentStation;

    }

    public int currentVolume;

    public void setPlusVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume++;
        }
        this.currentVolume = currentVolume;
    }

    public void setMinusVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

}
