package com.example.login_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class usafoodActivity extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usafood);

        ListView listView = findViewById(R.id.listView);
        UsafoodAdapter adapter = new UsafoodAdapter();
        adapter.addItem(new usaItem("연어 스테이크",R.drawable.usafood));
        adapter.addItem(new usaItem("토마토 크림치즈 타파즈",R.drawable.usafood1));
        adapter.addItem(new usaItem("조개버터구이",R.drawable.usafood2));
        adapter.addItem(new usaItem("연어 롤",R.drawable.usafood3));
        listView.setAdapter(adapter);
    }ㅛ

    class UsafoodAdapter extends BaseAdapter{
        ArrayList<usaItem> items = new ArrayList<usaItem>();

        @Override
        public int getCount() {

            return items.size();
        }

        public void addItem(usaItem item){

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
            usaItemView view = null;
            if(convertView == null){
                view = new usaItemView(getApplicationContext());
            }
            else{
                view = (usaItemView) convertView;
            }
            usaItem item = items.get(position);
            view.setName(item.getName());
            view.setImage(item.getResid());
            return view;
        }
    }
}