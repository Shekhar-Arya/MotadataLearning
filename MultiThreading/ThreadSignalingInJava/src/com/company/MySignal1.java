package com.company;

public class MySignal1 {
    private boolean hasData = false;

    public synchronized boolean isHasData() {
        return hasData;
    }

    public synchronized void setHasData(boolean hasData) {
        this.hasData = hasData;
    }
}
