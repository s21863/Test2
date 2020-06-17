package com.company;

public interface DriveStop {
    boolean drive = true;
    boolean stop = true;

    static void showDriveInfo(boolean drive, boolean stop) {
        if (drive = true) {
            stop = false;
        }
    }

    static void showFlyInfo(boolean drive, boolean stop) {
        if (stop = true) {
            drive = false;
        }
    }
}
