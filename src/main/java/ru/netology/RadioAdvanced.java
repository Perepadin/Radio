package ru.netology;

public class RadioAdvanced {
    private int numberOfStations = 10;
    private int currentStation = 0;
    private int minStation = 0;
    private int currentVolume = 0;
    private int maxVolumeLevel = 100;
    private int minVolumeLevel = 0;

    public RadioAdvanced(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public RadioAdvanced() {
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        if (numberOfStations < 0) {
            return;
        }
        this.numberOfStations = numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > numberOfStations) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        if (currentStation == numberOfStations) {
            this.currentStation = numberOfStations -1;
            return;
        }
        this.currentStation = currentStation;
    }

    public void changeOnPreviousRadioStation() {
        if (currentStation == minStation) {
            this.currentStation = numberOfStations - 1;
            return;
        }
        this.currentStation--;
    }

    public void changeOnNextRadioStation() {
        if (currentStation == numberOfStations - 1) {
            this.currentStation = minStation;
            return;
        }

        this.currentStation++;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        minStation = minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolumeLevel) {
            return;
        }
        if (currentVolume < minVolumeLevel) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolumeLevel() {
        return maxVolumeLevel;
    }

    public void setMaxVolumeLevel(int maxVolumeLevel) {
        maxVolumeLevel = maxVolumeLevel;
    }

    public int getMinVolumeLevel() {
        return minVolumeLevel;
    }

    public void setMinVolumeLevel(int minVolumeLevel) {
        minVolumeLevel = minVolumeLevel;
    }

    public void volumeUpForOne() {

        if (currentVolume == maxVolumeLevel) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < maxVolumeLevel) {
            this.currentVolume++;
        }
    }

    public void volumeDownForOne() {
        if (currentVolume == minVolumeLevel) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > minVolumeLevel) {
            this.currentVolume--;
        }
    }
}


