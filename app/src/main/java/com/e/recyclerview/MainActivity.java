package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        recyclerView=findViewById(R.id.recyclerView);

        List<Contacts>contactsList =new ArrayList<>();
        contactsList.add(new Contacts("saugat malla","9860182664",R.drawable.saugat));
        contactsList.add(new Contacts("rajesh hamal","986018266",R.drawable.rajesh));
        contactsList.add(new Contacts("bhuwan kc","9860182664",R.drawable.bhuwan));
        contactsList.add(new Contacts("dayahang rai","9860182664",R.drawable.dahayang));


//        contactsList.add(new Contacts("saugs"));
//        contactsList.add(new Contacts(name: "Saugat Malla",phoneNo: "9860182664",R.drawable.rajesh));
//        contactsList.add(new Contacts(name: "Saugat Malla",phoneNo: "9860182664",R.drawable.dahayang));
//        contactsList.add(new Contacts(name: "Saugat Malla",phoneNo: "9860182664",R.drawable.bhuwan));


        ContactAdapter contactsAdapter=new ContactAdapter(this,contactsList);

        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

    }


}
