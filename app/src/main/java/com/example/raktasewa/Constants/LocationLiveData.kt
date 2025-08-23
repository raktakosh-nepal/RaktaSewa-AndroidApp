//package com.example.raktasewa.Constants
//
//import android.Manifest
//import android.content.Context
//import android.content.pm.PackageManager
//import android.location.Location
//import androidx.core.app.ActivityCompat
//import androidx.lifecycle.LiveData
//import com.google.android.gms.location.LocationServices
//
//class LocationLiveData(var context: Context) : LiveData<LocationDetails>() {
//    private val fusedLocationClient = LocationServices.getFusedLocationProviderClient(context)
//
//    override fun onActive() {
//        super.onActive()
//        if (ActivityCompat.checkSelfPermission(
//                context,
//                Manifest.permission.ACCESS_FINE_LOCATION
//            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
//                context,
//                Manifest.permission.ACCESS_COARSE_LOCATION
//            ) != PackageManager.PERMISSION_GRANTED
//        ) {
//            // TODO: Consider calling
//            //    ActivityCompat#requestPermissions
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for ActivityCompat#requestPermissions for more details.
//            return
//        }
//        fusedLocationClient.lastLocation.addOnSuccessListener { location ->
//            location.also {
////                setLocationData(it)
//            }
//        }
//    }
//
//    override fun onInactive() {
//        super.onInactive()
//    }
//
//    private fun startLocationUpdate() {
//        fusedLocationClient.requestLocationUpdates(locationRequest)
//    }
//
//    private fun setLocationData(location: Location?) {
//        location?.let { location ->
//            value = LocationDetails(location.latitude.toFloat(), location.longitude.toFloat())
//        }
//    }
//
//    companion object {
//        val ONE_MINUTE = 60000
//        val locationRequest: com.google.android.gms.location.LocationRequest =
//            com.google.android.gms.location.LocationRequest.create().apply {
//                interval=ONE_MINUTE
//            }
//    }
//}
//
//
