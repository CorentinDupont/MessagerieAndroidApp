package com.corentindupont.messagerie;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Corentin on 09/03/2018.
 */

public class ContactViewHolder extends RecyclerView.ViewHolder {



    //Name initial TextView
    private TextView textViewNameInitials = null;
    //Contact Name text view
    private TextView textViewNameContact = null;

    //Constructor
    public ContactViewHolder(View itemView) {
        super(itemView);
        textViewNameInitials = (TextView) itemView.findViewById(R.id.contact_name_initial_text_view);
        textViewNameContact = (TextView) itemView.findViewById(R.id.contact_name_text_view);
    }

    public TextView getTextViewNameInitials() {
        return textViewNameInitials;
    }

    public TextView getTextViewNameReceiver() {
        return textViewNameContact;
    }
}
