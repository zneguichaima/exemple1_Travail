package com.example.travail_exemple1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Liste des items
        List<HightTechItem> HightTechItemList=new ArrayList<>();
        HightTechItemList.add(new HightTechItem("word","Editeur de texte","wordd"));
        HightTechItemList.add(new HightTechItem("Excel","Tableur","excell"));
        HightTechItemList.add(new HightTechItem("PowerPoint","Logiciel de présentation","powerpointt"));
        HightTechItemList.add(new HightTechItem("outlook","Client de courrier Electronique","outlookk"));

        //l'ajout de premier élemnts
        ListView officeListView=findViewById(R.id.my_Office);
        officeListView.setAdapter( new HightTechItemAdapter(this,HightTechItemList));
    }


        public  void alert(){
AlertDialog.Builder alert= new AlertDialog.Builder(this);
alert.setTitle("Sélection Item");
alert.setMessage("Votre Choix :");
alert.setPositiveButton("OK",null);
alert.create().show();

    }
}