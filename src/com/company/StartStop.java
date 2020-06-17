package com.company;

public interface StartStop {
    boolean start = true;
    boolean stop = true;

    static void showStartInfo(boolean start, boolean stop) {
        if (start = true) {
            stop = false;
        }
    }

    static void showStopInfo(boolean start, boolean stop) {
        if (stop = true) {
            start = false;
        }
    }
}

