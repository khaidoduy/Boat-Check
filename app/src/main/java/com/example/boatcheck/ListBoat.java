package com.example.boatcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListBoat extends AppCompatActivity {
    AdapterBoat adapterBoat ;
    ArrayList<Boat> boatArrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_boat);
        listView =(ListView)findViewById(R.id.listViewBoat);
        boatArrayList=new ArrayList<>();
        //Boat boat=new Boat(1,"Tuần tra 1",500,600,"hinh A",10000,1);
       // boatArrayList.add(boat);
        adapterBoat= new AdapterBoat(this,R.layout.row_info_boat,boatArrayList);

        listView.setAdapter(adapterBoat);
    }
}
