package DesignPattern.Templatemethod;

public class KakaoMapView extends MapView {

    @Override
    protected void connectMapServer( ) {
        System.out.println("카카오 지도 서버에 연결");
    };

    @Override
    protected void showMapOnScreen() {
        System.out.println("카카오 지도룰 보여줌");
    };

    @Override
    protected void moveToCurrentLocation() {
        System.out.println("카카오 지도애서 현 좌표로 이동");
    };
}
