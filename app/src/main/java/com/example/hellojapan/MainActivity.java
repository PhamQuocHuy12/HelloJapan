package com.example.hellojapan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer sound;
    private ConstraintLayout layout;
    private ScrollView hiragana_board;
    private ScrollView katakana_board;
    private TextView board_name;
    private Button hiragana;
    private Button katakana;
    private Animation fade_in;
    private Animation fade_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sound = MediaPlayer.create(this, R.raw.u);
        layout = findViewById(R.id.main);
        hiragana_board = findViewById(R.id.hiragana_board);
        board_name =  findViewById(R.id.board_name);
        hiragana = findViewById(R.id.hiragana);
        katakana = findViewById(R.id.katakana);
        katakana_board = findViewById(R.id.katakana_board);
        fade_in = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
    }

    @Override
    protected void onStart(){
        super.onStart();

        hiragana_board.animate().alpha(1).setDuration(1000).start();
        hiragana.animate().alpha(1).setDuration(1000).start();
        board_name.animate().alpha(1).setDuration(1000).start();
        katakana.animate().alpha(1).setDuration(1000).start();
    }
    @Override
    protected void onResume(){
        super.onResume();

//        hiragana_board.animate().alpha(1).setDuration(1000).start();
//        hiragana.animate().alpha(1).setDuration(1000).start();
//        board_name.animate().alpha(1).setDuration(1000).start();
//        katakana.animate().alpha(1).setDuration(1000).start();
    }

    public void hiragana_onClick (View view){
        katakana_board.animate().alpha(0).setDuration(1000).start();

        hiragana.setBackgroundResource(R.drawable.press_bg_1);
        katakana.setBackgroundResource(R.drawable.button_bg);

        layout.startAnimation(fade_out);
        layout.setBackgroundResource(R.drawable.day);
        layout.startAnimation(fade_in);

        katakana_board.setVisibility(View.GONE);
        hiragana_board.setVisibility(View.VISIBLE);

        board_name.setText("Hiragana");
        board_name.setTextColor(Color.parseColor("#FFFFFF"));

        hiragana_board.animate().alpha(1).setDuration(500).start();
    }

    public void katakana_onClick (View view){
        hiragana_board.animate().alpha(0).setDuration(500).start();

        katakana.setBackgroundResource(R.drawable.press_bg_2);
        hiragana.setBackgroundResource(R.drawable.kata_button_bg);

        hiragana_board.setVisibility(View.GONE);
        katakana_board.setVisibility(View.VISIBLE);

        layout.startAnimation(fade_out);
        layout.setBackgroundResource(R.drawable.night);
        layout.startAnimation(fade_in);

        board_name.setText("Katakana");
        board_name.setTextColor(Color.parseColor("#FFBF00"));

        katakana_board.animate().alpha(1).setDuration(1000).start();
    }
    public void ka_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ka);
        sound.start();
    }
    public void ki_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ki);
        sound.start();
    }
    public void ku_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ku);
        sound.start();
    }
    public void ke_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ke);
        sound.start();
    }
    public void ko_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ko);
        sound.start();
    }
    public void a_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.a);
        sound.start();
    }
    public void i_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.i);
        sound.start();
    }
    public void u_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.u);
        sound.start();
    }
    public void e_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.e);
        sound.start();
    }
    public void o_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.o);
        sound.start();
    }
    public void sa_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.sa);
        sound.start();
    }
    public void shi_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.shi);
        sound.start();
    }
    public void su_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.su);
        sound.start();
    }
    public void se_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.se);
        sound.start();
    }
    public void so_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.so);
        sound.start();
    }
    public void ta_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ta);
        sound.start();
    }
    public void chi_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.chi);
        sound.start();
    }
    public void tsu_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.tsu);
        sound.start();
    }
    public void te_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.te);
        sound.start();
    }
    public void to_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.to);
        sound.start();
    }
    public void na_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.na);
        sound.start();
    }
    public void ni_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ni);
        sound.start();
    }
    public void nu_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.nu);
        sound.start();
    }
    public void ne_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ne);
        sound.start();
    }
    public void no_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.no);
        sound.start();
    }
    public void ha_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ha);
        sound.start();
    }
    public void hi_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.hi);
        sound.start();
    }
    public void fu_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.fu);
        sound.start();
    }
    public void he_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.he);
        sound.start();
    }
    public void ho_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ho);
        sound.start();
    }
    public void ma_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ma);
        sound.start();
    }
    public void mi_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.mi);
        sound.start();
    }
    public void mu_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.mu);
        sound.start();
    }
    public void me_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.me);
        sound.start();
    }
    public void mo_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.mo);
        sound.start();
    }
    public void ya_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ya);
        sound.start();
    }
    public void yu_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.yu);
        sound.start();
    }
    public void yo_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.yo);
        sound.start();
    }
    public void wa_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.wa);
        sound.start();
    }
    public void wo_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.wo);
        sound.start();
    }
    public void ra_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ra);
        sound.start();
    }
    public void ri_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ri);
        sound.start();
    }
    public void ru_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ru);
        sound.start();
    }
    public void re_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.re);
        sound.start();
    }
    public void ro_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.ro);
        sound.start();
    }
    public void n_click (View view){
        sound.reset();
        sound = MediaPlayer.create(MainActivity.this, R.raw.n);
        sound.start();
    }
}