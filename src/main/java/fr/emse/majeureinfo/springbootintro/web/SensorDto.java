package fr.emse.majeureinfo.springbootintro.web;

import fr.emse.majeureinfo.springbootintro.model.Sensor;
import fr.emse.majeureinfo.springbootintro.model.Status;

public class SensorDto {

    // il manque les  termes pour spécifier les caractéristiques dto des éléments.
    //@@Id
    //@GeneratedValue
    private final Long id;
    //@Column(nullable = false)
    private final Integer signal;
    //@Enumerated(EnumType.STRING)
    private final Status status;

    public SensorDto(Sensor sensor) {
        this.id = sensor.getId();
        this.signal = sensor.getSignal();
        this.status = sensor.getStatus();
    }

    public Long getId() {
        return id;
    }

    public Integer getSignal() {
        return signal;
    }

    public Status getStatus() {
        return status;
    }
}
