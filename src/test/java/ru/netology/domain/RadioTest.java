package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio fm = new Radio(30);

    @Test
    void ShouldSwitchStationToUp() {
        fm.setNextStation(4);
        int actual = fm.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldSwitchOnStartStation() {
        fm.setNextStation(29);
        int actual = fm.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldSwitchStationToDown() {
        fm.setPrevStation(5);
        int actual = fm.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldSwitchOnFinalStation() {
        fm.setPrevStation(0);
        int actual = fm.getCurrentStation();
        int expected = 29;
        Assertions.assertEquals(expected, actual);
    }

    Radio volume = new Radio();

    @Test
    void ShouldIncreaseVolumeUp() {
        volume.setPlusVolume(6);
        int actual = volume.getCurrentVolume();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldIncreaseVolumeDown() {
        volume.setMinusVolume(5);
        int actual = volume.getCurrentVolume();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldIncreaseVolumeToMax() {
        volume.setPlusVolume(100);
        int actual = volume.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldDecreaseVolumeToMin() {
        volume.setMinusVolume(0);
        int actual = volume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}