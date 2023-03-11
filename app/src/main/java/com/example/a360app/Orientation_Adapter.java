package com.example.a360app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Orientation_Adapter extends RecyclerView.Adapter<Orientation_Adapter.OrientationViewHolder> {

    private List<Integer> imageList;

    public Orientation_Adapter(List<Integer> imageList){
        this.imageList=imageList;
    }

    @NonNull
    @Override
    public OrientationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orientation_pdf_layout, parent, false);
        return new OrientationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrientationViewHolder holder, int position) {
        holder.mImageView.setImageResource(imageList.get(position));

    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class OrientationViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageView;
        public OrientationViewHolder(@NonNull View itemView){
           super(itemView);

           mImageView=itemView.findViewById(R.id.imageView_Orientation1);

        }
    }



}
