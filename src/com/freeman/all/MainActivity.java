package com.freeman.all;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		initListenner();
    }
	
	public void initListenner()
	{
		((Button)findViewById(R.id.mainButton1)).setOnClickListener(this);
		((Button)findViewById(R.id.mainButton2)).setOnClickListener(this);
	}

	@Override
	public void onClick(View p1)
	{
		// TODO: Implement this method
		int id=p1.getId();
		
		if(id==R.id.mainButton1)
		{
			Intent intent=new Intent(this,ListActivity.class);
			startActivity(intent);
		}else if(id==R.id.mainButton2)
		{
			Intent intent=new Intent(this,ButtonActivity.class);
			startActivity(intent);
		}
	}
}
