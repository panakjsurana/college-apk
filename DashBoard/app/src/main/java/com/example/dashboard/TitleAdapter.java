package com.example.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.Myviewholder>
{
    private Context mContext;
    private ArrayList<String> titlelist;
    private CustomitemClicklistener clicklistener;

    public TitleAdapter(Context mContext, ArrayList<String> titlelist, CustomitemClicklistener clicklistener) {
        this.mContext = mContext;
        this.titlelist = titlelist;
        this.clicklistener = clicklistener;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        final View view = LayoutInflater.from(mContext).inflate(R.layout.title_layout,parent,false);

        final Myviewholder viewHolder =new Myviewholder(view);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicklistener.onItemClick(view,viewHolder.getPosition());
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        holder.titletext.setText(titlelist.get(position).replace("_",""));

    }

    @Override
    public int getItemCount() {

        return titlelist.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder
    {
        TextView titletext;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            titletext=(TextView)itemView.findViewById(R.id.title_text);
        }
    }
}
