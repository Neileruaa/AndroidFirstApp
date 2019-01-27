package com.example.adrey.firstproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
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
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.fragment_character,viewGroup,false);
        return new CharacterViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder characterViewHolder, int i) {
        Character teacher =  characterList.get(i);
        characterViewHolder.firstNameView.setText(teacher.getFirstName());
        characterViewHolder.familyNameView.setText(teacher.getFamilyName());
        characterViewHolder.latitudeView.setText(""+teacher.getLatitude());
        characterViewHolder.longitudeView.setText(""+teacher.getLongitude());

    }

    @Override
    public int getItemCount() {
        return characterList.size();
    }
}
