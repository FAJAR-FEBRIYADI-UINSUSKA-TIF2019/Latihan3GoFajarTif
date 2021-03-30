package com.tugas3.gofajartif;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSEkaHospital extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAct = new String[] {
                "Call Center",
                "Sms Center",
                "Driving Direction",
                "Website",
                "Info Google",
                "Exit"
        };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAct));
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
            if (pilihan.equalsIgnoreCase("Call Center")) {
                String nomortel = "tel: 0761-6989999";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            } else if (pilihan.equalsIgnoreCase("Sms Center")){
                String smsText = "Rs Eka Hospital Fajar Febriyadi H/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:081212341235"));
                a.putExtra("sms_body", smsText);

            } else if (pilihan.equalsIgnoreCase("Driving Direction")) {
                String lokasirs = "google.navigation:q=0.5196457000363593,101.43186235350635";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            } else if (pilihan.equalsIgnoreCase("Website")) {
                String website = "https://www.ekahospital.com/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equalsIgnoreCase("Info Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Rumah Sakit Eka Hospital");

            } else if (pilihan.equalsIgnoreCase("Exit")){
                a = new Intent(RSEkaHospital.this,RS.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
