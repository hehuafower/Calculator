package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
                private String inf = "";
                private EditText editText;
                private CheckerUtil checkerUtil = new CheckerUtil();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.editText = (EditText) this.findViewById(R.id.editText);
        this.editText.setText(this.inf);
    }

    public void go(View view){
        try {
            int id = view.getId();
            if (id == R.id.one) {
                this.inf = this.inf + "1";
                this.editText.setText(this.inf);
            } else if (id == R.id.two) {
                this.inf = this.inf + "2";
                this.editText.setText(this.inf);
            } else if (id == R.id.three) {
                this.inf = this.inf + "3";
                this.editText.setText(this.inf);
            } else if (id == R.id.four) {
                this.inf = this.inf + "4";
                this.editText.setText(this.inf);
            } else if (id == R.id.five) {
                this.inf = this.inf + "5";
                this.editText.setText(this.inf);
            } else if (id == R.id.six) {
                this.inf = this.inf + "6";
                this.editText.setText(this.inf);
            } else if (id == R.id.seven) {
                this.inf = this.inf + "7";
                this.editText.setText(this.inf);
            } else if (id == R.id.eight) {
                this.inf = this.inf + "8";
                this.editText.setText(this.inf);
            } else if (id == R.id.nine) {
                this.inf = this.inf + "9";
                this.editText.setText(this.inf);
            } else if (id == R.id.zero) {
                this.inf = this.inf + "0";
                this.editText.setText(this.inf);
            } else if (id == R.id.point) {
                if (checkerUtil.check(this.inf)) {
                    this.inf = this.inf + ".";
                    this.editText.setText(this.inf);
                }
            } else if (id == R.id.add) {
                if (checkerUtil.check(this.inf)) {
                    this.inf = this.inf + "+";
                    this.editText.setText(this.inf);
                }
            } else if (id == R.id.sub) {
                if (checkerUtil.check(this.inf)) {
                    this.inf = this.inf + "-";
                    this.editText.setText(this.inf);
                }

            } else if (id == R.id.mul) {
                if (checkerUtil.check(this.inf)) {
                    this.inf = this.inf + "*";
                    this.editText.setText(this.inf);
                }
            } else if (id == R.id.div) {
                if (checkerUtil.check(this.inf)) {
                    this.inf = this.inf + "/";
                    this.editText.setText(this.inf);
                }
            } else if (id == R.id.equal) {
                Calculator cl = new Calculator();
                this.inf = cl.calculate(this.inf) + "";
                this.editText.setText(this.inf);

            } else if (id == R.id.back) {
                if (this.inf.length() > 0) {
                    this.inf = this.inf.substring(0, this.inf.length() - 1);
                    this.editText.setText(this.inf);
                }
            } else if (id == R.id.clear) {
                this.inf = "";
                this.editText.setText(this.inf);
            }
        }catch (Exception e){
            Toast.makeText(this,"输出有误",Toast.LENGTH_SHORT  ).show();
        }
    }
}
