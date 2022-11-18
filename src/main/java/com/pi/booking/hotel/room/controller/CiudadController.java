package com.pi.booking.hotel.room.controller;


import com.pi.booking.hotel.room.model.dto.CiudadDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/city")
public class CiudadController {



    /**
     * PUBLIC
     * */
    @GetMapping
    public ResponseEntity<Map<String,Object>>ciudad(){
        Map<String,Object> response = new HashMap<>();
        response.put("respuesta","Bogota");
        return ResponseEntity.ok(response);
    }

    /**
     * ADMIN
     * */
    @PostMapping
    public ResponseEntity<Map<String,Object>>crearCiudad(@RequestBody CiudadDTO ciudad){
        Map<String,Object> response = new HashMap<>();
        response.put("respuesta",ciudad);
        response.put("mensaje","ciudad creada");
        return ResponseEntity.ok(response);
    }

    /**
     * User
     * */
    @PostMapping("/pais/{pais}")
    public ResponseEntity<Map<String,Object>>pais(@PathVariable String pais){
        Map<String,Object> response = new HashMap<>();
        response.put("respuesta",pais);
        return ResponseEntity.ok(response);
    }

}
