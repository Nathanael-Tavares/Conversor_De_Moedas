package model;

import java.util.HashMap;
import java.util.Map;

public class FetchCurrencyPair {
    public String[] intToCurrencies(int key){
        Map<Integer, String[]> map = new HashMap<>();
        map.put(1, new String[]{"USD", "BRL"});
        map.put(2, new String[]{"BRL", "ARS"});
        map.put(3, new String[]{"GBP", "BRL"});
        map.put(4, new String[]{"BRL", "BOB"});
        map.put(5, new String[]{"BRL", "USD"});
        map.put(6, new String[]{"COP", "CLP"});
        return map.get(key);
    }
}