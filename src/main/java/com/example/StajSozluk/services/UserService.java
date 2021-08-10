package com.example.StajSozluk.services;


import com.example.StajSozluk.Model.User;
import com.example.StajSozluk.dto.UserDto;
import com.example.StajSozluk.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class UserService implements IUserService
{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public void addUser(UserDto userDto) {
        User user = new User(userDto.getMail(),userDto.getPassword(),userDto.getNickname());
        userRepository.save(user);
    }
    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
    @Override
    public void updateUser(UserDto userDto) {

        User user= userRepository.findById(userDto.getId());
        user.setMail(userDto.getMail());
        user.setPassword(userDto.getPassword());
        user.setNickname(userDto.getNickname());
        userRepository.save(user);
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return userRepository.findById(id);
    }
}
