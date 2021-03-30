package com.tugas3.gofajartif;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {
                "Rumah Sakit Awal Bross",
                "Rumah Sakit Eka Hospital",
                "Rumah Sakit Jiwa Tampan",
                "Rumah Sakit Tabrani",
                "Rumah Sakit Arifin Ahmad",
                "Rumah Sakit Syafira",
                "Rumah Sakit Zainab"
        };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRS));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equalsIgnoreCase("Rumah Sakit Awal Bross")) {
                a = new Intent(this, RSAwalBross.class);


            } else if (pilihan.equalsIgnoreCase("Rumah Sakit Eka Hospital")){
                a = new Intent(this, RSEkaHospital.class);

            } else if (pilihan.equalsIgnoreCase("Rumah Sakit Jiwa Tampan")){
                a = new Intent(this, RSJiwaTampan.class);

            } else if (pilihan.equalsIgnoreCase("Rumah Sakit Tabrani")){
                a = new Intent(this, RSTabrani.class);

            } else if (pilihan.equalsIgnoreCase("Rumah Sakit Arifin Ahmad")){
                a = new Intent(this, RSArifinAhmad.class);

            } else if (pilihan.equalsIgnoreCase("Rumah Sakit Syafira")){
                a = new Intent(this, RSSyafira.class);

            } else if (pilihan.equalsIgnoreCase("Rumah Sakit Zainab")){
                a = new Intent(this, RSZainab.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
