package com.example.adrey.firstproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class CharacterListAdapter extends RecyclerView.Adapter<CharacterViewHolder> {

    List<Character> characterList;

    public CharacterListAdapter(List<Character> characterList) {
        this.characterList = characterList;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder characterViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
