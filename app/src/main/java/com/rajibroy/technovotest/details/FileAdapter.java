package com.rajibroy.technovotest.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.rajibroy.technovotest.R;
import com.rajibroy.technovotest.databinding.ItemImageBinding;
import com.rajibroy.technovotest.model.ResponseObject;
import com.rajibroy.technovotest.utils.Utils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FileAdapter extends RecyclerView.Adapter<FileAdapter.Holder> {

    Context context;
    LayoutInflater inflater;

    public FileAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    private ResponseObject responseObject;

    public void setResponseObject(ResponseObject responseObject) {
        this.responseObject = responseObject;
        notifyDataSetChanged();
    }

    @NonNull

    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_image, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  FileAdapter.Holder holder, int position) {
        String url = Utils.urlMaker(responseObject.getProductUuid(),
                responseObject.getFiles().get(position).getFileUuid());
        Glide.with(context).load(url).into(holder.binding.image);
    }

    @Override
    public int getItemCount() {
        if(responseObject.getFiles() == null) return 0;
        return responseObject.getFiles().size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        ItemImageBinding binding;

        public Holder(@NonNull  View itemView) {
            super(itemView);
            binding = ItemImageBinding.bind(itemView);
        }
    }
}
