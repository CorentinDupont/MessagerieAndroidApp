package com.corentindupont.messagerie.Entity;

import java.util.Date;

/**
 * Created by Corentin on 08/03/2018.
 */

public class Message {
    private String content;
    private Date date;

    public Message(String content) {
        this.content = content;
        this.date = new Date();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
