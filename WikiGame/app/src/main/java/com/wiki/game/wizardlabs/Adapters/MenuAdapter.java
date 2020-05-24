package com.wiki.game.wizardlabs.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.wiki.game.wizardlabs.Fragments.GeneralFragment;
import com.wiki.game.wizardlabs.Fragments.NintendoFragment;
import com.wiki.game.wizardlabs.Fragments.Ps4Fragment;
import com.wiki.game.wizardlabs.Fragments.XboxFragment;
import com.wiki.game.wizardlabs.Models.Menu;
import com.wiki.game.wizardlabs.R;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context mContext;
    private List<Menu> mData;

    public MenuAdapter(Context mContext, List<Menu> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(mContext).inflate(R.layout.menu_item, parent, false);
        return new MenuAdapter.MenuViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Glide.with(mContext).load(mData.get(position).getImgUrl()).into(holder.titleImage);
        holder.txtTitle.setText(mData.get(position).getTitle());
    }

    @Override
    public int getItemCount() { return mData.size(); }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        ImageView titleImage;
        TextView txtTitle;

        public MenuViewHolder(@NonNull final View itemView) {
            super(itemView);
            titleImage = itemView.findViewById(R.id.img_menuHomeItem);
            txtTitle = itemView.findViewById(R.id.tv_General);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    Fragment generalFragment = new GeneralFragment();
                    Fragment nintendoFragment = new NintendoFragment();
                    Fragment Ps4Fragment = new Ps4Fragment();
                    Fragment XboxFragment = new XboxFragment();
                    int position = getAdapterPosition();

                    activity.getSupportActionBar().setTitle(mData.get(getAdapterPosition()).getTitle());

                    if (mData.get(position).getTitle().equals("Nintendo")) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.container, nintendoFragment).addToBackStack(null).commit();
                    } else if (mData.get(position).getTitle().equals("PS4")) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.container, Ps4Fragment).addToBackStack(null).commit();
                    } else if (mData.get(position).getTitle().equals("XBOX ONE")) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.container, XboxFragment).addToBackStack(null).commit();
                    } else if (mData.get(position).getTitle().equals("General")) {
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.container, generalFragment).addToBackStack(null).commit();
                    }
                }
            });
        }
    }
}
