package pattern.bridge;

import pattern.bridge.contract.MapBridge;
import pattern.bridge.service.BingMapService;
import pattern.bridge.service.GoogleMapService;

public class BridgeMain {

    public static void main(String[] args){
        MapBridge googleMapService = new GoogleMapService();
        System.out.println(googleMapService.getLinkMap("Santa Rita do Sapucai, MG, Brasil"));

        MapBridge bingMapService = new BingMapService();
        System.out.println(bingMapService.getLinkMap("Santa Rita do Sapucai, MG, Brasil"));
    }
}
