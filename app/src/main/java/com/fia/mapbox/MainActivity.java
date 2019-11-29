package com.fia.mapbox;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Mapbox.getInstance(this, "pk.eyJ1IjoibmltYXR1IiwiYSI6ImNrMzlrZTdxOTAwbTAzY3FsamprZG50OWMifQ.3hHfuzkR7miCZRbTWpwntQ");
        setContentView(R.layout.activity_main);
        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(new OnMapReadyCallback() {

            @Override
            public void onMapReady(@NonNull MapboxMap mapboxMap) {
                mapboxMap.setStyle(Style.MAPBOX_STREETS, new Style.OnStyleLoaded() {
                    @Override
                    public void onStyleLoaded(@NonNull Style style) {

                        // Map is set up and the style has loaded. Now you can add data or make other map adjustments.


                    }
                });
                marker(-5.397140, 105.266792, mapboxMap);
                marker2(19.896767, -155.582779, mapboxMap);
                marker3(-25.274399, 133.775131, mapboxMap);
                marker4(20.593683, 78.962883, mapboxMap);
                marker5(46.862495, 103.846657, mapboxMap);
            }
        });

    }


    public void marker(double lat, double lon, MapboxMap mapboxmap){
        MarkerOptions options = new MarkerOptions();
        options.setTitle("Indonesia");
        options.position(new LatLng(lat, lon));
        mapboxmap.addMarker(options);
    }

    public void marker2(double lat, double lon, MapboxMap mapboxmap){
        MarkerOptions options = new MarkerOptions();
        options.setTitle("HAWAII");
        options.position(new LatLng(lat, lon));
        mapboxmap.addMarker(options);
    }

    public void marker3(double lat, double lon, MapboxMap mapboxmap){
        MarkerOptions options = new MarkerOptions();
        options.setTitle("AUSTRALIA");
        options.position(new LatLng(lat, lon));
        mapboxmap.addMarker(options);
    }

    public void marker4(double lat, double lon, MapboxMap mapboxmap){
        MarkerOptions options = new MarkerOptions();
        options.setTitle("INDIA");
        options.position(new LatLng(lat, lon));
        mapboxmap.addMarker(options);
    }

    public void marker5(double lat, double lon, MapboxMap mapboxmap){
        MarkerOptions options = new MarkerOptions();
        options.setTitle("MONGOLIA");
        options.position(new LatLng(lat, lon));
        mapboxmap.addMarker(options);
    }

    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

}
