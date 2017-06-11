package com.sourcey.materiallogindemo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sourcey.materiallogindemo.R;

/**
 * Created by next on 8/6/17.
 */
public class MyPagerAdapter extends PagerAdapter {
    private TextView[] dots;
    int[] Resources ;
    Context mContext;
    LayoutInflater mLayoutInflater;

    public MyPagerAdapter(Context context, int[] mResources) {
        this.mContext = context;
        Resources = mResources;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return Resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.layout, container, false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageview);
        imageView.setImageResource(Resources[position]);
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }


}
