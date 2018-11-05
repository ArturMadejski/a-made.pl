package pl.art.amadepl.dto;

import org.springframework.stereotype.Component;
import pl.art.amadepl.entity.MessageType;

import java.util.Date;

public class MessageDto {

    private Integer id;
    private String text;
    private MessageType messageType;
    private Date created;

    public MessageDto(Integer id, String text, MessageType messageType, Date created) {
        this.id = id;
        this.text = text;
        this.messageType = messageType;
        this.created = created;
    }

    public MessageDto() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;

    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public Date getCreated() {
        return created;
    }


}
