package com.Mi_API_de_Tareas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> getAllTasks(){
        return tareaService.obtenerTodas();
    }

    @PostMapping
    public Tarea createTask(@RequestBody Tarea tarea){
        return tareaService.guardarTarea(tarea);
    }

}
