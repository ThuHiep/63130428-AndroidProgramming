package ntu.dtthiep63130428.cau2_weatherapp.Adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ntu.dtthiep63130428.cau2_weatherapp.Domains.FutureDomain;

public class futureAdapter extends RecyclerView.Adapter<futureAdapter.vieholder> {
    ArrayList<FutureDomain> items;
    Context context;

    public futureAdapter(ArrayList<FutureDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public futureAdapter.vieholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull futureAdapter.vieholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class vieholder {
    }
}
