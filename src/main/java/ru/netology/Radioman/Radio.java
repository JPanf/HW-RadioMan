package ru.netology.Radioman;

public class Radio {
    private int currentRadioStation;
    private int currentRadioVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume < 0) {
            return;
        }
        if (newCurrentRadioVolume > 10) {
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void increaseRadioVolume() {
        if (currentRadioVolume < 10) {
            currentRadioVolume++;
        }
    }

    public void minCurrentRadioVolume() {
        if (currentRadioVolume > 0) {
            currentRadioVolume--;
        }
    }
}