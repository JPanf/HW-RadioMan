package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void NewRadioRangeSetting() {
        Radio radio = new Radio(25);

        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(24, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(24);

        int actual = radio.getCurrentRadioStation();
        int expected = 24;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setCurrentRadioStationOutOfRange() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(30);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setCurrentRadioStationIfOverMax() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(24);
        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationIfUnderMin() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 24;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationIfUnderZero() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(-1);


        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNextRadioStation() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(20);
        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 21;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void SetPrevRadioStation() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(24);
        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 23;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setCurrentRadioVolume() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(1);

        int actual = radio.getCurrentRadioVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseRadioVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(9);
        radio.increaseRadioVolume();

        int actual = radio.getCurrentRadioVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void StepDownCurrentRadioVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(5);
        radio.minCurrentRadioVolume();

        int actual = radio.getCurrentRadioVolume();
        int expected = 4;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotCurrentRadioVolumeGoUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(-1);
        radio.minCurrentRadioVolume();

        int actual = radio.getCurrentRadioVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotCurrentRadioVolumeGoOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(11);
        radio.increaseRadioVolume();

        int actual = radio.getCurrentRadioVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }


}
