package com.example.baikt1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BaiHatAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<BaiHat> BaiHatList;

    public BaiHatAdapter(Context context, int layout, List<BaiHat> baiHatList) {
        this.context = context;
        this.layout = layout;
        BaiHatList = baiHatList;
    }

    @Override
    public int getCount() {
        return BaiHatList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen;
        TextView txtMoTa;
        TextView txtNoiCongTac;
        TextView txtSoSao;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
            holder.txtMoTa = (TextView) view.findViewById(R.id.textviewMoTa);
            holder.imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
            holder.txtNoiCongTac = (TextView) view.findViewById(R.id.textviewNoiCongTac);
            holder.txtSoSao = (TextView) view.findViewById(R.id.textviewSoSao);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }


        BaiHat baiHat = BaiHatList.get(position);
        holder.txtTen.setText(baiHat.getTen());
        holder.txtMoTa.setText(baiHat.getMoTa());
        holder.imgHinh.setImageResource(baiHat.getHinh());
        holder.txtNoiCongTac.setText(baiHat.getNoicongtac());
        holder.txtSoSao.setText(baiHat.getSosao());

        return view;
    }
}

