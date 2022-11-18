package com.pi.booking.hotel.room.controller;


import com.pi.booking.hotel.room.model.dto.UserDTO;
import com.pi.booking.hotel.room.model.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @PostMapping()
    public ResponseEntity<Map<String,Object>> create(@RequestBody UserDTO user){
        Map<String, Object> response = new HashMap<>();
        String passWEncrypt = passwordEncoder.encode(user.getPassword());
        user.setPassword(passWEncrypt);
        response.put("respuesta",userService.save(user));
        return ResponseEntity.ok(response);
    }
}
