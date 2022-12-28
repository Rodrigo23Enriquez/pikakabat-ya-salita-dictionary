package com.example.pikakabatyasalitadictionary;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.zip.Inflater;

public class PangtoEngListViewAdapter extends BaseAdapter {

    Context mPangtoEngContext;
    LayoutInflater pangtoenginflater;
    List <PangToEngModel> pangtoengmodellist;
    ArrayList<PangToEngModel> pangtoengarryList;

    public PangtoEngListViewAdapter(Context PangtoEngContext, ArrayList<PangToEngModel> pangtoengmodellist) {
        mPangtoEngContext = PangtoEngContext;
        this.pangtoengmodellist = pangtoengmodellist;
        pangtoenginflater = LayoutInflater.from(PangtoEngContext);
        this.pangtoengarryList = new ArrayList<PangToEngModel>();
        this.pangtoengarryList.addAll(pangtoengmodellist);
    }

    public class PangtoEngViewHolder{
        TextView mPangtoEngWordss;
    }

    @Override
    public int getCount() {
        return pangtoengmodellist.size();
    }

    @Override
    public Object getItem(int i) {
        return  pangtoengmodellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int postition, View view, ViewGroup parent) {
        PangtoEngViewHolder pangtoengholder;
            if (view==null){
                pangtoengholder = new PangtoEngViewHolder();
                view = pangtoenginflater.inflate(R.layout.pangtoengrow, null);

                pangtoengholder.mPangtoEngWordss = view.findViewById(R.id.pangtoengwordlistview);

                view.setTag(pangtoengholder);
            }
            else {
                pangtoengholder = (PangtoEngViewHolder)view.getTag();
            }

            pangtoengholder.mPangtoEngWordss.setText(pangtoengmodellist.get(postition).getPangtoengwords());

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (pangtoengmodellist.get(postition).getPangtoengwords().equals("Aalaen")){
                        Intent pangtoengintent = new Intent(mPangtoEngContext, PangtoEnglishDiscription.class);

                        pangtoengintent.putExtra("pangtoengContent", "This is the meaning of Aalaen");
                        mPangtoEngContext.startActivity(pangtoengintent);
                    }
                    if (pangtoengmodellist.get(postition).getPangtoengwords().equals("Aaralen")){
                        Intent pangtoengintent = new Intent(mPangtoEngContext, PangtoEnglishDiscription.class);

                        pangtoengintent.putExtra("pangtoengContent", "This is the meaning of Aaralen");
                        mPangtoEngContext.startActivity(pangtoengintent);
                    }
                    if (pangtoengmodellist.get(postition).getPangtoengwords().equals("Abong-aralan")){
                        Intent pangtoengintent = new Intent(mPangtoEngContext, PangtoEnglishDiscription.class);

                        pangtoengintent.putExtra("pangtoengContent", "This is the meaning of Abong-aralan");
                        mPangtoEngContext.startActivity(pangtoengintent);
                    }
                    if (pangtoengmodellist.get(postition).getPangtoengwords().equals("Bangon")){
                        Intent pangtoengintent = new Intent(mPangtoEngContext, PangtoEnglishDiscription.class);

                        pangtoengintent.putExtra("pangtoengContent", "This is the meaning of Bangon");
                        mPangtoEngContext.startActivity(pangtoengintent);
                    }
                    if (pangtoengmodellist.get(postition).getPangtoengwords().equals("Dalanan")){
                        Intent pangtoengintent = new Intent(mPangtoEngContext, PangtoEnglishDiscription.class);

                        pangtoengintent.putExtra("pangtoengContent", "This is the meaning of Dalanan");
                        mPangtoEngContext.startActivity(pangtoengintent);
                    }
                    if (pangtoengmodellist.get(postition).getPangtoengwords().equals("Dayo")){
                        Intent pangtoengintent = new Intent(mPangtoEngContext, PangtoEnglishDiscription.class);

                        pangtoengintent.putExtra("pangtoengContent", "This is the meaning of Dayo");
                        mPangtoEngContext.startActivity(pangtoengintent);
                    }

                }
            });
        return view;
    }

    public void pangtoengfilter(String pangtoengcharText){
        pangtoengcharText = pangtoengcharText.toLowerCase(Locale.getDefault());
        pangtoengmodellist.clear();
        if (pangtoengcharText.length()==0){
            pangtoengmodellist.addAll(pangtoengarryList);
        }
        else{
            for (PangToEngModel pangToEngModel: pangtoengarryList){
                if (pangToEngModel.getPangtoengwords().toLowerCase(Locale.getDefault()).contains(pangtoengcharText)){
                    pangtoengmodellist.add(pangToEngModel);
                }
            }
        }
        notifyDataSetChanged();
    }
}
