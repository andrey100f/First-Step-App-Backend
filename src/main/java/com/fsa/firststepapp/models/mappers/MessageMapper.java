package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.Message;
import com.fsa.firststepapp.models.dto.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MessageMapper {
    private final UserMapper userMapper;

    @Autowired
    public MessageMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public MessageDto convertModelToDto(Message message) {
        MessageDto messageDto = new MessageDto();

        messageDto.setMessageId(message.getMessageId());
        messageDto.setText(message.getText());
        messageDto.setUserDto(userMapper.convertModelToDto(message.getUser()));
        messageDto.setMessageDate(message.getMessageDate());
        messageDto.setCategory(message.getCategory());

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
