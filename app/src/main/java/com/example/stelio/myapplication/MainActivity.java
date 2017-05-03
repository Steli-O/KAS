package com.example.stelio.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    Button button;
    private static final int     PICKFILE_REQUEST_CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    //Button Loadbutton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.erschte);
        button=(Button)findViewById(R.id.LoadB);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("file/*");
                startActivityForResult(intent, PICKFILE_REQUEST_CODE);
            }
        });
    }
}

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

/*




        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("file/*");
                startActivityForResult(intent, PICKFILE_REQUEST_CODE);
            }
        });
    }
}*/