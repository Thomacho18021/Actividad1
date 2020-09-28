package com.srcarrillo.actividad1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderRegistros> {
    ArrayList<String> ListaRegistros;

    public Adaptador(ArrayList<String> ListaRegistros){
        ListaRegistros = ListaRegistros;
    }

    @NonNull
    @Override
    public ViewHolderRegistros onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_simple,null,false);
        return new ViewHolderRegistros(view);
    }

    @NonNull
    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolderRegistros holder, int position){
        holder.asignarDatos(ListaRegistros.get(position));
    }

    @Override
    public int getItemCount() {
        return ListaRegistros.size();
    }
    public class ViewHolderRegistros extends RecyclerView.ViewHolder{
        TextView Registrado;

        public ViewHolderRegistros(@NonNull View itemView){
            super(itemView);
            Registrado = itemView.findViewById(R.id.Registrado);


        }
        public void asignarDatos(String dato){
            Registrado.setText(dato);


        }
    }
}
