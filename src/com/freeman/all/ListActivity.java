package com.freeman.all;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Toast;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Random;
import android.widget.CheckBox;
import android.widget.ListAdapter;

public class ListActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		ListAdapter ma=new MyAdapter(this,new String[]{"apple","banana","cat","dog","eve","fly","girl"});
		((ListView)findViewById(R.id.listListView1)).setAdapter(ma);
	}
}

class MyAdapter extends ArrayAdapter<String>
{
	public MyAdapter(Context context,String[] values)
	{
		super(context,R.layout.list_item,values);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		LayoutInflater ll=LayoutInflater.from(getContext());
		View view=ll.inflate(R.layout.list_item,parent,false);
		String text=getItem(position);//获取item上的字
		((TextView)view.findViewById(R.id.listitemTextView1)).setText(text);
		((TextView)view.findViewById(R.id.listitemTextView2)).setText(new Random().nextInt(10000)+"");
		((CheckBox)view.findViewById(R.id.listitemCheckBox1)).setChecked(new Random().nextBoolean());
		// TODO: Implement this method
		return view;
	}
}
