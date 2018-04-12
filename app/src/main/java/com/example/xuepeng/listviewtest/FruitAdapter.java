package com.example.xuepeng.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xuepeng on 18/4/12.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;


    public FruitAdapter(@NonNull Context context, int textResourceId, List<Fruit>objects) {
        super(context, textResourceId,objects);
        resourceId=textResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit=getItem(position);
        View view;
        Viewholder viewholder;
        if(convertView==null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewholder=new Viewholder();
            viewholder.fruitImage=view.findViewById(R.id.fruitImage);
            viewholder.fruitName=view.findViewById(R.id.fruitName);
            view.setTag(viewholder);
        }else{
            view=convertView;
            viewholder= (Viewholder) view.getTag();
        }
        viewholder.fruitImage.setImageResource(fruit.getImageId());
        viewholder.fruitName.setText(fruit.getName());
        return view;
    }

    class Viewholder{
        ImageView fruitImage;
        TextView fruitName;
    }

}
