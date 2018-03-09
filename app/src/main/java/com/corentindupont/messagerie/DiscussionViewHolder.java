package com.corentindupont.messagerie;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Corentin on 09/03/2018.
 */

public class DiscussionViewHolder extends RecyclerView.ViewHolder {

    //Name initial TextView
    private TextView textViewNameInitials = null;
    private TextView textViewNameReceiver = null;
    private TextView lastMessageContent = null;

    //Constructor
    public DiscussionViewHolder(View itemView) {
        super(itemView);
        textViewNameInitials = (TextView) itemView.findViewById(R.id.name_initial_text_view);
        textViewNameReceiver = (TextView) itemView.findViewById(R.id.receiver_name_text_view);
        lastMessageContent = (TextView) itemView.findViewById(R.id.last_message_content_text_view);
    }

    public TextView getTextViewNameInitials() {
        return textViewNameInitials;
    }

    public TextView getTextViewNameReceiver() {
        return textViewNameReceiver;
    }

    public TextView getLastMessageContent() {
        return lastMessageContent;
    }
}
