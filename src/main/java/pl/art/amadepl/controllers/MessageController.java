package pl.art.amadepl.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.art.amadepl.dto.MessageDto;
import pl.art.amadepl.exception.MessageDBException;
import pl.art.amadepl.exception.MessageNotFoundException;
import pl.art.amadepl.service.SearchEngine;

import java.util.List;


@RestController
public class MessageController {

    private Logger logger = LoggerFactory.getLogger(MessageController.class);

    @Autowired
    @Qualifier("search")
    private SearchEngine searchEngine;

    @RequestMapping("/messages")
    public List<MessageDto> findAll() throws MessageDBException {
        return searchEngine.findAll();
    }

    @RequestMapping("/messages/{messagesId}")
    public MessageDto findById(@PathVariable("messagesId") Integer messagesId) throws MessageNotFoundException {
        MessageDto messageDto = null;
        try {
            messageDto=searchEngine.findById(messagesId);
        } catch (MessageNotFoundException e) {
            logger.error("message with id = " + messagesId + " does not exist");
        }
        return messageDto;
    }

    }


