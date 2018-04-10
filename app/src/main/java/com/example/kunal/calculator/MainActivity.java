package com.example.kunal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    Button button1, button2, button3, button4, button5, button6, button7, button8;
   Button button9, button10, button11, button12, button13, button14, button15, button16,button17,button18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 =(TextView)findViewById(R.id.textView1);
        button1 =(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3 =(Button)findViewById(R.id.button3);
        button4 =(Button)findViewById(R.id.button4);
        button5 =(Button)findViewById(R.id.button5);
        button6 =(Button)findViewById(R.id.button6);
        button7 =(Button)findViewById(R.id.button7);
        button8 =(Button)findViewById(R.id.button8);
        button9 =(Button)findViewById(R.id.button9);
        button10 =(Button)findViewById(R.id.button10);
        button11 =(Button)findViewById(R.id.button11);
        button12 =(Button)findViewById(R.id.button12);
        button13 =(Button)findViewById(R.id.button13);
        button14 =(Button)findViewById(R.id.button14);
        button15 =(Button)findViewById(R.id.button15);
        button16 =(Button)findViewById(R.id.button16);
        button17 =(Button)findViewById(R.id.button17);
        button18 =(Button)findViewById(R.id.button18);

    }
    public  void task1 (View view)
    {        String name =  textView1.getText().toString();

        textView1.setText(name+"1");

    }
    public  void task2 (View view)
    {        String name =  textView1.getText().toString();

        textView1.setText(name+"2");
    }
    public  void task3 (View view)
    {        String name =  textView1.getText().toString();

        textView1.setText(name+"3");
    }
    public  void task4 (View view)
    {        String name =  textView1.getText().toString();

        textView1.setText(name+"4");
    }
    public  void task5 (View view)
    {     String name =  textView1.getText().toString();

        textView1.setText(name+"5");
    }
    public  void task6 (View view)
    {        String name =  textView1.getText().toString();

        textView1.setText(name+"6");
    }
    public  void task7 (View view)
    {        String name =  textView1.getText().toString();

        textView1.setText(name+"7");
    }
    public  void task8 (View view)
    {        String name =  textView1.getText().toString();

        textView1.setText(name+"8");
    }
    public  void task9 (View view)
    {        String name =  textView1.getText().toString();

        textView1.setText(name+"9");
    }
    public  void task10 (View view)
    {      task17(view);
        String name =  textView1.getText().toString();

        textView1.setText(name+"*");

    }
    public  void task11 (View view)
    {        String name =  textView1.getText().toString();
 if(name.contains("."))
 {

 }
     else   textView1.setText(name+".");
    }
    public  void task12 (View view)
    {
        textView1.setText("");
    }public  void task13 (View view)
    {
        task17(view);
        String name =  textView1.getText().toString();

        textView1.setText(name+"/");
    }
    public  void task14 (View view)
    {
        task17(view);
        String name =  textView1.getText().toString();

        textView1.setText(name+"%");
    }
    public  void task15 (View view)
    {
        task17(view);
        String name =  textView1.getText().toString();

        textView1.setText(name+"+");
    }
    public  void task16 (View view)
    {      task17(view);
        String name =  textView1.getText().toString();

        textView1.setText(name+"-");
    }
    public  void task17 (View view)
    {   String str =  textView1.getText().toString();
        Double answer1; double answer2; double answer3;

        if(str.contains("+"))
    {

        answer1 =Double.parseDouble(str.substring(0, str.indexOf("+")));



        answer2=Double.parseDouble(str.substring(str.indexOf("+")+1));

        answer3=answer2+answer1;

        textView1.setText(String.valueOf(answer3));
    }

        if(str.contains("-"))
        {   answer1 =Double.parseDouble(str.substring(0, str.indexOf("-")));



            answer2=Double.parseDouble(str.substring(str.indexOf("-")+1));

            answer3=answer1-answer2;
            textView1.setText(String.valueOf(answer3));
        }


       if(str.contains("*"))
    {   answer1 =Double.parseDouble(str.substring(0, str.indexOf("*")));



        answer2=Double.parseDouble(str.substring(str.indexOf("*")+1));

        answer3=answer1*answer2;
        textView1.setText(String.valueOf(answer3));
    }
        if(str.contains("/"))
        {   answer1 =Double.parseDouble(str.substring(0, str.indexOf("/")));



            answer2=Double.parseDouble(str.substring(str.indexOf("/")+1));

            answer3=answer1/answer2;

            String str1 = answer3+"";
            if(str1.length()>8)
                textView1.setText(str1.substring(0,8));

            else
                textView1.setText(String.valueOf(answer3));
        }
        if(str.contains("%"))
    {   answer1 =Double.parseDouble(str.substring(0, str.indexOf("%")));



        answer2=Double.parseDouble(str.substring(str.indexOf("%")+1));

        answer3=answer1%answer2;
        textView1.setText(String.valueOf(answer3));
    }

}
    public  void task18 (View view)
    {
        String name =  textView1.getText().toString();

        textView1.setText(name.subSequence(0,name.length()-1));
    }


}
