package ntu.dtthiep63130428.cau2_weatherapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ntu.dtthiep63130428.cau2_weatherapp.Domains.Hourly;
import ntu.dtthiep63130428.cau2_weatherapp.R;

public class HourlyAdapter extends RecyclerView.Adapter<HourlyAdapter.viewholder> {
    ArrayList<Hourly> item;
    Context context;

    public HourlyAdapter(ArrayList<Hourly> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public HourlyAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context= parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_hourly,parent,false);


        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HourlyAdapter.viewholder holder, int position) {
        holder.hourTxt.setText(item.get(position).getHour());
        holder.tempTxt.setText(item.get(position).getTemp()+"°");

        int drawbleResourceId = holder.itemView.getResources().getIdentifier(item.get(position).getPicPath(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(context).load(drawbleResourceId).into(holder.pic);

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView hourTxt, tempTxt;
        ImageView pic;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            hourTxt = itemView.findViewById(R.id.HourTxt);
            tempTxt=itemView.findViewById(R.id.tempTxt);
            pic=itemView.findViewById(R.id.pic);
        }
    }
}
