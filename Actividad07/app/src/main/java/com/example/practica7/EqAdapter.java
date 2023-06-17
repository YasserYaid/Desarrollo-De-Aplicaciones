package com.example.practica7;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class EqAdapter extends ListAdapter<Earthquake, EqAdapter,EqViewHolder>{

    protected EqAdapter(@NonNull DiffUtil.ItemCallback<Earthquake> diffCallback){
        super(diffCallback);
    }

    @NonNull
    @Override
    public EqAdapter.EqViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull EqAdapter.EqViewHolder holder, int position) {

    }

    public class EqViewHolder extends RecyclerView.ViewHolder{
        public EqViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
