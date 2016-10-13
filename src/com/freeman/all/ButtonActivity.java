package com.freeman.all;
import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public class ButtonActivity extends Activity implements OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.button);
	}
	
	public void initListenner()
	{
		
	}
	
	@Override
	public void onClick(View p1)
	{
		// TODO: Implement this method
	}
}
