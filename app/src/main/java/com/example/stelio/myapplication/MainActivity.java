package com.example.stelio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import ij.IJ;
import ij.util.DicomTools;
import ij.gui.GenericDialog;


public class MainActivity extends AppCompatActivity {

    public ij.ImagePlus imp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imp = IJ.openImage("C:/Users/SteliO/Desktop/ct.dcm");
        imp.show();

    }
}
