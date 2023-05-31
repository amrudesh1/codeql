package com.teach.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.shreyaspatil.MaterialDialog.BottomSheetMaterialDialog

class EmulatorDetection : AppCompatActivity() {
    lateinit var materialDialog: BottomSheetMaterialDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emulator_detection)
        if (!isEmulator())
        {
            materialDialog = BottomSheetMaterialDialog.Builder(this)
                .setTitle("Emulator Detected")
                .setMessage("Please contact your bank to get your device trusted")
                .setAnimation("denied.json")
                .setCancelable(false)
                .build()
            val lottieAnimationView = materialDialog.getAnimationView()
            lottieAnimationView.scaleX = 0.4f
            lottieAnimationView.scaleY = 0.4f
            materialDialog.show()
        }
        else
        {
            materialDialog = BottomSheetMaterialDialog.Builder(this)
                .setTitle("Bypassed Emulator Detection")
                .setMessage("Please contact your bank to get your device trusted")
                .setAnimation("granted.json")
                .setCancelable(false)
                .build()
            val lottieAnimationView = materialDialog.getAnimationView()
            lottieAnimationView.scaleX = 0.4f
            lottieAnimationView.scaleY = 0.4f
            materialDialog.show()
        }
    }

    fun isEmulator(): Boolean
    {
        return EmulatorDetect.isEmulator()
    }
}