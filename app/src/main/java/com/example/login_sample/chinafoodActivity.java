package com.example.login_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class chinafoodActivity extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinafood);

        ListView listView = findViewById(R.id.listView);
        ChinafoodAdapter adapter = new ChinafoodAdapter();
        adapter.addItem(new chinaItem("짜장면",R.drawable.chinafood));
        adapter.addItem(new chinaItem("짬뽕",R.drawable.chinafood1));
        adapter.addItem(new chinaItem("볶음밥",R.drawable.chinafood2));
        adapter.addItem(new chinaItem("탕수육",R.drawable.chinafood3));
        adapter.addItem(new chinaItem("토마토 계란 볶음면",R.drawable.chinafood4));
        adapter.addItem(new chinaItem("냉짬뽕",R.drawable.chinafood5));
        adapter.addItem(new chinaItem("마파두부",R.drawable.chinafood6));
        adapter.addItem(new chinaItem("꿔바로우",R.drawable.chinafood7));
        adapter.addItem(new chinaItem("유림기",R.drawable.chinafood8));
        adapter.addItem(new chinaItem("우육탕면",R.drawable.chinafood9));
        adapter.addItem(new chinaItem("해파리냉채",R.drawable.chinafood10));

        listView.setAdapter(adapter);
    }

    class ChinafoodAdapter extends BaseAdapter{
        ArrayList<chinaItem> items = new ArrayList<chinaItem>();

        @Override
        public int getCount() {

            return items.size();
        }

        public void addItem(chinaItem item){

            items.add(item);
        }

        @Override
        public Object getItem(int position) {

            return items.get(position);
        }

        @Override
        public long getItemId(int position) {

            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            chinaItemView view = null;
            if(convertView == null){
                view = new chinaItemView(getApplicationContext());
            }
            else{
                view = (chinaItemView) convertView;
            }
            chinaItem item = items.get(position);
            view.setName(item.getName());
            view.setImage(item.getResid());
            return view;
        }
    }
}