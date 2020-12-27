package com.example.uts_mobile;

import android.content.Intent;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleItem> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView1;
        public ImageView mImageView2;
        public TextView mTextView1;
        public TextView mTextView2;
        public CardView mCardView;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView1 = itemView.findViewById(R.id.icon_dokter_wanita);
            mImageView2 = itemView.findViewById(R.id.icon_pasien);
            mTextView1 = itemView.findViewById(R.id.dokter);
            mTextView2 = itemView.findViewById(R.id.pasien);
            mCardView = itemView.findViewById(R.id.cardview);

        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleList){
        mExampleList = exampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_data, viewGroup, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    //i menunjukan index / posisi item dalam arraylist
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        final ExampleItem currentItem = mExampleList.get(i);

        exampleViewHolder.mImageView1.setImageResource(currentItem.getmImageResource1());
        exampleViewHolder.mImageView2.setImageResource(currentItem.getmImageResource2());
        exampleViewHolder.mTextView1.setText(currentItem.getmText1());
        exampleViewHolder.mTextView2.setText(currentItem.getmText2());

        exampleViewHolder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),DataDetail.class);
                intent.putExtra("text1",currentItem.getmText1());
                intent.putExtra("text2",currentItem.getmText2());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

}
