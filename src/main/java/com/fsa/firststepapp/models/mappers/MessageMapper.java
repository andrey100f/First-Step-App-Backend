package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Message;
import com.fsa.firststepapp.models.dto.MessageDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MessageMapper {
    public MessageDto convertModelToDto(Message message) {
        MessageDto messageDto = new MessageDto();

        messageDto.setMessageId(message.getMessageId());
        messageDto.setText(message.getText());
        messageDto.setUser(message.getUser());
        messageDto.setMessageDate(message.getMessageDate());

        return messageDto;
    }

    public List<MessageDto> convertModelListToDtoList(List<Message> messages) {
        List<MessageDto> messageDtos = new ArrayList<>();

        for(Message message: messages) {
            messageDtos.add(convertModelToDto(message));
        }

        return messageDtos;
    }
}
