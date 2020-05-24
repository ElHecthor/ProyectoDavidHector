package com.wiki.game.wizardlabs.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.wiki.game.wizardlabs.Adapters.GameAdapter;
import com.wiki.game.wizardlabs.Models.Game;
import com.wiki.game.wizardlabs.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Ps4Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Ps4Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private HomeFragment.OnFragmentInteractionListener mListener;

    GameAdapter gameAdapter;
    RecyclerView gameRecyclerView;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference ;
    View fragmentView;
    List<Game> gameList;

    public Ps4Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Ps4Fragment newInstance(String param1, String param2) {
        Ps4Fragment fragment = new Ps4Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        fragmentView = inflater.inflate(R.layout.fragment_ps4, container, false);
        databaseReference = FirebaseDatabase.getInstance().getReference("games");
        gameRecyclerView = fragmentView.findViewById(R.id.rv_fregmentXbox);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 3);
        gameRecyclerView.setLayoutManager(layoutManager);

        return fragmentView ;
    }

    @Override
    public void onStart() {
        // Coger las listas de la database
        super.onStart();
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                gameList = new ArrayList<>();
                for (DataSnapshot gameSnap : dataSnapshot.getChildren()) {
                    Game game = gameSnap.getValue(Game.class);

                    if (game.getPlatform().contains("PS4")) {
                        gameList.add(game);
                    }
                }
                gameAdapter = new GameAdapter(getActivity(), (ArrayList<Game>) gameList);
                gameRecyclerView.setAdapter(gameAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
