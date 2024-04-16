package ntu.dtthiep.baithuchanh_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.testexamViewHolder> {
    List<testexamdata> list = Collections.emptyList();
    Context context;

    public Adapter(List<testexamdata> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public testexamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context1 = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context1);

        View imgaView = inflater.inflate(R.layout.testexam_card,parent,false);
        testexamViewHolder testexamViewHolder = new testexamViewHolder(imgaView);
        return testexamViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull testexamViewHolder holder, int position) {
        holder.testName.setText(list.get(position).name);
        holder.testDate.setText(list.get(position).date);
        holder.testMess.setText(list.get(position).message);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    final class testexamViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView testName;
        TextView testDate;
        TextView testMess;
        View view;

        public testexamViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.testName = itemView.findViewById(R.id.examName);
            this.testDate = itemView.findViewById(R.id.examDate);
            this.testMess = itemView.findViewById(R.id.examMessage);
            this.view=itemView;
        }

        @Override
        public void onClick(View v) {
            int click = getAdapterPosition();
            testexamdata testexamdata = list.get(click);
            Toast.makeText(v.getContext(),"Clicked: "+testexamdata.getName(),Toast.LENGTH_SHORT).show();
        }
    }
}
