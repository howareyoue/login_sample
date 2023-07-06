package com.example.login_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class japanfoodActivity extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanfood);

        ListView listView = findViewById(R.id.listView);
        JapanfoodAdapter adapter = new JapanfoodAdapter();
        adapter.addItem(new japanItem("오니기리",R.drawable.japanfood));
        adapter.addItem(new japanItem("돈부리",R.drawable.japanfood1));
        adapter.addItem(new japanItem("카마메시",R.drawable.japanfood2));
        adapter.addItem(new japanItem("스시",R.drawable.japanfood3));
        listView.setAdapter(adapter);
    }

    class JapanfoodAdapter extends BaseAdapter{
        ArrayList<japanItem> items = new ArrayList<japanItem>();

        @Override
        public int getCount() {

            return items.size();
        }

        public void addItem(japanItem item){

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
            japanItemview view = null;
            if(convertView == null){
                view = new japanItemview(getApplicationContext());
            }
            else{
                view = (japanItemview) convertView;
            }
            japanItem item = items.get(position);
            view.setName(item.getName());
            view.setImage(item.getResid());
            return view;
        }
    }
}