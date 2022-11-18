package com.pi.booking.hotel.room.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CiudadDTO {

    private String nombre;

    private String descripcion;

    private String clima;
}
