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
        adapter.addItem(new japanItem("덴푸라",R.drawable.japanfood4));
        adapter.addItem(new japanItem("오코노미야끼",R.drawable.japanfood5));
        adapter.addItem(new japanItem("타코야끼",R.drawable.japanfood6));
        adapter.addItem(new japanItem("야키소바",R.drawable.japanfood7));
        adapter.addItem(new japanItem("라멘",R.drawable.japanfood8));
        adapter.addItem(new japanItem("나베",R.drawable.japanfood9));
        adapter.addItem(new japanItem("야키토리",R.drawable.japanfood10));
        adapter.addItem(new japanItem("알밥",R.drawable.japanfood11));
        adapter.addItem(new japanItem("메밀소바",R.drawable.japanfood12));
        adapter.addItem(new japanItem("마끼",R.drawable.japanfood13));
        adapter.addItem(new japanItem("김초밥",R.drawable.japanfood14));
        adapter.addItem(new japanItem("오시즈시",R.drawable.japanfood15));
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