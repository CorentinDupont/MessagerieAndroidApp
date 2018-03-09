package com.corentindupont.messagerie.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Corentin on 08/03/2018.
 */

public class Discussion {

    private Contact receiver;
    private List<Message> messages;

    public Discussion(Contact receiver) {
        this.receiver = receiver;
        messages = new ArrayList<>();
    }

    public Contact getReceiver() {
        return receiver;
    }

    public void setReceiver(Contact receiver) {
        this.receiver = receiver;
    }

    public void addMessage(Message message){
        messages.add(message);
    }

    public void removeMessage(Message message){
        messages.remove(message);
    }

    public Message getMessage(int position){
        return messages.get(position);
    }

    public int getMessageCount(){
        return messages.size();
    }
}
