package com.example.volleyinfoooooo;

import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Text_Content_Activity extends AppCompatActivity {
    private TextView text_content;
    private ImageView i_Content;
    private int category = 0;
    private int position = 0;
    private int [] array_Pravilaa = {R.string.Osnov,R.string.Perehod,R.string.Podacha,R.string.Zastup,R.string.Setka,R.string.Zamena};
    private int [] array_Image_Pra = {R.drawable.ob,R.drawable.perehod,R.drawable.pod,R.drawable.zastup,R.drawable.setka,R.drawable.zam};
    private int [] array_Svyazka = {R.string.S_Obz,R.string.S_Nah,R.string.S_Pered,R.string.S_Priem,R.string.S_Nap,R.string.S_Block};
    private int [] array_Image_Set = {R.drawable.setterrrr,R.drawable.shah,R.drawable.setterr1,R.drawable.zachita,R.drawable.skidka,R.drawable.sblock};
    private int [] array_Doigr = {R.string.Do_Obz,R.string.Do_Nah,R.string.Do_Priem,R.string.Do_Nap,R.string.Do_Block};
    private int [] array_Image_Doigr = {R.drawable.doigrovsik,R.drawable.naho,R.drawable.dopriem,R.drawable.donap,R.drawable.doblo};
    private int [] array_Centr = {R.string.Ce_Obz,R.string.Ce_Nah,R.string.Ce_Priem,R.string.Ce_Nap,R.string.Ce_Block};
    private int [] array_Image_Centr = {R.drawable.centalniy,R.drawable.centrnah,R.drawable.centrpriem,R.drawable.centrnap,R.drawable.centrblock};
    private int [] array_Dia = {R.string.Di_Obz,R.string.Di_Nah,R.string.Di_Priem,R.string.Di_Nap,R.string.Di_Block};
    private int [] array_Image_Dia = {R.drawable.diaganal,R.drawable.dianah,R.drawable.diapriem,R.drawable.dianap,R.drawable.diablock};
    private int [] array_Lib = {R.string.L_Obz,R.string.L_Nah,R.string.L_Priem,R.string.L_Nap,R.string.L_Block};
    private int [] array_Image_Lib = {R.drawable.libero,R.drawable.linah,R.drawable.lipriem,R.drawable.linap,R.drawable.liblock};


    @Override
    protected void onCreate(@Nullable Bundle savedInatanceState) {
        super.onCreate(savedInatanceState);
        setContentView(R.layout.text_content);
        text_content = findViewById(R.id.text_main_content);
        i_Content = findViewById(R.id.image_content);
        reciveIntent();
    }

   private void reciveIntent() {
         Intent i = getIntent();
         if(i != null){
             category = i.getIntExtra("category",0);
             position = i.getIntExtra("position",0);
         }
         switch (category){
             case 0:
                 i_Content.setImageResource(array_Image_Pra[position]);
text_content.setText(array_Pravilaa[position]);
                 break;

             case 1:
i_Content.setImageResource(array_Image_Set[position]);
text_content.setText(array_Svyazka[position]);
                 break;

             case 2:
i_Content.setImageResource(array_Image_Doigr[position]);
                 text_content.setText(array_Doigr[position]);
                 break;

             case 3:
i_Content.setImageResource(array_Image_Centr[position]);
text_content.setText(array_Centr[position]);
                 break;

             case 4:
                 i_Content.setImageResource(array_Image_Dia[position]);
                 text_content.setText(array_Dia[position]);
                 break;

             case 5:
                 i_Content.setImageResource(array_Image_Lib[position]);
                 text_content.setText(array_Lib[position]);
                 break;
         }

   }
}
