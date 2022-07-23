package ro.fasttrackit.tema10exerc1v2.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import ro.fasttrackit.tema10exerc1v2.model.*;
import ro.fasttrackit.tema10exerc1v2.repository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TrainService
{
    private final TrainRepository repository;
    private final TrainDAO dao;

    public TrainService(TrainRepository repository, TrainDAO dao)
    {
        this.repository = repository;
        this.dao = dao;
    }

    public Optional<TrainEntity> getById(String id)
    {
        Optional<TrainEntity> optTrain = Optional.ofNullable(null);
        if(id != null)
            optTrain = repository.findById(id);
        return optTrain;
    }

    public List<TrainEntity> getAll() { return repository.findAll(); }


    // cum se face un qury dupa Location ???
    public List<TrainEntity> getAllBy(LocationEntity location)
    {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("????????").is("?????????"));
//        List<TrainEntity> users = mongoTemplate.find(query, User.class);

        return new ArrayList<TrainEntity>(0);
    }

    public Optional<TrainEntity> add(TrainEntity train)
    {
        Optional<TrainEntity> optTrain = Optional.ofNullable(repository.save(train));
        return optTrain;
    }

    public Optional<TrainEntity> delete(@PathVariable String id)
    {
        Optional<TrainEntity> optTrain = repository.findById(id);
        if(optTrain.isPresent())
            repository.delete(optTrain.get());
        return optTrain;
    }
}
