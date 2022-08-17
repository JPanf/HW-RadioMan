package ru.netology.Radioman;

public class Radio {
    private int currentRadioVolume;
    private int minRadioStation = 0;
    private int totalQuantityRadioStations;
    private int currentRadioStation = minRadioStation;
    private int maxRadioStation = totalQuantityRadioStations - 1;

    public Radio(int totalQuantityRadioStations) {
        this.maxRadioStation = totalQuantityRadioStations - 1;
    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }


    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume < 0) {
            newCurrentRadioVolume = 0;
        }
        if (newCurrentRadioVolume > 10) {
            newCurrentRadioVolume = 10;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }

    public void increaseRadioVolume() {
        if (currentRadioVolume < 10) {
            currentRadioVolume++;
        } else {
            getCurrentRadioVolume();
        }
    }

    public void minCurrentRadioVolume() {
        if (currentRadioVolume > 0) {
            currentRadioVolume--;
        } else {
            getCurrentRadioVolume();
        }
    }
}

