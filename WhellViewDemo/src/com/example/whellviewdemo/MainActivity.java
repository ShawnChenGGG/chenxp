package com.example.whellviewdemo;

import java.util.ArrayList;

import com.example.whellviewdemo.WheelView.OnSelectListener;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnSelectListener {
ArrayList<String> arr=new ArrayList<>();
private WheelView ww;
private Button btn;
private Button btn1;
private String text;
private final int INDEX=0;
private String lastString;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button) findViewById(R.id.btn);
		btn1 = (Button) findViewById(R.id.btn1);
		ww = (WheelView) findViewById(R.id.ww);
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("d");
		arr.add("e");
		arr.add("f");
		ww.setData(arr);
		int i=arr.indexOf(lastString);
		if(i==-1){
			i=INDEX;
		}
		ww.setDefault(i);
		text=arr.get(INDEX);
		ww.setOnSelectListener(this);
	}
	public void click(View v){
		ww.goonMove(-1);
		WheelView.MOVE_NUMBER=1;
	}
	public void click1(View v){
		btn1.setText(text);
	}
	@Override
	public void endSelect(int id, final String text) {
		this.text=text;
		lastString=text;
	}
	@Override
	public void selecting(int id, String text) {
	}

}
