package com.aluracursos.proyecto.service;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);

}
