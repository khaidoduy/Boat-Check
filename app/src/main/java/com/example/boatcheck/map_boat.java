package com.example.boatcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class map_boat extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_boat);
        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.mapBoat);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng sysLng=new LatLng(-33.852,1511.211);
        googleMap.addMarker(new MarkerOptions().position(sysLng).title("Đây là tàu của bạn."));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sysLng));
    }
    private void setUpMapIfNeeded(){
        if(mMap ==null){
           // mMap=((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.mapBoat))

        }
    }
}
