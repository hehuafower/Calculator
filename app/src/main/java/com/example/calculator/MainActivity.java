package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
                private String inf = "";
                private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText = (EditText) this.findViewById(R.id.editText);
        this.editText.setText(this.inf);
    }

    public void go(View view){

        int id = view.getId();
        if( id == R.id.one){
            this.inf = this.inf+"1";
            this.editText.setText(this.inf);
        }else if(id == R.id.two){
            this.inf = this.inf+"2";
            this.editText.setText(this.inf);
        }else if(id == R.id.three){
            this.inf = this.inf+"3";
            this.editText.setText(this.inf);
        }else if(id == R.id.four){
            this.inf = this.inf+"4";
            this.editText.setText(this.inf);
        }else if(id == R.id.five){
            this.inf = this.inf+"5";
            this.editText.setText(this.inf);
        }else if(id == R.id.six){
            this.inf = this.inf+"6";
            this.editText.setText(this.inf);
        }else if(id == R.id.seven){
            this.inf = this.inf+"7";
            this.editText.setText(this.inf);
        }else if(id == R.id.eight){
            this.inf = this.inf+"8";
            this.editText.setText(this.inf);
        }else if(id == R.id.nine){
            this.inf = this.inf+"9";
            this.editText.setText(this.inf);
        }else if(id == R.id.zero){
            this.inf = this.inf+"0";
            this.editText.setText(this.inf);
        }else if(id == R.id.point){
            this.inf = this.inf+".";
            this.editText.setText(this.inf);
        }else if(id == R.id.add){
            this.inf = this.inf+"+";
            this.editText.setText(this.inf);
        }else if(id == R.id.sub){
            this.inf = this.inf+"-";
            this.editText.setText(this.inf);

        }else if(id == R.id.mul){
            this.inf = this.inf+"*";
            this.editText.setText(this.inf);
        }else if(id == R.id.div){
            this.inf = this.inf+"/";
            this.editText.setText(this.inf);
        }else if(id == R.id.equal){
            this.inf = "234";
            this.editText.setText(this.inf);

        }else if(id == R.id.back){

        }else if(id == R.id.clear){
            this.inf = "";
            this.editText.setText(this.inf);
        }

    }
}
