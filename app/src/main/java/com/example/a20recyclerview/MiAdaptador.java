package com.example.a20recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MyViewHolder> {

    private final List<String> nameList;

    public MiAdaptador(List<String> nameList) {
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.elementito, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final String name = nameList.get(position);
        // setea el texto del TextView en el interior del elemento .xml
        holder.textView.setText(name);
    }

    @Override
    public int getItemCount() {
        return nameList != null ? nameList.size() : 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            // el id real en elementito.xml es @+id/tvElemento
            textView = itemView.findViewById(R.id.tvElemento);
        }
    }
}
