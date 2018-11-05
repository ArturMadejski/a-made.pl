package pl.art.amadepl.service;

import org.springframework.stereotype.Service;
import pl.art.amadepl.dto.MessageDto;
import pl.art.amadepl.entity.MessageType;
import pl.art.amadepl.exception.MessageDBException;
import pl.art.amadepl.exception.MessageNotFoundException;

import java.util.List;

@Service
public interface SearchEngine {

    List<MessageDto> findAll() throws MessageDBException;

    MessageDto findById(Integer id) throws MessageNotFoundException;

    List<MessageDto> findByType(MessageType messageType) throws MessageDBException;
}
