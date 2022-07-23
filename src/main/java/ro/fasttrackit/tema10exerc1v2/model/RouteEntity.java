package ro.fasttrackit.tema10exerc1v2.model;

//import org.springframework.data.annotation.Id;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class RouteEntity
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocationEntity start;
    private LocationEntity destination;
    private Double length;
    private TrainEntity train;

//    private final LocationEntity defaultStartLocation = new LocationEntity("n/a");
//    private final LocationEntity defaultDestinationtLocation = new LocationEntity("n/a");
//    private final TrainEntity defaultTrain = new TrainEntity("n/a", 0, defaultStartLocation);
//
//    public RouteEntity(Double length, TrainEntity train)
//    {
//        this.length = length;
//        this.train = train;
//    }
//
//    public RouteEntity() // constructor fara arg cerut de JPA
//    {
//        this(0.0, new TrainEntity("n/a", 0));
//    }

    public RouteEntity(LocationEntity start, LocationEntity destination, Double length, TrainEntity train)
    {
        this.start = start;
        this.destination = destination;
        this.length = length;
        this.train = train;
    }

    public RouteEntity() // constructor fara arg cerut de JPA
    {
//        this(new LocationEntity("n/a"),
//                new LocationEntity("n/a"),
//                0.0,
//                new TrainEntity("n/a", 0, new LocationEntity("n/a"))
//        );
    }

    public Long getId() { return this.id; }
    public LocationEntity getStart() { return this.start; }
    public LocationEntity getDestination() { return this.destination; }
    public Double getLength() { return this.length; }
    public TrainEntity getTrain() { return this.train; }


//    public Long getId() { return this.id; }
//    public Location getStart() { return this.start; }
//    public Location getDestination() { return this.destination; }
//    public Double getLength() { return this.length; }
//    public TrainEntity getTrain() { return this.train; }
//
//    public void setId(Long id) { this.id = id; }
//    public void setStart(Location start) { this.start = start; }
//    public void setDestination(Location destination) { this.destination = destination; }
//    public void setLength(Double length) { this.length = length; }
//    public void setTrain(TrainEntity train) { this.train = train; }
}
