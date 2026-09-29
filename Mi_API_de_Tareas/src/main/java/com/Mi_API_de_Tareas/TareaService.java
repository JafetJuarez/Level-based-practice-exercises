package com.Mi_API_de_Tareas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    @Autowired
    private ITareaRepository repositorio;

    public List<Tarea> obtenerTodas(){
        return repositorio.findAll();
    }

    public Tarea guardarTarea(Tarea tarea){
        return repositorio.save(tarea);
    }

}
