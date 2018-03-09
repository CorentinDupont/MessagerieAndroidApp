package com.corentindupont.messagerie.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.corentindupont.messagerie.DiscussionViewHolder;
import com.corentindupont.messagerie.Entity.Discussion;
import com.corentindupont.messagerie.R;

import java.util.List;

/**
 * Created by Corentin on 09/03/2018.
 */

public class DiscussionAdapter extends RecyclerView.Adapter<DiscussionViewHolder> {

    private List<Discussion> discussions = null;

    //Constructor
    public DiscussionAdapter(List<Discussion> discussions) {
        this.discussions = discussions;
    }

    @Override
    public DiscussionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View discussionView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_discussion, parent, false);
        return new DiscussionViewHolder(discussionView);
    }

    @Override
    public void onBindViewHolder(DiscussionViewHolder holder, int position) {
        holder.getTextViewNameInitials().setText(discussions.get(position).getReceiver().getInitials());
        holder.getTextViewNameReceiver().setText(discussions.get(position).getReceiver().getFullName());
        holder.getLastMessageContent().setText(discussions.get(position).getMessage(discussions.get(position).getMessageCount()-1).getContent());
    }

    @Override
    public int getItemCount() {
        return discussions.size();
    }
}
