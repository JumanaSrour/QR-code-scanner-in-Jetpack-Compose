package com.example.barcodeexample.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.barcodeexample.QrCodeAnalyzer
import com.example.barcodeexample.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
            QrCodeScannerComposeTheme{

            }
        }
    }
}
