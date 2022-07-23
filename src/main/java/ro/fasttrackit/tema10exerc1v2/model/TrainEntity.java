package ro.fasttrackit.tema10exerc1v2.model;

//import org.springframework.data.annotation.Id;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Train")
@Table(name = "train")
public class TrainEntity
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    private Integer numOfCarts;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "train_id")
    private List<LocationEntity> locations = new ArrayList<LocationEntity>();

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

    public TrainEntity(String model, Integer numOfCarts, List<LocationEntity> locations)
    {
        this.model = model;
        this.numOfCarts = numOfCarts;
        this.locations = locations;
    }

    public TrainEntity() // constructor fara arg cerut de JPA
    {
//        this("n/a", 0, new LocationEntity());
    }

    public Long getId() { return this.id; }
    public String getModel() { return this.model; }
    public Integer getNumOfCarts() { return this.numOfCarts; }
    public List<LocationEntity> getLocations() { return this.locations; }

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
