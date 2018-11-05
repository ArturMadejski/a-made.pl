package pl.art.amadepl.web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.art.amadepl.dto.MessageDto;
import pl.art.amadepl.exception.MessageDBException;
import pl.art.amadepl.exception.MessageNotFoundException;
import pl.art.amadepl.service.SearchEngine;

import java.util.List;
import java.util.Map;

@Controller
public class MessagesControllers {

    @Autowired
    private SearchEngine searchEngine;

    @RequestMapping(value = "/messagesList", produces = MediaType.TEXT_HTML_VALUE,
            method = RequestMethod.GET)
    public String findMessages (Map<String, Object> model) throws MessageDBException {
        List<MessageDto> messageDto = searchEngine.findAll();
        model.put("messagesList", messageDto );
        return "messages";
    }
    @RequestMapping(value = "/messages/edit/{id}")
    public  String editMessage(@PathVariable Integer id, Map<String, Object> model) throws MessageNotFoundException {
        MessageDto messageDto = searchEngine.findById(id);
        model.put("messagesList", messageDto);
        model.put("edit", true);
        return "editMessage";
    }



}

