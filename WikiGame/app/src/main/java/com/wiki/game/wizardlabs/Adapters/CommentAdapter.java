package com.wiki.game.wizardlabs.Adapters;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.wiki.game.wizardlabs.Models.Comment;
import com.wiki.game.wizardlabs.R;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentViewHolder> {
    private Context mContext;
    private List<Comment> mData;

    public CommentAdapter(Context applicationContext, List<Comment> listComment) {
        this.mContext = applicationContext;
        this.mData = listComment;
    }

    @NonNull
    @Override
    public CommentAdapter.CommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(mContext).inflate(R.layout.row_comment, parent, false);
        return new CommentViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentAdapter.CommentViewHolder holder, int position) {
        Glide.with(mContext).load(mData.get(position).getUimg()).into(holder.imgUser);
        holder.txtNameUser.setText(mData.get(position).getUname());
        holder.txtComment.setText(mData.get(position).getContent());
        holder.txtDate.setText(timestampToString((Long) mData.get(position).getTimestamp()));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class CommentViewHolder extends RecyclerView.ViewHolder {
        ImageView imgUser;
        TextView txtNameUser, txtComment, txtDate;

        public CommentViewHolder(@NonNull View itemView) {
            super(itemView);
            imgUser = itemView.findViewById(R.id.iv_commentUser);
            txtNameUser = itemView.findViewById(R.id.tv_commentUsername);
            txtComment = itemView.findViewById(R.id.tv_commentText);
            txtDate = itemView.findViewById(R.id.tv_commentDate);

        }
    }

    private String timestampToString(long time) {
        Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
        calendar.setTimeInMillis(time);
        String date = DateFormat.format("hh:mm",calendar).toString();
        return date;

    }
}
