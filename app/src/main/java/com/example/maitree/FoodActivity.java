package com.example.maitree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    TextView t1, t2, t3, t4, t5, t6;
    ImageView i1, i2, i3, i4, i5;
    private Toolbar toolbar;                              // Declaring the Toolbar Objectt

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);
        t6 = (TextView) findViewById(R.id.t6);
        i1 = (ImageView) findViewById(R.id.i1);
        i2 = (ImageView) findViewById(R.id.i2);
        i3 = (ImageView) findViewById(R.id.i3);
        i4 = (ImageView) findViewById(R.id.i4);
        i5 = (ImageView) findViewById(R.id.i5);
        t1.setText("Must eat local food in Ahmedabad | famous local dishes in Ahmedabad\n" +
                "\n" +
                "With a number of eateries mushrooming up all over the city, it’s indeed difficult to narrow down to the best of the lot. Well, do away with all the confusion for here’s a quick list of the must eat local food in Ahmedabad.\n" +
                "\n" +
                "Dhokla and Khandvi at Das Surti Khaman Wala\n" +

                "\n" +
                "This quaint looking joint has no airs or frills about it and is yet one of the best places to get dhokla, Khaman and Kandvi in the whole of Ahmedabad. The long queue of customers and the aroma around are evidences enough of the high on taste quotient of this place.");
        i1.setImageResource(R.drawable.four);
        t2.setText("Photo of Dhokla (by Sri)\n" +
                        "\n" +
                        "Don’t let anything stop you from ordering plates full of khaman taman, plain Khaman, sandwich dhokla, patra, samosas and more. The treat is on for the whole day! Savour!\n"
        );
        i2.setImageResource(R.drawable.one);
        t3.setText("Photo of Khandvi (by Kirti Poddar)\n" +
                "\n" +
                "Address: Trade Centre, Naurang Road, Ahmedabad, Gujarat\n" +
                "\n" +
                "Telephone: +91-98984-06576\n" +
                "\n" +
                "Meal for two : INR 50\n" +
                "\n" +
                "Gujarati Thali at Ame Gujarati\n" +
                "\n" +
                "Ame Gujarati has got the most wholesome Gujarati thalis, the menu here has everything that makes for local food Bataka Nu Shak, Kathod, Puri/ Roti, Bhakhri/Thepla/Rotli, Atthanu, Sarevda, Pan/Mukhwas, Methi No Masalo and more.");
        i3.setImageResource(R.drawable.two);
        t4.setText("Photo of Patra (GaneshDatta)\n" +
                "\n" +
                "Address: Plot Number 169, Bodakdev, Off S.G Highway, Ahmedabad, Gujarat\n" +
                "\n" +
                "Telephone: +91-79-29096821|29096822|29096823\n" +
                "\n" +
                "Meal for two : 300\n" +
                "\n" +
                "Basundi at Murlidhar Sweets & Icecream\n" +
                "\n" +
                "This thick, creamy dessert is made of milk that’s stirred to its thickest best, imparting it a taste and aroma that’s tantalising to say the least.");
        i4.setImageResource(R.drawable.three);
        t5.setText("Photo of Basundi (by stu spivack)\n" +
                "\n" +

                "Kebabs and Chicken at Bhatiyar Gully\n" +
                "\n" +
                "The smell of kebabsbeing made and chicken and quail being grilled is good enough to make any vegetarian want to convert.\n");
        i5.setImageResource(R.drawable.five);
        t6.setText("Photo of Kebabs (by Emin Bashirov)\n" +
                "\n" +
                "Address : Bhatiyar Gully, Ahmedabad\n" +
                "\n" +
                "Meal for Two : INR 400\n" +
                "\n" +
                "There is nothing like the authentic flavours of a place, check out other places to eat in Ahmedabad along with these must eat local food in Ahmedabad.");
    }
}
