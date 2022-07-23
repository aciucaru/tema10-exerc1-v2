package ro.fasttrackit.tema10exerc1v2.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import ro.fasttrackit.tema10exerc1v2.model.*;
import ro.fasttrackit.tema10exerc1v2.service.*;

@RestController
@RequestMapping("trains")
public class TrainController
{
    private final TrainService service;

    public TrainController(TrainService service)
    { this.service = service; }

    @GetMapping("{id}")
    public Optional<TrainEntity> getById(@PathVariable String id)
    {
        Optional<TrainEntity> optTrain = Optional.ofNullable(null);
        if(id != null)
            optTrain = service.getById(id);
        return optTrain;
    }

    @GetMapping
    public List<TrainEntity> getAll() { return service.getAll(); }

    @GetMapping(value = "", params = {"location"})
    // cum trebuie sa fie argumentul pentru a putea sorta dupa o locatie anume ??
    public List<TrainEntity> getAllBy(@RequestParam("location") LocationEntity location)
    {
        return service.getAll();
    }

    @PostMapping
    public Optional<TrainEntity> add(@RequestBody TrainEntity train)
    {
        Optional<TrainEntity> optTrain = service.add(train);
        return optTrain;
    }

    @DeleteMapping("{id}")
    public Optional<TrainEntity> delete(@PathVariable String id)
    {
        Optional<TrainEntity> optTrain = Optional.ofNullable(null);
        if(id != null)
            optTrain = service.delete(id);
        return optTrain;
    }
}
