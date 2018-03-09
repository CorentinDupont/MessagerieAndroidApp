package com.corentindupont.messagerie.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.corentindupont.messagerie.Adapter.ContactAdapter;
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
public class ContactsFragment extends Fragment {


    public ContactsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Recycler View
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.contact_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        //Liste de contact brute
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Jean", "Dupont"));
        contacts.add(new Contact("Jeanne", "Dupont"));
        contacts.add(new Contact("Jeanette", "Dupont"));
        contacts.add(new Contact("Gens", "Dupont"));


        // adapter :
        ContactAdapter contactAdapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(contactAdapter);
    }
}
