package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @Test
    void shouldCheckNumbersOfStation() {
        RadioAdvanced radio = new RadioAdvanced(10);
        assertEquals(10, radio.getNumberOfStations());
    }

    @Test
    void shouldSetCurrentRadioStationBackToZero() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationsIfStationsIsOverMax() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setCurrentStation(150);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationsIfStationsIsUnderMin() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setCurrentStation(-99);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationsIfStationsIsMin() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationsIfStationsIsMax() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        RadioAdvanced radio = new RadioAdvanced(10);
        int currentStation = 0;
        radio.changeOnPreviousRadioStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnNextRadioStationIfStationIsMax() {
        RadioAdvanced radio = new RadioAdvanced(10);
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnPreviousRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(10);
        int currentStation = 8;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnNextRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(10);
        int currentStation = 8;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetVolumeIfVolumeIsOverMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(150);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeIfVolumeIsUnderMin() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = -100;
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 100;
        radio.setCurrentVolume(currentVolume);
        radio.volumeUpForOne();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 0;
        radio.volumeDownForOne();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void volumeUpForOne() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 8;
        radio.setCurrentVolume(currentVolume);
        radio.volumeUpForOne();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void volumeDownForOne() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 7;
        radio.setCurrentVolume(currentVolume);
        radio.volumeDownForOne();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldCreate() {
        RadioAdvanced Radio = new RadioAdvanced();
    }

    @Test
    public void shouldUseArgsConstructor() {
        RadioAdvanced Radio = new RadioAdvanced();
        assertEquals(9, Radio.getMaxStation());
        assertEquals(0, Radio.getMinStation());
        assertEquals(0, Radio.getCurrentStation());
        assertEquals(100, Radio.getMaxVolumeLevel());
        assertEquals(0, Radio.getMinVolumeLevel());
        assertEquals(0, Radio.getCurrentVolume());
    }

    @Test
    @Disabled
    public void shouldThrowNPE() {
        Radio radio = new Radio();
        assertEquals(0, radio.name.length());
    }

    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentStation);
        radio.currentStation = 5;
        assertEquals(5, radio.currentStation);
    }
}