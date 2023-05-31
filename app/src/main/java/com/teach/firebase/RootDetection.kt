package com.teach.firebase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.scottyab.rootbeer.RootBeer
import dev.shreyaspatil.MaterialDialog.BottomSheetMaterialDialog


class RootDetection : AppCompatActivity() {
    lateinit var materialDialog: BottomSheetMaterialDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_root_detection)

        if (isDeviceRooted())
        {
            materialDialog = BottomSheetMaterialDialog.Builder(this)
                .setTitle("Your Device is not trusted")
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
                .setTitle("Your Device is trusted")
                .setMessage("Root Check Bypassed")
                .setAnimation("granted.json")
                .setCancelable(false)
                .build()
            val lottieAnimationView = materialDialog.getAnimationView()
            lottieAnimationView.scaleX = 0.4f
            lottieAnimationView.scaleY = 0.4f
            materialDialog.show()
        }
    }

    fun isDeviceRooted(): Boolean {
        return RootBeer(this).isRooted
    }
}