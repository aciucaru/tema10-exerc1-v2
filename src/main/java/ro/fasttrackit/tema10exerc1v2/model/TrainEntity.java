package ro.fasttrackit.tema10exerc1v2.model;

//import org.springframework.data.annotation.Id;
import javax.persistence.Id; // @Id trebuie sa fie din JPA, nu din Spring
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class TrainEntity
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    private Integer numOfCarts;
    private LocationEntity location;

//    public TrainEntity(String model, Integer numOfCarts)
//    {
//        this.model = model;
//        this.numOfCarts = numOfCarts;
//    }
//
//    public TrainEntity() // constructor fara arg cerut de JPA
//    {
//        this("n/a", 0);
//    }

    public TrainEntity(String model, Integer numOfCarts, LocationEntity location)
    {
        this.model = model;
        this.numOfCarts = numOfCarts;
        this.location = location;
    }

    public TrainEntity() // constructor fara arg cerut de JPA
    {
//        this("n/a", 0, new LocationEntity());
    }

    public Long getId() { return this.id; }
    public String getModel() { return this.model; }
    public Integer getNumOfCarts() { return this.numOfCarts; }
    public LocationEntity getLocation() { return this.location; }

//    public Long getId() { return this.id; }
//    public String getModel() { return this.model; }
//    public Integer getNumOfCarts() { return this.numOfCarts; }
//    public Location getLocation() { return this.location; }
//
//    public void setId(Long id) { this.id = id; }
//    public void setModel(String model) { this.model = model; }
//    public void setNumOfCarts(Integer numOfCarts) { this.numOfCarts = numOfCarts; }
//    public void setLocation(Location location) { this.location = location; }
}
