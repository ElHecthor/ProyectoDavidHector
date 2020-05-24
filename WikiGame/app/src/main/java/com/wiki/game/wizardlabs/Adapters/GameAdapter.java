package com.wiki.game.wizardlabs.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.wiki.game.wizardlabs.Activities.GameDetailActivity;
import com.wiki.game.wizardlabs.Models.Game;
import com.wiki.game.wizardlabs.R;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.MyViewHolder> {
    static Context mContext;
    static ArrayList<Game> mData;

    public GameAdapter() {
    }

    public GameAdapter(Context mContext, ArrayList<Game> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.game_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvGameTitle.setText(mData.get(position).getName());
        Glide.with(mContext).load(mData.get(position).getCover()).into(holder.imgGame);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvGameTitle;
        ImageView imgGame;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvGameTitle = itemView.findViewById(R.id.tv_gameName);
            imgGame = itemView.findViewById(R.id.img_gameCover);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent gameDetailActivity = new Intent(mContext, GameDetailActivity.class);
                    int position = getAdapterPosition();

                    gameDetailActivity.putExtra("name", mData.get(position).getName());
                    gameDetailActivity.putExtra("cover", mData.get(position).getCover());
                    gameDetailActivity.putExtra("description", mData.get(position).getDescription());
                    gameDetailActivity.putExtra("players", mData.get(position).getPlayers());
                    gameDetailActivity.putExtra("platform", mData.get(position).getPlatform());
                    gameDetailActivity.putExtra("genre", mData.get(position).getGenre());
                    gameDetailActivity.putExtra("gameKey", mData.get(position).getGameKey());

                    mContext.startActivity(gameDetailActivity);
                }
            });
        }
    }
}
