package cntt.edu.lvnangcao.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import cntt.edu.lvnangcao.R;
import cntt.edu.lvnangcao.model.Country;

public class CountryAdapter extends BaseAdapter {
    ArrayList<Country> ListQG;
    Context mContext;
    LayoutInflater mInflater;

    public CountryAdapter( Context mContext,ArrayList<Country> listQG) {
        this.mContext = mContext;
        ListQG = listQG;

        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return ListQG.size();
    }

    @Override
    public Object getItem(int position) {
        return ListQG.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CountryViewHolder viewreturn;
        viewreturn = new CountryViewHolder();
        if(convertView==null)   {
           convertView= mInflater.inflate(R.layout.country_item,null);

            viewreturn.textViewNationName=convertView.findViewById(R.id.tvTenQG);
            viewreturn.textViewPopulation=convertView.findViewById(R.id.tvsodan);
            viewreturn.imageViewFlag=convertView.findViewById(R.id.imglaco);

           convertView.setTag(viewreturn);
        }
        else {
            viewreturn=(CountryViewHolder) convertView.getTag();
        }
        Country quocGia = ListQG.get(position);
        String tenQG = quocGia.getTenQG();
        int soDan = quocGia.getSoLuongDan();
        String tenLaCo = quocGia.getTenfileanhlaco();
        viewreturn.textViewNationName.setText(tenQG);
        viewreturn.textViewPopulation.setText(String.valueOf(soDan));
        int idanhlaco = TimIDtheotenFile(tenLaCo);

        viewreturn.imageViewFlag.setImageResource(idanhlaco);
        return convertView;

    }
    int TimIDtheotenFile(String tenfileAnh){
        String tenPak = mContext.getPackageName();
        int id = mContext.getResources().getIdentifier(tenfileAnh,"mimap",tenPak);
        return id;
    }
    static class CountryViewHolder{
        ImageView imageViewFlag;
        TextView textViewNationName;
        TextView textViewPopulation;
    }

}
