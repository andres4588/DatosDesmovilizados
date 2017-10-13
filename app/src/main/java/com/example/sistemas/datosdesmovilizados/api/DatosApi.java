package com.example.sistemas.datosdesmovilizados.api;

import com.example.sistemas.datosdesmovilizados.models.Municipio;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sistemas on 13/10/17.
 */

public interface DatosApi {
    @GET("panu-4x37.json")
    Call<List<Municipio>> obtenerListaMunicipios();
}
