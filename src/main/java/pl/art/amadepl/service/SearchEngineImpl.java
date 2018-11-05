package pl.art.amadepl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.art.amadepl.dto.MessageDto;
import pl.art.amadepl.entity.Message;
import pl.art.amadepl.entity.MessageType;
import pl.art.amadepl.exception.MessageDBException;
import pl.art.amadepl.exception.MessageNotFoundException;
import pl.art.amadepl.repository.MessageRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service("search")
public class SearchEngineImpl implements SearchEngine {

    @Autowired
    private MessageRepository messageRepository;


    @Override
    public List<MessageDto> findAll() throws MessageDBException {
        Iterable<Message> messages = messageRepository.findAll();
        return StreamSupport
                .stream(messages.spliterator(), false)
                .map(new MessageConverter())
                .collect(Collectors.toList());
    }

    @Override
    public MessageDto findById(Integer id) throws MessageNotFoundException {
        Optional<Message> message = messageRepository.findById(id);
        Optional<MessageDto> messageDto = message.map(new MessageConverter());
        if (messageDto.isPresent()) {
            return messageDto.get();
        } else {
            throw new MessageNotFoundException("There is no message with id = " +id);
        }
    }

    @Override
    public List<MessageDto> findByType(MessageType messageType) throws MessageDBException {
        List<MessageDto> showTypeMessage = new ArrayList<>();
        for (MessageDto message : findAll()) {
            if (message.getMessageType().equals(messageType))
                  showTypeMessage.add(message);
        }
        return showTypeMessage;
    }

    class MessageConverter implements Function<Message, MessageDto> {

        @Override
        public MessageDto apply(Message message) {
            MessageDto messageDto = new MessageDto(message.getId(),message.getText(),
                    message.getMessageType(), message.getCreated());
            return messageDto;
        }
    }

}
