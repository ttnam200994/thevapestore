package com.example.tienduong.drugstore.ListViewCustom;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.tienduong.drugstore.R;

import java.util.ArrayList;

/**
 * Created by tien.duong on 8/17/2016.
 */
public class GroupItemAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> name;
    ArrayList<String> imgRes;
    private static LayoutInflater inflater=null;

    public GroupItemAdapter(Context activity, ArrayList<String> item, ArrayList<String> img){
        context = activity;
        name = item;
        imgRes = img;
        inflater = ( LayoutInflater )activity.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int i) {
        return name.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View v = convertView;
        if (v == null) {
            v = inflater.inflate(R.layout.groupitem, null);
        }

        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        v.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,displayMetrics.heightPixels/4));

        /*ImageView img = (ImageView) v.findViewById(R.id.imgItem);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(displayMetrics.widthPixels/2,displayMetrics.heightPixels/6);
        params.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
        img.setLayoutParams(params);
        img.setScaleType(ImageView.ScaleType.FIT_XY);*/

        FrameLayout color = (FrameLayout) v.findViewById(R.id.colorItem);
        color.getBackground().setColorFilter(Color.parseColor("#"+imgRes.get(position)), PorterDuff.Mode.DARKEN);
        Log.e("AA","#"+imgRes.get(position));
        TextView tt2 = (TextView) v.findViewById(R.id.txtName);
        if (tt2 != null) {
            tt2.setText(name.get(position));
        }
        Animation animationY = new TranslateAnimation(-v.getWidth(), 0, 0, 0);
        animationY.setDuration(1000);
        v.startAnimation(animationY);
        animationY = null;

        return v;
    }
}
