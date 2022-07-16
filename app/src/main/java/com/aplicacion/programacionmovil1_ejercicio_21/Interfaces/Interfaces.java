package com.aplicacion.programacionmovil1_ejercicio_21.Interfaces;

import com.aplicacion.programacionmovil1_ejercicio_21.Models.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Interfaces {


    String Ruta0 = "/posts";
    String Ruta1 = "/posts/{value}";

    @GET(Ruta0)
    Call<List<Usuario>> getUsuarios();

    @GET(Ruta1)
    Call<Usuario> getUsuario(@Path("value") String value);

}
