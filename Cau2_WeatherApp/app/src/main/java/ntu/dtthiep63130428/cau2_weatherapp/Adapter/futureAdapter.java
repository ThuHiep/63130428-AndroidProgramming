package ntu.dtthiep63130428.cau2_weatherapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import ntu.dtthiep63130428.cau2_weatherapp.Domains.FutureDomain;
import ntu.dtthiep63130428.cau2_weatherapp.R;

public class futureAdapter extends RecyclerView.Adapter<futureAdapter.viewholder> {
    ArrayList<FutureDomain> items;
    Context context;

    public futureAdapter(ArrayList<FutureDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public futureAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_future,parent,false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull futureAdapter.viewholder holder, int position) {
        holder.daytxt.setText(items.get(position).getDay());
        holder.status.setText(items.get(position).getStatus());
        holder.lowtxt.setText(items.get(position).getLowTemp()+"°");
        holder.highttxt.setText(items.get(position).getHightTemp()+"°");

        int drawbleResourceId = holder.itemView.getResources().getIdentifier(items.get(position).getPicPath(),"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(context).load(drawbleResourceId).into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView daytxt,status,lowtxt,highttxt;
        ImageView pic;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            daytxt=itemView.findViewById(R.id.Daytxt);
            status=itemView.findViewById(R.id.statustxt);
            lowtxt=itemView.findViewById(R.id.lowtxt);
            highttxt=itemView.findViewById(R.id.highttxt);
            pic=itemView.findViewById(R.id.pic);
        }
    }
}
