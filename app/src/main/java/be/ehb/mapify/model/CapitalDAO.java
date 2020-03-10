package be.ehb.mapify.model;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class CapitalDAO {

    private ArrayList<Capital> capitals;
    public static final CapitalDAO INSTANCE = new CapitalDAO();

    private CapitalDAO(){
    }

    public ArrayList<Capital> getCapitals(){
        if (capitals == null){
            capitals = new ArrayList<>();
            capitals.add(new Capital(new LatLng(51.528308, -0.381789),"Londen","Lorem Ipsum dubbeldekker doctor no"));
            capitals.add(new Capital(new LatLng(60.1098678,24.738504),"Helsinki","Korpiklaani perkele vodka"));
            capitals.add(new Capital(new LatLng(-33.87365,151.20689),"Sidney","Is not the captital cricket toilet paper vegemite sandwich billabong"));
        }
        return capitals;
    }


}
