package com.example.bab4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MarketplaceAdapter extends
        RecyclerView.Adapter<MarketplaceAdapter.marketplaceViewHolder>{
    private ArrayList<marketplace> dataList;
    public MarketplaceAdapter(ArrayList<marketplace> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MarketplaceAdapter.marketplaceViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_marketplace, parent, false);
        return new marketplaceViewHolder(view);
    }
    public void onBindViewHolder(marketplaceViewHolder holder, int position) {
        holder.produk.setImageResource(dataList.get(position).getProduk());
        holder.txtnamaproduk.setText(dataList.get(position).getNamaproduk());
        holder.txtidproduk.setText(dataList.get(position).getIdproduk());
        holder.txtnamaid.setText(dataList.get(position).getNamaid());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class marketplaceViewHolder extends
            RecyclerView.ViewHolder{
        private TextView txtnamaproduk, txtidproduk, txtnamaid;
        private ImageView produk;
        public marketplaceViewHolder(View itemView) {
            super(itemView);
            produk =  (ImageView) itemView.findViewById(R.id.gambar_produk);
            txtnamaproduk = (TextView) itemView.findViewById(R.id.txt_namaproduk);
            txtidproduk = (TextView) itemView.findViewById(R.id.txt_idproduk);
            txtnamaid = (TextView) itemView.findViewById(R.id.txt_namaid);
        }
    }
}

