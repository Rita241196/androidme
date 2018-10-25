package com.example.islamiyahchimpony.Praktikum1;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //inisiasi object bertipe BodyPartsFrament
            BodyPartsFragment bodyFragment;
            //inisiasi adapter untuk mengaktifkan fragment
            FragmentManager fragmentManager = getSupportFragmentManager();
    //pengecekan agar fragment hanya dibuat sekali saja.
            if(savedInstanceState == null) {
                //membuat object untuk heads  dengan men-setting list gambar yang dipanggil serta index nya.
                //setimageids untu mengisi image pada bodypartsfragment variabel imageids
                bodyFragment = new BodyPartsFragment();
                bodyFragment.setImageIds(ImageAssets.getHeads());
                bodyFragment.setmListIndex(0);
                //transaksi fragment
                fragmentManager.beginTransaction().add(R.id.heads_container, bodyFragment).commit();
//            Toast.makeText(this, "Event Create", Toast.LENGTH_SHORT).show();

                //membuat object untuk bodies  dengan men-setting list gambar yang dipanggil serta index nya.
                bodyFragment = new BodyPartsFragment();
                bodyFragment.setImageIds(ImageAssets.getBodies());
                bodyFragment.setmListIndex(0);
                //transaksi fragment
                fragmentManager.beginTransaction().add(R.id.bodies_container, bodyFragment).commit();
//                fragmentManager.beginTransaction().replace()
//            Toast.makeText(this, "Event Create", Toast.LENGTH_SHORT).show();

                //membuat object untuk legs  dengan men-setting list gambar yang dipanggil serta index nya.
                bodyFragment = new BodyPartsFragment();
                bodyFragment.setImageIds(ImageAssets.getLegs());
                bodyFragment.setmListIndex(0);
                //transaksi fragment
                fragmentManager.beginTransaction().add(R.id.legs_container, bodyFragment).commit();
//            Toast.makeText(this, "Event Create", Toast.LENGTH_SHORT).show();
            }
        }

//        @Override
//        protected void onStart() {
//            super.onStart();
//            Toast.makeText(this, "Event Start", Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        protected void onStop() {
//            super.onStop();
//            Toast.makeText(this, "Event Stop", Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        protected void onPause() {
//            super.onPause();
//            Toast.makeText(this, "Event Pause", Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        protected void onResume() {
//            super.onResume();
//            Toast.makeText(this, "Event Resume", Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        protected void onRestart() {
//            super.onRestart();
//            Toast.makeText(this, "Event Restart", Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        protected void onDestroy() {
//            super.onDestroy();
//            Toast.makeText(this, "Event Destroy", Toast.LENGTH_SHORT).show();
//        }

//        Button ton = (Button) findViewById(R.id.button);
//        ton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent inte = new Intent(MainActivity.this, Main2Activity.class);
//                startActivity(inte);
//            }
//        });

}
