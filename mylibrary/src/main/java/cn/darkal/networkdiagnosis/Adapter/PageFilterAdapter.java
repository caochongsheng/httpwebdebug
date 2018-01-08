package cn.darkal.networkdiagnosis.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;


import cn.darkal.networkdiagnosis.Bean.PageBean;
import cn.darkal.networkdiagnosis.R;

/**
 * Created by Darkal on 2016/9/5.
 */

public class PageFilterAdapter extends BaseAdapter{

    public PageFilterAdapter(List<PageBean> pageBeenList){
        this.pageBeenList = pageBeenList;
    }

    private List<PageBean> pageBeenList;

    @Override
    public int getCount() {
        return pageBeenList.size();
    }

    @Override
    public Object getItem(int position) {
        return pageBeenList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return pageBeenList.get(position).getIndex();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
           convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pages,null);
        } else {

        }

//        listItemBinding.setButtonclick(new ButtonClick(HttpCaptureMainActivity.this,position));
        return convertView;
    }
}
