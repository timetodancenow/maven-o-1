package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void ShouldSwitchStationToUp() {
        Radio fm = new Radio();
        fm.next(5);
        int actual = fm.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldSwitchStationToUp1() {
        Radio fm = new Radio();
        fm.next(9);
        int actual = fm.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldSwitchStationToDown() {
        Radio fm = new Radio();
        fm.prev(5);
        int actual = fm.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldSwitchStationToDown1() {
        Radio fm = new Radio();
        fm.prev(0);
        int actual = fm.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldIncreaseVolumeUp() {
        Radio volume = new Radio();
        volume.setPlusVolume(6);
        int actual = volume.getCurrentVolume();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldIncreaseVolumeDown() {
        Radio volume = new Radio();
        volume.setMinusVolume(5);
        int actual = volume.getCurrentVolume();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldIncreaseVolumeToMax() {
        Radio volume = new Radio();
        volume.setPlusVolume(10);
        int actual = volume.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ShouldDecreaseVolumeToMin() {
        Radio volume = new Radio();
        volume.setMinusVolume(0);
        int actual = volume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}
