package com.srcarrillo.actividad1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderRegistros> {
    Context context;
    ArrayList<Persona> ListaPersonas;

    public Adaptador(Context context, ArrayList<Persona> ListaPersonas) {
        this.context = context;
        this.ListaPersonas = ListaPersonas;
    }

    @NonNull
    @Override
    public ViewHolderRegistros onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_simple, null, false);
        return new ViewHolderRegistros(view);
    }

    @NonNull
    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolderRegistros holder, int position) {
        holder.RNombre.setText(ListaPersonas.get(position).getNombre());
        holder.RCorreo.setText(ListaPersonas.get(position).getCorreo());
        holder.RExp.setText(ListaPersonas.get(position).getExp());
        //holder.RAños.setText(ListaPersonas.get(position).getAños());
        //holder.RIntereses.setText(ListaPersonas.get(position).getIntereses());
    }

    @Override
    public int getItemCount() {
        return ListaPersonas.size();
    }

    public class ViewHolderRegistros extends RecyclerView.ViewHolder {
        TextView RNombre, RCorreo, RExp, RAños, RIntereses;

        public ViewHolderRegistros(@NonNull View itemView) {
            super(itemView);
            RNombre = itemView.findViewById(R.id.Nombre);
            RCorreo = itemView.findViewById(R.id.Correo);
            RExp = itemView.findViewById(R.id.Exp);
            RAños = itemView.findViewById(R.id.Años);
            RIntereses = itemView.findViewById(R.id.Intereses);


        }
    }
}
