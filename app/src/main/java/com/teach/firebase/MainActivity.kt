package com.teach.firebase

import android.content.ComponentName
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val i = Intent()
        i.component = ComponentName("com.happay.v2.travel", "com.happay.v2.travel.AuthenticatorService")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            var i = startForegroundService(i)
        }
        if (i == null) {
            Toast.makeText(this, "Service Not Found", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Service Found", Toast.LENGTH_SHORT).show()
        }

        val data = "home".contains("Home");
    }




}
//    fun justOneHintTheFlagisInFlagJson(database: DatabaseReference): String {
//        val dummyFunction = "flag.json"
//        val againADummyCode = "flag.json"
//        val str = dummyFunction + againADummyCode
//
//        val firebaseDatabase = FirebaseDatabase.getInstance().reference
//        return "Get_The_Instance_of_Firebase_And_HookIt"
//    }


//    val database = FirebaseDatabase.getInstance().reference
//        justOneHintTheFlagisInFlagJson(database)
//
//        val button = findViewById<Button>(R.id.button_hint)
//        val rootButton = findViewById<Button>(R.id.root_detect)
//        val emulatorButton = findViewById<Button>(R.id.emulator_detect)
//
//        button.setOnClickListener {
//            Toast.makeText(this, justOneHintTheFlagisInFlagJson(database), Toast.LENGTH_LONG).show()
//        }
//
//        rootButton.setOnClickListener {
//            val intent = Intent(this, RootDetection::class.java)
//            startActivity(intent)
//        }
//
//        emulatorButton.setOnClickListener {
//            val intent = Intent(this, EmulatorDetection::class.java)
//            startActivity(intent)
//        }
//
//        //Just one comment over here its in flag.json

