package com.example.myapplication;



import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    public Context mContext;

    public int [] image={
            R.drawable.download,
            R.drawable.download2,
            R.drawable.download3,
            R.drawable.download4,
            R.drawable.images,
            R.drawable.images2,
            R.drawable.images5
    };
    ImageAdapter(Context mContext){
        this.mContext=mContext;
    }
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return image[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(image[i]);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        return imageView;
    }
}
