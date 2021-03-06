package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void nextStation() {
        currentStation++;

        if (currentStation >= maxStation) {
            currentStation = minStation;
        }

    }
    public void prevStation() {
        currentStation--;

        if (currentStation <= minStation) {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minStation) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.maxVolume = maxVolume;
    }

    public void upVolume() {
        currentVolume++;
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void downVolume() {
        currentVolume--;
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }
}