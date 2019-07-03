package pattern.bridge.service;

import pattern.bridge.contract.MapBridge;

public class BingMapService implements MapBridge {

    @Override
    public String getLinkMap(String address) {
        return String.join(":", "Bing maps link to",
                address);
    }
}
