package com.example.sistemas.datosdesmovilizados;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.sistemas.datosdesmovilizados.models.Municipio;

import java.util.List;

/**
 * Created by sistemas on 13/10/17.
 */

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder>

{


    public static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView departamento , numero;
        private CardView cv;
        private ImageView image;


        public ViewHolder(View itemView) {
            super(itemView);

            departamento =(TextView)itemView.findViewById(R.id.departamento);
            numero =(TextView)itemView.findViewById(R.id.numero);
            cv =(CardView) itemView.findViewById(R.id.cv);
            image =(ImageView) itemView.findViewById(R.id.imageView);






        }
    }

    public List<Municipio> lista;

    public RecyclerViewAdaptador(List<Municipio> lista) {
        this.lista = lista;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_departamento,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        YoYo.with(Techniques.RollIn).playOn(holder.cv);
        YoYo.with(Techniques.SlideInRight).playOn(holder.image);
        holder.departamento.setText(lista.get(position).getDepartamento());
        holder.numero.setText(lista.get(position).getNumerodesmovilizados());



    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
