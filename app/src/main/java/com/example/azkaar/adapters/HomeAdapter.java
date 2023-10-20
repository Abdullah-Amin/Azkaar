package com.example.azkaar.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.azkaar.callbacks.HomeI;
import com.example.azkaar.data.HomeItemModel;
import com.example.azkaar.databinding.HomeItemBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

    private ArrayList<HomeItemModel> itemModels;
    private HomeI homeI;
    public HomeAdapter(ArrayList<HomeItemModel> itemModels, HomeI homeI) {
        this.itemModels = itemModels;
        this.homeI = homeI;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeHolder(
                HomeItemBinding.inflate(LayoutInflater.from(parent.getContext())
                        , parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
         holder.binding.itemImage.setImageResource(itemModels.get(position).getItemImage());
         holder.binding.itemText.setText(itemModels.get(position).getItemText());

         holder.itemView.setOnClickListener(l -> {
             String text = holder.binding.itemText.getText().toString();
             homeI.getItemText(text);
         });
    }

    @Override
    public int getItemCount() {
        return itemModels.size();
    }

    static class HomeHolder extends RecyclerView.ViewHolder {
        HomeItemBinding binding;
        public HomeHolder(@NonNull HomeItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
