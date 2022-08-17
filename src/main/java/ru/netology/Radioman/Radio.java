package ru.netology.Radioman;

public class Radio {
    private int minRadioStation;
    private int totalQuantityRadioStations;
    private int currentRadioStation = minRadioStation;
    private int maxRadioStation = totalQuantityRadioStations - 1;

    private int minRadioVolume;
    private int maxRadioVolume=100;
    private int currentRadioVolume=minRadioVolume;

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


    public void setCurrentRadioVolume (int currentRadioVolume) {
        if (currentRadioVolume < minRadioVolume) {
            currentRadioVolume=minRadioVolume;
        }
        if (currentRadioVolume > maxRadioVolume) {
           currentRadioVolume=maxRadioVolume;
        }
        this.currentRadioVolume=currentRadioVolume;
    }

    public void increaseRadioVolume() {
        if (currentRadioVolume < maxRadioVolume) {
            currentRadioVolume++;
        } else {
            getMaxRadioVolume();
        }
    }

    public void minCurrentRadioVolume() {
        if (currentRadioVolume > minRadioVolume) {
            currentRadioVolume--;
        } else {
            getMinRadioVolume();
        }
    }

    public int getMinRadioVolume() {
        return minRadioVolume;
    }

    public int getMaxRadioVolume() {
        return maxRadioVolume;
    }
}

