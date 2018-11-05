package pl.art.amadepl.entity;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "messages")
public class Message {

    public Message(Integer id, String text, MessageType messageType, Date created) {
        this.id = id;
        this.text = text;
        this.messageType = messageType;
        this.created = created;
    }

    public  Message() {}

    @Id
    private Integer id;

    @Column(name = "text")
    private String text;

    @Enumerated(EnumType.STRING)
    private MessageType messageType;

    @Column(name = "created")
    private Date created;


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
