package com.example.azkaar.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.azkaar.callbacks.HomeI;
import com.example.azkaar.databinding.AzkaarItemBinding;

import java.util.ArrayList;

public class AzkaarGroupAdapter extends RecyclerView.Adapter<AzkaarGroupAdapter.AzkaarViewHolder> {

    private ArrayList<String> azkaarGroup;
    private HomeI homeI;
    public AzkaarGroupAdapter(ArrayList<String> azkaarGroup, HomeI homeI) {
        this.azkaarGroup = azkaarGroup;
        this.homeI = homeI;
    }

    @NonNull
    @Override
    public AzkaarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AzkaarViewHolder(AzkaarItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AzkaarViewHolder holder, int position) {
        holder.binding.getRoot().setText(azkaarGroup.get(position));
        holder.binding.getRoot().setOnClickListener(p -> {
            homeI.getItemText(azkaarGroup.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return azkaarGroup.size();
    }

    public class AzkaarViewHolder extends RecyclerView.ViewHolder {

        AzkaarItemBinding binding;
        public AzkaarViewHolder(@NonNull AzkaarItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
