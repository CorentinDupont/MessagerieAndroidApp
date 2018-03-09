package com.corentindupont.messagerie.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.corentindupont.messagerie.ContactViewHolder;
import com.corentindupont.messagerie.DiscussionViewHolder;
import com.corentindupont.messagerie.Entity.Contact;
import com.corentindupont.messagerie.Entity.Discussion;
import com.corentindupont.messagerie.R;

import java.util.List;

/**
 * Created by Corentin on 09/03/2018.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private List<Contact> contacts = null;

    //Constructor
    public ContactAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contactView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        return new ContactViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.getTextViewNameInitials().setText(contacts.get(position).getInitials());
        holder.getTextViewNameReceiver().setText(contacts.get(position).getFullName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
