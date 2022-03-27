package com.example.floodmapping;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.floodmapping.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;




        LatLng nasugbu = new LatLng(14.0940, 120.6890);
        mMap.addMarker(new MarkerOptions().position(nasugbu).title("This is Nasugbu"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(nasugbu));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(nasugbu,16));

        LatLng Aga = new LatLng(14.0924689, 120.7690493);
        mMap.addMarker(new MarkerOptions().position(Aga).title("This is Aga"));

        LatLng Balaytigui = new LatLng(14.1255119, 120.5765328);
        mMap.addMarker(new MarkerOptions().position(Balaytigui).title("This is  Balaytigui"));

        LatLng Banilad  = new LatLng(14.0730, 120.7408);
        mMap.addMarker(new MarkerOptions().position(Banilad ).title("This is  Banilad "));

        LatLng Barangay1 = new LatLng(14.0752, 120.6296);
        mMap.addMarker(new MarkerOptions().position(Barangay1).title("This is  Barangay 1"));

        LatLng Barangay10 = new LatLng(14.0694, 120.6301);
        mMap.addMarker(new MarkerOptions().position(Barangay10).title("This is  Barangay 10"));

        LatLng Barangay11 = new LatLng(14.0604, 120.6344);
        mMap.addMarker(new MarkerOptions().position(Barangay11).title("This is  Barangay 11"));

        LatLng Barangay12 = new LatLng(14.0639, 120.6358);
        mMap.addMarker(new MarkerOptions().position(Barangay12).title("This is  Barangay 12"));

        LatLng Barangay2 = new LatLng(14.0783, 120.6300);
        mMap.addMarker(new MarkerOptions().position(Barangay2).title("This is  Barangay 2"));

        LatLng Barangay3 = new LatLng(14.0724, 120.6307);
        mMap.addMarker(new MarkerOptions().position(Barangay3).title("This is  Barangay 3"));

        LatLng Barangay4 = new LatLng(14.0735, 120.6343);
        mMap.addMarker(new MarkerOptions().position(Barangay4).title("This is  Barangay 4"));

        LatLng Barangay5= new LatLng(14.0756, 120.6343);
        mMap.addMarker(new MarkerOptions().position(Barangay5).title("This is  Barangay 5"));

        LatLng Barangay6 = new LatLng(14.0684, 120.6374);
        mMap.addMarker(new MarkerOptions().position(Barangay6).title("This is  Barangay 6"));

        LatLng Barangay7 = new LatLng(14.0694, 120.6351);
        mMap.addMarker(new MarkerOptions().position(Barangay7).title("This is  Barangay 7"));

        LatLng Barangay8 = new LatLng(14.0698, 120.6337);
        mMap.addMarker(new MarkerOptions().position(Barangay8).title("This is  Barangay 8"));

        LatLng Barangay9 = new LatLng(14.0695, 120.6324);
        mMap.addMarker(new MarkerOptions().position(Barangay9).title("This is  Barangay 9"));

        LatLng Bilaran  = new LatLng(14.0487, 120.6846);
        mMap.addMarker(new MarkerOptions().position(Bilaran ).title("This is  Bilaran "));

        LatLng Bucana = new LatLng(14.0678, 120.6267);
        mMap.addMarker(new MarkerOptions().position(Bucana).title("This is  Bucana"));

        LatLng Bulihan  = new LatLng(14.1552, 120.6540);
        mMap.addMarker(new MarkerOptions().position(Bulihan ).title("This is  Bulihan "));


        LatLng Bunducan  = new LatLng(14.1069, 120.6521);
        mMap.addMarker(new MarkerOptions().position(Bunducan ).title("This is  Bunducan "));

        LatLng Butucan  = new LatLng(14.1394, 120.6805);
        mMap.addMarker(new MarkerOptions().position(Butucan ).title("This is  Butucan "));

        LatLng Calayo  = new LatLng(14.1461, 120.6141);
        mMap.addMarker(new MarkerOptions().position(Calayo ).title("This is  Calayo "));

        LatLng Catandaan  = new LatLng(14.0804, 120.6815);
        mMap.addMarker(new MarkerOptions().position(Catandaan ).title("This is  Catandaan "));

        LatLng Cogunan = new LatLng(14.0625, 120.6555);
        mMap.addMarker(new MarkerOptions().position(Cogunan).title("This is  Cogunan"));

        LatLng Dayap  = new LatLng(14.1013, 120.6627);
        mMap.addMarker(new MarkerOptions().position(Dayap ).title("This is  Dayap "));

        LatLng Kaylaway  = new LatLng(14.0747, 120.8172);
        mMap.addMarker(new MarkerOptions().position(Kaylaway ).title("This is  Kaylaway "));

        LatLng Kayrilaw  = new LatLng(14.1027, 120.7819);
        mMap.addMarker(new MarkerOptions().position(Kayrilaw ).title("This is  Kayrilaw "));

        LatLng Latag  = new LatLng(14.1164, 120.7124);
        mMap.addMarker(new MarkerOptions().position(Latag ).title("This is  Latag "));

        LatLng Looc  = new LatLng(14.1641, 120.6295);
        mMap.addMarker(new MarkerOptions().position(Looc ).title("This is  Looc "));

        LatLng Lumbangan  = new LatLng(14.0494, 120.6597);
        mMap.addMarker(new MarkerOptions().position(Lumbangan ).title("This is  Lumbangan "));

        LatLng MalapadnaBato = new LatLng(14.1116, 120.6828);
        mMap.addMarker(new MarkerOptions().position(MalapadnaBato).title("This is  Malapad na Bato"));

        LatLng MataasnaPulo = new LatLng(14.1122, 120.7452);
        mMap.addMarker(new MarkerOptions().position(MataasnaPulo).title("This is  Mataas na Pulo"));

        LatLng Maugat  = new LatLng(14.0868, 120.6767);
        mMap.addMarker(new MarkerOptions().position(Maugat ).title("This is  Maugat "));

        LatLng MuntingIndan = new LatLng(14.1031, 120.6985);
        mMap.addMarker(new MarkerOptions().position(MuntingIndan).title("This is  Munting Indan"));

        LatLng Natipuan  = new LatLng(14.1198, 120.6236);
        mMap.addMarker(new MarkerOptions().position(Natipuan ).title("This is  Natipuan "));

        LatLng Pantalan  = new LatLng(14.0907, 120.6323);
        mMap.addMarker(new MarkerOptions().position(Pantalan ).title("This is  Pantalan "));

        LatLng Papaya  = new LatLng(14.1919, 120.6096);
        mMap.addMarker(new MarkerOptions().position(Papaya ).title("This is  Papaya "));

        LatLng Putat  = new LatLng(14.0788, 120.6527);
        mMap.addMarker(new MarkerOptions().position(Putat ).title("This is  Putat "));

        LatLng Reparo  = new LatLng(14.0728, 120.6923);
        mMap.addMarker(new MarkerOptions().position(Reparo ).title("This is  Reparo v"));

        LatLng Talangan  = new LatLng(14.0777, 120.6358);
        mMap.addMarker(new MarkerOptions().position(Talangan ).title("This is  Talangan "));

        LatLng Tumalim  = new LatLng(14.0786, 120.7224);
        mMap.addMarker(new MarkerOptions().position(Tumalim ).title("This is  Tumalim "));

        LatLng Utod  = new LatLng(14.1195, 120.6479);
        mMap.addMarker(new MarkerOptions().position(Utod ).title("This is  Utod "));

        LatLng Wawa  = new LatLng(14.0824, 120.6244);
        mMap.addMarker(new MarkerOptions().position(Wawa ).title("This is  Wawa "));





    }
}