package DesignPattern.Templatemethod;

public class MapView {

    protected abstract void connectMapServer();
    protected abstract void showMapOnScreen();
    protected abstract void moveToCurrentLocation();

    public void initMap() {
        connectMapServer();
        showMapOnScreen();
        moveToCurrentLocation();
    }
}
