package com.example.boatcheck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class AdapterBoat extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Boat> boatList;

    public AdapterBoat(Context context, int layout, List<Boat> boatList) {
        this.context = context;
        this.layout = layout;
        this.boatList = boatList;
    }
    @Override
    public int getCount() {
        return boatList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class HolderView {
        TextView txtTenTau, txtMap, txtDetail;
        ImageView imageStatus;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HolderView holder;
        if (convertView == null) {
            holder = new HolderView();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            inflater.inflate(layout, null);
            try {
                holder.txtTenTau = (TextView) convertView.findViewById(R.id.txtTenTau);
                convertView.setTag(holder);
            }catch (Exception e) {
                Toast.makeText(context, e.toString(), Toast.LENGTH_SHORT).show();
            }
            //  holder.txtMap = (TextView) convertView.findViewById(R.id.txtMap);
            //  holder.txtDetail = (TextView) convertView.findViewById(R.id.txtDetail);
            // holder.imageStatus = (ImageView) convertView.findViewById(R.id.imageStatus);
        } else {
            holder = (HolderView) convertView.getTag();
        }
        Boat boat=boatList.get(position);
        holder.txtTenTau.setText(boat.getTenTau());

        holder.txtMap = (TextView) convertView.findViewById(R.id.txtMap);
        holder.txtDetail = (TextView) convertView.findViewById(R.id.txtDetail);
        holder.imageStatus = (ImageView) convertView.findViewById(R.id.imageStatus);
        return convertView;
    }
}
