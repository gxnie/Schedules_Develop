package com.example.schedules_develop.Service;


import com.example.schedules_develop.Dto.SignUpResponseDto;
import com.example.schedules_develop.Repository.UserRepository;
import com.example.schedules_develop.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    // 생성
    public SignUpResponseDto signUp(String username, String email, String password){

        User user = new User(username, email, password);

        User savedUser = userRepository.save(user);

        return new SignUpResponseDto(savedUser.getId(), savedUser.getUserName(), savedUser.getEmail(), savedUser.getPassword(), user.getPassword());

    }

    // 조회
    public List<SignUpResponseDto> findAll() {
        return userRepository.findAll()
                .stream()
                .map(SignUpResponseDto::userDto)
                .toList();
    }

    // 삭제
    public void delete(Long id) {

        User findUser = userRepository.findByIdOrElseThrow(id);

        userRepository.delete(findUser);
    }
}
