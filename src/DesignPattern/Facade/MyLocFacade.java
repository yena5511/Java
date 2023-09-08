package DesignPattern.Facade;

import java.util.Map;
import java.util.Objects;

public class MyLocFacade {
    public void printMyAdddress (){
        double[] myGeoLoc = new GeoLocation().getGeoLoc();

        InternetConnection conn = new InternetConnection();
        conn.connect();
        String data = conn.getData("http://주소_API_URL", myGeoLoc);
        conn.disconnect();;

        Map<String, Object> address = new Json().parse(data);

        System.out.println(address.get(address));
    }
}
