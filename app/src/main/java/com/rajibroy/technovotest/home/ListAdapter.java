package com.rajibroy.technovotest.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rajibroy.technovotest.R;
import com.rajibroy.technovotest.model.ResponseObject;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Model> {

    LayoutInflater inflater;
    Context context;

    public ListAdapter(Context context){
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    private ArrayList<ResponseObject> arrayList = new ArrayList<>();

    public void setArrayList(ArrayList<ResponseObject> arrayList) {
        this.arrayList = arrayList;
        notifyDataSetChanged();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @Override
    public Model onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new Model(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ListAdapter.Model holder, int position) {
        holder.textView.setText(arrayList.get(position).getShortName());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickListener != null) clickListener.onClick(arrayList.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class Model extends RecyclerView.ViewHolder{

        TextView textView;
        LinearLayout layout;

        public Model(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.unknown_id);
            layout = itemView.findViewById(R.id.layout);
        }
    }

    public interface ClickListener{
        void onClick(ResponseObject responseObject);
    }

}
