package org.sticollegeandroidprojects.dictionary.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.sticollegeandroidprojects.applicationdriver.database.Dao.BWord;
import org.sticollegeandroidprojects.dictionary.R;

import java.util.List;

public class AdapterWords extends RecyclerView.Adapter<AdapterWords.WordVH> {
    private static final String TAG = AdapterWords.class.getSimpleName();

    private final List<BWord.Bookmark> poList;
    private final OnWordClickListener mListener;

    public interface OnWordClickListener{
        void OnClick(String args);
    }

    public AdapterWords(List<BWord.Bookmark> poList, OnWordClickListener listener) {
        this.poList = poList;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public WordVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_words, parent, false);
        return new WordVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordVH holder, int position) {
        BWord.Bookmark loWord = poList.get(position);
        holder.lblWord.setText(loWord.sWordName);
        holder.itemView.setOnClickListener(v -> mListener.OnClick(loWord.sWordIDxx));
    }

    @Override
    public int getItemCount() {
        return poList.size();
    }

    public static class WordVH extends RecyclerView.ViewHolder{

        public TextView lblWord;

        public WordVH(@NonNull View itemView) {
            super(itemView);
            lblWord = itemView.findViewById(R.id.lblword);
        }
    }
}
