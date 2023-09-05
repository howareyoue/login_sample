package com.example.login_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class koreafoodActivity extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koreafood);

        ListView listView = findViewById(R.id.listView);
        KoreafoodAdapter adapter = new KoreafoodAdapter();
        adapter.addItem(new koreaItem("김치찌개",R.drawable.koreafood));
        adapter.addItem(new koreaItem("비빔밥",R.drawable.koreafood1));
        adapter.addItem(new koreaItem("떡국",R.drawable.koreafood2));
        adapter.addItem(new koreaItem("불고기",R.drawable.koreafood3));
        adapter.addItem(new koreaItem("떡갈비",R.drawable.koreafood4));
        adapter.addItem(new koreaItem("삼겹살",R.drawable.koreafood5));
        adapter.addItem(new koreaItem("잡채",R.drawable.koreafood6));
        adapter.addItem(new koreaItem("된장찌개",R.drawable.koreafood7));
        adapter.addItem(new koreaItem("삼계탕",R.drawable.koreafood8));
        adapter.addItem(new koreaItem("육회",R.drawable.koreafood9));
        adapter.addItem(new koreaItem("떡볶이",R.drawable.koreafood10));
        adapter.addItem(new koreaItem("쪽갈비",R.drawable.koreafood11));
        adapter.addItem(new koreaItem("참치찌개",R.drawable.koreafood12));
        adapter.addItem(new koreaItem("갈비찜",R.drawable.koreafood13));
        adapter.addItem(new koreaItem("김치전",R.drawable.koreafood14));
        adapter.addItem(new koreaItem("갈비탕",R.drawable.koreafood15));
        listView.setAdapter(adapter);
    }

    class KoreafoodAdapter extends BaseAdapter{
        ArrayList<koreaItem> items = new ArrayList<koreaItem>();

        @Override
        public int getCount() {

            return items.size();
        }

        public void addItem(koreaItem item){

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
            koreaItemView view = null;
            if(convertView == null){
                view = new koreaItemView(getApplicationContext());
            }
            else{
                view = (koreaItemView) convertView;
            }
            koreaItem item = items.get(position);
            view.setName(item.getName());
            view.setImage(item.getResid());
            return view;
        }
    }
}