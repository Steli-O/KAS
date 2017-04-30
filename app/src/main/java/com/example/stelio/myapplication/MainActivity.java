package com.example.stelio.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import ij.IJ;
import ij.ImagePlus;
import ij.gui.*;
import ij.process.*;
import ij.util.DicomTools;
import ij.gui.GenericDialog;
import ij.io.Opener;

import static ij.IJ.open;

public class MainActivity extends AppCompatActivity {

    public Uri imp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.erschte);
        //ImagePlus imp = IJ.openImage("http://wsr.imagej.net/images/ct.dcm.zip");
        //ImageView im =(ImageView)findViewById(R.id.imageView);
        //open("http://wsr.imagej.net/images/ct.dcm.zip");
      //from URL
       // Opener opener = new Opener();
       // ImagePlus imp = opener.openImage("http://wsr.imagej.net/images/ct.dcm.zip");

      //from PATH
        //Opener opener = new Opener();
       //ImagePlus imp = opener.openImage("C:/Users/SteliO/Desktop/ct.dcm");
        //imp.show();
    }
}
