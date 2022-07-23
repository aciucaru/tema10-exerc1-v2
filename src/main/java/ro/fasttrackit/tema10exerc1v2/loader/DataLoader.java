package ro.fasttrackit.tema10exerc1v2.loader;

import org.springframework.boot.CommandLineRunner;
import ro.fasttrackit.tema10exerc1v2.model.*;
import ro.fasttrackit.tema10exerc1v2.repository.*;
import static java.util.UUID.randomUUID;

public class DataLoader implements CommandLineRunner
{
    private final LocationRepository locationRepository;
//    private final RouteRepository routeRepository;
//    private final TrainRepository trainRepository;

//    public DataLoader(LocationRepository locationRepository,
//                      RouteRepository routeRepository,
//                      TrainRepository trainRepository)
//    {
//        this.locationRepository = locationRepository;
//        this.routeRepository = routeRepository;
//        this.trainRepository = trainRepository;
//    }

    public DataLoader(LocationRepository locationRepository)
    {
        this.locationRepository = locationRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        LocationEntity location1 = new LocationEntity("Bucuresti");
        LocationEntity location2 = new LocationEntity("Constanta");
        LocationEntity location3 = new LocationEntity("Cluj-Napoca");
        LocationEntity location4 = new LocationEntity("Iasi");

        locationRepository.save(location1);
        locationRepository.save(location2);
        locationRepository.save(location3);
        locationRepository.save(location4);
//
//        TrainEntity train1 = new TrainEntity("Clasa 40", 10);
//        TrainEntity train2 = new TrainEntity("Clasa 41", 8);
//        TrainEntity train3 = new TrainEntity("Clasa 60", 9);
//        TrainEntity train4 = new TrainEntity("Clasa 62", 9);
//
//        trainRepository.save(train1);
//        trainRepository.save(train2);
//        trainRepository.save(train3);
//        trainRepository.save(train4);
//
//        RouteEntity route1 = new RouteEntity(225.0, train1);
//        RouteEntity route2 = new RouteEntity(225.0, train2);
//        RouteEntity route3 = new RouteEntity(391.0, train3);
//        RouteEntity route4 = new RouteEntity(452.0, train4);
//
//        routeRepository.save(route1);
//        routeRepository.save(route2);
//        routeRepository.save(route3);
//        routeRepository.save(route4);
//
//        System.out.println("Data loaded");

//        LocationEntity location1 = new LocationEntity("Bucuresti");
//        LocationEntity location2 = new LocationEntity("Constanta");
//        LocationEntity location3 = new LocationEntity("Cluj-Napoca");
//        LocationEntity location4 = new LocationEntity("Iasi");
//
//        locationRepository.save(location1);
//        locationRepository.save(location2);
//        locationRepository.save(location3);
//        locationRepository.save(location4);
//
//        TrainEntity train1 = new TrainEntity("Clasa 40", 10, location1);
//        TrainEntity train2 = new TrainEntity("Clasa 41", 8, location2);
//        TrainEntity train3 = new TrainEntity("Clasa 60", 9, location3);
//        TrainEntity train4 = new TrainEntity("Clasa 62", 9, location4);
//
//        trainRepository.save(train1);
//        trainRepository.save(train2);
//        trainRepository.save(train3);
//        trainRepository.save(train4);
//
//        RouteEntity route1 = new RouteEntity(location1, location2, 225.0, train1);
//        RouteEntity route2 = new RouteEntity(location2, location1, 225.0, train2);
//        RouteEntity route3 = new RouteEntity(location3, location1, 391.0, train3);
//        RouteEntity route4 = new RouteEntity(location4, location2, 452.0, train4);
//
//        routeRepository.save(route1);
//        routeRepository.save(route2);
//        routeRepository.save(route3);
//        routeRepository.save(route4);
//
//        System.out.println("Data loaded");
    }
}
