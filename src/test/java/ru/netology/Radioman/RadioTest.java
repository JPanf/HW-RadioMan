package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(44);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSetRadioStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void setCurrentRadioVolum() {
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(10);


        int actual = radio.getCurrentRadioVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotExeedCurrentRadioVolumeMax(){
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(0);
        radio.increaseRadioVolume();

        int expected = 1;
        int actual = radio.getCurrentRadioVolume();

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void shouldNotCurrentRadioVolumeGoUnderMin(){
        Radio radio = new Radio();
        radio.setCurrentRadioVolume(-2);
        radio.minCurrentRadioVolume ();

        int actual = radio.getCurrentRadioVolume();
        int expected=0;

        Assertions.assertEquals(actual, expected);
    }

}
