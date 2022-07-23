package ro.fasttrackit.tema10exerc1v2.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity(name = "Location")
@Table(name = "location")
public class LocationEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String city;

    public LocationEntity(String city) { this.city = city; }

    public LocationEntity() { }

    public Long getId() { return this.id; }
    public String getCity() { return this.city; }
}
