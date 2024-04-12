package dtthiep.usingrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {

    Context context;
    ArrayList<LandScape> lstData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land,parent,false);
        ItemLandHolder holderCreated = new ItemLandHolder(vItem);
        return holderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        //Lay doi tuong hien thi
        LandScape landScapeHienThi = lstData.get(position);
        //trich thong tin
        String caption = landScapeHienThi.getLandCaption();
        String tenAnh = landScapeHienThi.getLandImageFileName();
        //Dat vao cac truong thong tin cua holder
        holder.tvCaption.setText(caption);
        //dat anh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageId = holder.itemView.getResources().getIdentifier(tenAnh,"mipmap",packageName);
        holder.ivLandscape.setImageResource(imageId);

    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvCaption;
        ImageView ivLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int vitriDuocClick = getAdapterPosition();
            LandScape phantuduocchon = lstData.get(vitriDuocClick);
            String ten = phantuduocchon.getLandCaption();
            String tenFile = phantuduocchon.getLandImageFileName();
            String chuoithongbao = "Bạn vừa click vào: "+ten;
            Toast.makeText(v.getContext(),chuoithongbao,Toast.LENGTH_SHORT).show();
            
        }
    }
}
