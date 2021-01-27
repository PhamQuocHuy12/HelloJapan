package com.example.hellojapan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void hiragana_onClick (View view){
        Button hiragana = findViewById(R.id.hiragana);
        ScrollView hiragana_board = findViewById(R.id.hiragana_board);
        ScrollView katakana_board = findViewById(R.id.katakana_board);
        katakana_board.setVisibility(View.GONE);
        hiragana_board.setVisibility(View.VISIBLE);
    }
    public void katakana_onClick (View view){
        Button katakana = findViewById(R.id.katakana);
        ScrollView katakana_board = findViewById(R.id.katakana_board);
        ScrollView hiragana_board = findViewById(R.id.hiragana_board);
        hiragana_board.setVisibility(View.GONE);
        katakana_board.setVisibility(View.VISIBLE);
    }
    public void ka_click (View view){
        Button hira = findViewById(R.id.hira_ka);
        Button kata = findViewById(R.id.kata_ka);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ka);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ki_click (View view){
        Button hira = findViewById(R.id.hira_ki);
        Button kata = findViewById(R.id.kata_ki);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ki);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ku_click (View view){
        Button hira = findViewById(R.id.hira_ku);
        Button kata = findViewById(R.id.kata_ku);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ku);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ke_click (View view){
        Button hira = findViewById(R.id.hira_ke);
        Button kata = findViewById(R.id.kata_ke);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.e);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ko_click (View view){
        Button hira = findViewById(R.id.hira_ko);
        Button kata = findViewById(R.id.kata_ko);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.o);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void a_click (View view){
        Button hira = findViewById(R.id.hira_a);
        Button kata = findViewById(R.id.kata_a);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.a);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void i_click (View view){
        Button hira = findViewById(R.id.hira_i);
        Button kata = findViewById(R.id.kata_i);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.i);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void u_click (View view){
        Button hira = findViewById(R.id.hira_u);
        Button kata = findViewById(R.id.kata_u);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.u);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void e_click (View view){
        Button hira = findViewById(R.id.hira_e);
        Button kata = findViewById(R.id.kata_e);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.e);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void o_click (View view){
        Button hira = findViewById(R.id.hira_o);
        Button kata = findViewById(R.id.kata_o);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.o);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void sa_click (View view){
        Button hira = findViewById(R.id.hira_sa);
        Button kata = findViewById(R.id.kata_sa);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.sa);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void shi_click (View view){
        Button hira = findViewById(R.id.hira_shi);
        Button kata = findViewById(R.id.kata_shi);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.shi);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void su_click (View view){
        Button hira = findViewById(R.id.hira_su);
        Button kata = findViewById(R.id.kata_su);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.su);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void se_click (View view){
        Button hira = findViewById(R.id.hira_se);
        Button kata = findViewById(R.id.kata_se);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.se);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void so_click (View view){
        Button hira = findViewById(R.id.hira_so);
        Button kata = findViewById(R.id.kata_so);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.so);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ta_click (View view){
        Button hira = findViewById(R.id.hira_ta);
        Button kata = findViewById(R.id.kata_ta);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ta);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void chi_click (View view){
        Button hira = findViewById(R.id.hira_chi);
        Button kata = findViewById(R.id.kata_chi);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.chi);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void tsu_click (View view){
        Button hira = findViewById(R.id.hira_tsu);
        Button kata = findViewById(R.id.kata_tsu);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.tsu);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void te_click (View view){
        Button hira = findViewById(R.id.hira_te);
        Button kata = findViewById(R.id.kata_te);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.te);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void to_click (View view){
        Button hira = findViewById(R.id.hira_to);
        Button kata = findViewById(R.id.kata_to);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.to);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void na_click (View view){
        Button hira = findViewById(R.id.hira_na);
        Button kata = findViewById(R.id.kata_na);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.na);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ni_click (View view){
        Button hira = findViewById(R.id.hira_ni);
        Button kata = findViewById(R.id.kata_ni);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ni);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void nu_click (View view){
        Button hira = findViewById(R.id.hira_nu);
        Button kata = findViewById(R.id.kata_nu);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.nu);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ne_click (View view){
        Button hira = findViewById(R.id.hira_ne);
        Button kata = findViewById(R.id.kata_ne);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ne);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void no_click (View view){
        Button hira = findViewById(R.id.hira_no);
        Button kata = findViewById(R.id.kata_no);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.no);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ha_click (View view){
        Button hira = findViewById(R.id.hira_ha);
        Button kata = findViewById(R.id.kata_ha);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ha);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void hi_click (View view){
        Button hira = findViewById(R.id.hira_hi);
        Button kata = findViewById(R.id.kata_hi);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.hi);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void fu_click (View view){
        Button hira = findViewById(R.id.hira_fu);
        Button kata = findViewById(R.id.kata_fu);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.fu);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void he_click (View view){
        Button hira = findViewById(R.id.hira_he);
        Button kata = findViewById(R.id.kata_he);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.he);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ho_click (View view){
        Button hira = findViewById(R.id.hira_ho);
        Button kata = findViewById(R.id.kata_ho);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ho);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ma_click (View view){
        Button hira = findViewById(R.id.hira_ma);
        Button kata = findViewById(R.id.kata_ma);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ma);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void mi_click (View view){
        Button hira = findViewById(R.id.hira_mi);
        Button kata = findViewById(R.id.kata_mi);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.mi);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void mu_click (View view){
        Button hira = findViewById(R.id.hira_mu);
        Button kata = findViewById(R.id.kata_mu);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.mu);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void me_click (View view){
        Button hira = findViewById(R.id.hira_me);
        Button kata = findViewById(R.id.kata_me);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.me);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void mo_click (View view){
        Button hira = findViewById(R.id.hira_mo);
        Button kata = findViewById(R.id.kata_mo);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.mo);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ya_click (View view){
        Button hira = findViewById(R.id.hira_ya);
        Button kata = findViewById(R.id.kata_ya);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ya);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void yu_click (View view){
        Button hira = findViewById(R.id.hira_yu);
        Button kata = findViewById(R.id.kata_yu);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.yu);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void yo_click (View view){
        Button hira = findViewById(R.id.hira_yo);
        Button kata = findViewById(R.id.kata_yo);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.yo);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void wa_click (View view){
        Button hira = findViewById(R.id.hira_wa);
        Button kata = findViewById(R.id.kata_wa);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.wa);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void wo_click (View view){
        Button hira = findViewById(R.id.hira_wo);
        Button kata = findViewById(R.id.kata_wo);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.wo);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ra_click (View view){
        Button hira = findViewById(R.id.hira_ra);
        Button kata = findViewById(R.id.kata_ra);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ra);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ri_click (View view){
        Button hira = findViewById(R.id.hira_ri);
        Button kata = findViewById(R.id.kata_ri);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ri);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ru_click (View view){
        Button hira = findViewById(R.id.hira_ru);
        Button kata = findViewById(R.id.kata_ru);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ru);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void re_click (View view){
        Button hira = findViewById(R.id.hira_re);
        Button kata = findViewById(R.id.kata_re);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.re);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void ro_click (View view){
        Button hira = findViewById(R.id.hira_ro);
        Button kata = findViewById(R.id.kata_ro);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.ro);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }
    public void n_click (View view){
        Button hira = findViewById(R.id.hira_n);
        Button kata = findViewById(R.id.kata_n);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.n);
        hira.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
        kata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sound.start();
            }
        });
    }


}