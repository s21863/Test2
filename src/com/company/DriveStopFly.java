package com.company;

import javax.xml.stream.Location;

public interface DriveStopFly extends Flying, DriveStop {
    int longitude = 0;
    int latitude = 0;

    static void showLocation(int longitude, int latitude) {
    }
}
