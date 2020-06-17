package com.company;

public interface Flying {
    boolean fly = true;
    boolean noFly = true;
    String messageFly = "vehicle is flying";
    String messageNoFly = "vehicle is not flying";

    static String showFlyInfo(boolean fly, String messageFly, boolean noFly) {
        if (fly = true) {
            noFly = false;
        }
        return messageFly;
    }

    static String showNoFlyInfo(boolean fly, String messageNoFly, boolean noFly) {
        if (fly = false) {
            noFly = true;
        }
        return messageNoFly;
    }
}
