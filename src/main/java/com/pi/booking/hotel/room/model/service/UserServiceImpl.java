package com.pi.booking.hotel.room.model.service;

import com.pi.booking.hotel.room.model.dto.UserDTO;
import com.pi.booking.hotel.room.model.entity.UserEntity;
import com.pi.booking.hotel.room.model.repository.IUserRepository;
import com.pi.booking.hotel.room.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private MapperUtil mapperUtil;

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public UserDTO save(UserDTO user) {
        return mapperUtil.map(userRepository.save(mapperUtil.map(user, UserEntity.class)), UserDTO.class);
    }

    @Override
    public UserDTO update(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO delete(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO findByCorreo(String correo) {
        return mapperUtil.map(userRepository.findByCorreo(correo), UserDTO.class);
    }
}
