package com.aluracursos.desafio.service;

public interface IConvierteDatos {

    <T> T obternerDatos(String json, Class<T> clase);
}
