package com.example.tienduong.drugstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.tienduong.drugstore.ListViewCustom.GroupItemAdapter;
import com.example.tienduong.drugstore.ListViewCustom.MyListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout groupItemLayout;
    ListView groupItemListview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupItemLayout = (LinearLayout) findViewById(R.id.groupItemLayout);
        groupItemListview = (ListView) findViewById(R.id.groupItemListView);

        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> img = new ArrayList<String>();
        img.add("2c3e50");
        img.add("2980b9");
        img.add("16a085");
        img.add("8e44ad");
        img.add("8e44ad");
        img.add("8e44ad");
        img.add("8e44ad");
        img.add("8e44ad");
        img.add("8e44ad");
        name.add("HATS");
        name.add("SHOES");
        name.add("BAGS");
        name.add("EYEWEAR");
        name.add("EYEWEAR");
        name.add("EYEWEAR");
        name.add("EYEWEAR");
        name.add("EYEWEAR");
        name.add("EYEWEAR");
        setGroupItemData(name,img);

    }

    private void setGroupItemData(ArrayList<String> name,ArrayList<String> img){
        groupItemListview.setAdapter(new GroupItemAdapter(this,name,img));
    }
}
