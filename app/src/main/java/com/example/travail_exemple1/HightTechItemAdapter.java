package com.example.travail_exemple1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HightTechItemAdapter extends BaseAdapter {
    //les attributs
    // contexte : tt les information de l'application
    private Context context;
    private List<HightTechItem>hightTechItemList;
    private LayoutInflater inflater;

    public HightTechItemAdapter(Context context, List<HightTechItem> hightTechItemList) {
        this.context = context;
        this.hightTechItemList = hightTechItemList;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return hightTechItemList.size();
    }

    @Override //retourner objet et dans notre cas c HightTechItem
    public HightTechItem getItem(int Position) {
        return hightTechItemList.get(Position);//retourner léelemnt zero
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override//dont le quel on personnliser chaque élemnts
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.adapter_item,null);
        //recupurer item courent
        //création nouvelle variable de types HitechItem avec la position sera i
        HightTechItem CurrentItem=getItem(i);
        String item_name=CurrentItem.getName();
        String menonic=CurrentItem.getMenonic();
        String description=CurrentItem.getDescription();

        //get icon
        ImageView itemIconView= view.findViewById(R.id.item_image);
        String resourceName="item_"+menonic+"_icon";
        int resId=context.getResources().getIdentifier(resourceName,"drawable",context.getPackageName());
        itemIconView.setImageResource(resId);

//get name
        TextView item_nameView=view.findViewById(R.id.item_name);
        item_nameView.setText(item_name);
        //get prix
        TextView descriptionView=view.findViewById(R.id.description);
        descriptionView.setText(description);

        return view;

    }
}
