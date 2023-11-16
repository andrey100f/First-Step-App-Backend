package com.fsa.firststepapp.models.mappers;

import com.fsa.firststepapp.models.User;
import com.fsa.firststepapp.models.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {
    private final UniversityMapper universityMapper;
    private final FacultyMapper facultyMapper;

    @Autowired
    public UserMapper(UniversityMapper universityMapper, FacultyMapper facultyMapper) {
        this.universityMapper = universityMapper;
        this.facultyMapper = facultyMapper;
    }

    public UserDto convertModelToDto(User user) {
        UserDto userDto = new UserDto();

        userDto.setUserId(user.getUserId());
        userDto.setName(user.getName());
        userDto.setSex(user.getSex());
        userDto.setBirthDate(user.getBirthDate());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setPhoneNumber(user.getPhoneNumber());
        userDto.setUniversityDto(universityMapper.convertModelToDto(user.getUniversity()));
        userDto.setFacultyDto(facultyMapper.convertModelToDto(user.getFaculty()));
        userDto.setImg(user.getImg());

        return userDto;
    }

    public List<UserDto> convertModelListToDtoList(List<User> users) {
        List<UserDto> userDtos = new ArrayList<>();

        for(User user: users) {
            userDtos.add(convertModelToDto(user));
        }

        return userDtos;
    }
}
