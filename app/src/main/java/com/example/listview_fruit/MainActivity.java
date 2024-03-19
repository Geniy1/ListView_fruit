package com.example.listview_fruit;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
String fruitList[]={"MEVALAR", "Olma", "Avakado", "Uzum", "Kiwi", "Mango", "Limon", "Papaya", "Shaftoli", "Qulupnay", "Tarvuz"};
int fruitImages[]={R.drawable.fruits, R.drawable.apple, R.drawable.avacado,
        R.drawable.grapps, R.drawable.kiwi, R.drawable.mango,
        R.drawable.orange, R.drawable.papaya, R.drawable.pear,
        R.drawable.strawberry, R.drawable.watermelon};
        ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter=new CustomBaseAdapter(getApplicationContext(), fruitList,fruitImages);
        listView.setAdapter(customBaseAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("CUSTOM_LIST_VIEW","Item bosildi @ Position :: "+position);
            }
        });
    }
}