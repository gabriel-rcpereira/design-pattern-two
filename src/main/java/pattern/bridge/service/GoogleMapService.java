package pattern.bridge.service;

import pattern.bridge.contract.MapBridge;

public class GoogleMapService implements MapBridge {

    @Override
    public String getLinkMap(String address){
        return String.join(":", "Google maps link to",
                address);
    }
}
