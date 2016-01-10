package com.example.maitree;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class French_Food extends AppCompatActivity {

    TextView t1,t2,t3;
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_food);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar_food);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent i = getIntent();

        int id = i.getExtras().getInt("pid");
        t1 = (TextView) findViewById(R.id.Title_food);
        t2 = (TextView) findViewById(R.id.dec_place_food);
        t3 = (TextView) findViewById(R.id.extra_dec_place_food);
        i1 = (ImageView) findViewById(R.id.imageView_food);

        if(id == 0)
        {
            t1.setText("Dhokla");
            t2.setText("This quaint looking joint has no airs or frills about it and is yet one of the best places to get dhokla, Khaman and Kandvi in the whole of Ahmedabad. The long queue of customers and the aroma around are evidences enough of the high on taste quotient of this place.");
            t3.setText("Photo of Dhokla (by Sri)\n" +
                            "\n" +
                            "Don’t let anything stop you from ordering plates full of khaman taman, plain Khaman, sandwich dhokla, patra, samosas and more. The treat is on for the whole day! Savour!");
            i1.setImageResource(R.drawable.four);
        }
        if(id == 1)
        {
            t1.setText("Khandvi");
            t2.setText("This quaint looking joint has no airs or frills about it and is yet one of the best places to get dhokla, Khaman and Kandvi in the whole of Ahmedabad. The long queue of customers and the aroma around are evidences enough of the high on taste quotient of this place.");
            t3.setText("Photo of Khandvi (by Kirti Poddar)\n" +
                    "\n" +
                            "Address: Trade Centre, Naurang Road, Ahmedabad, Gujarat\n" +
                            "\n" +
                            "Telephone: +91-98984-06576\n" +
                            "\n" +
                            "Meal for two : INR 50\n");
            i1.setImageResource(R.drawable.one);
        }
        if(id == 2)
        {
            t1.setText("Gujarati Thali");
            t2.setText("Ame Gujarati has got the most wholesome Gujarati thalis, the menu here has everything that makes for local food Bataka Nu Shak, Kathod, Puri/ Roti, Bhakhri/Thepla/Rotli, Atthanu, Sarevda, Pan/Mukhwas, Methi No Masalo and more.\"");
            t3.setText("Photo of Patra (GaneshDatta)\n" +
                    "\n" +
                    "Address: Plot Number 169, Bodakdev, Off S.G Highway, Ahmedabad, Gujarat\n" +
                    "\n" +
                    "Telephone: +91-79-29096821|29096822|29096823\n" +
                    "\n" +
                    "Meal for two : 300\n");
            i1.setImageResource(R.drawable.two);
        }
        if(id == 3)
        {
            t1.setText("Basundi");
            t2.setText("This thick, creamy dessert is made of milk that’s stirred to its thickest best, imparting it a taste and aroma that’s tantalising to say the least.");
            t3.setText("Photo of Basundi (by stu spivack)");
            i1.setImageResource(R.drawable.three);
        }
        if(id == 4)
        {
            t1.setText("Kebabs and Chicken");
            t2.setText("The smell of kebabsbeing made and chicken and quail being grilled is good enough to make any vegetarian want to convert.\n");
            t3.setText("Photo of Kebabs (by Emin Bashirov)\n" +
                    "\n" +
                    "Address : Bhatiyar Gully, Ahmedabad\n" +
                    "\n" +
                    "Meal for Two : INR 400\n" +
                    "\n" +
                    "There is nothing like the authentic flavours of a place, check out other places to eat in Ahmedabad along with these must eat local food in Ahmedabad.");
            i1.setImageResource(R.drawable.five);
        }

    }

}
