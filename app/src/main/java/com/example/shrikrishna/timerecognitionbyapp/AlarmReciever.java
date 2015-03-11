package com.example.shrikrishna.timerecognitionbyapp;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Shri Krishna on 14/2/2015.
 */
public class AlarmReciever extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        //Toast.makeText(getContext(),"shri krishna",Toast.LENGTH_SHORT).show();
   // String alarm=intent.getExtras().getString("alarm");
       // if(alarm.equals("on") == true){
            BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!mBluetoothAdapter.isEnabled()){
                mBluetoothAdapter.enable();
            }
            else{
                mBluetoothAdapter.disable();
       }
//        else{
  //          BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    //        if (mBluetoothAdapter.isEnabled()){
      //          mBluetoothAdapter.disable();
        //    }
        //}


    }

}
