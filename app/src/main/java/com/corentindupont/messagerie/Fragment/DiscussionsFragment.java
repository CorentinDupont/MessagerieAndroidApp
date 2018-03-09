package com.corentindupont.messagerie.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.corentindupont.messagerie.Adapter.DiscussionAdapter;
import com.corentindupont.messagerie.Entity.Contact;
import com.corentindupont.messagerie.Entity.Discussion;
import com.corentindupont.messagerie.Entity.Message;
import com.corentindupont.messagerie.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DiscussionsFragment extends Fragment {


    public DiscussionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discussions, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        //Recycler View
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.discussion_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        //Liste de contact brute
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Jean", "Dupont"));
        contacts.add(new Contact("Jeanne", "Dupont"));
        contacts.add(new Contact("Jeanette", "Dupont"));
        contacts.add(new Contact("Gens", "Dupont"));

        //Liste de discussions brute
        List<Discussion> discussions = new ArrayList<>();
        Discussion discussion1 = new Discussion(contacts.get(0));
        discussion1.addMessage(new Message("Bonjour je t'envois ce message dans le but de t'envoyer un message très long"));
        Discussion discussion2 = new Discussion(contacts.get(1));
        discussion2.addMessage(new Message("Bonsoir je t'envois ce message dans le but de t'envoyer un message très long"));
        Discussion discussion3 = new Discussion(contacts.get(2));
        discussion3.addMessage(new Message("Hello je t'envois ce message dans le but de t'envoyer un message très long"));
        Discussion discussion4 = new Discussion(contacts.get(3));
        discussion4.addMessage(new Message("Hola je t'envois ce message dans le but de t'envoyer un message très long"));

        discussions.add(discussion1);
        discussions.add(discussion2);
        discussions.add(discussion3);
        discussions.add(discussion4);


        // adapter :
        DiscussionAdapter discussionAdapter = new DiscussionAdapter(discussions);
        recyclerView.setAdapter(discussionAdapter);
    }
}
