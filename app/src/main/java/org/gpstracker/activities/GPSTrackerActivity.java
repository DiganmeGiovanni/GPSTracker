package org.gpstracker.activities;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import org.gpstracker.R;

public class GPSTrackerActivity extends ActionBarActivity {

    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpstracker);

        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gpstracker, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void registerLocation() {
        Location lastKnownLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        double lat = lastKnownLocation.getLatitude();
        double lon = lastKnownLocation.getLongitude();

        String location = "Lat: " + lat + ", Lon: " + lon;
        Toast tmp = Toast.makeText(this, location, Toast.LENGTH_SHORT);
        tmp.show();
    }

    public void startRoute(View v) {
        Toast tmp = Toast.makeText(this, "Iniciando ruta", Toast.LENGTH_LONG);
        tmp.show();
        registerLocation();
    }

    public void finishRoute(View v) {
        Toast tmp = Toast.makeText(this, "Ruta finalizada", Toast.LENGTH_LONG);
        tmp.show();
    }
}
