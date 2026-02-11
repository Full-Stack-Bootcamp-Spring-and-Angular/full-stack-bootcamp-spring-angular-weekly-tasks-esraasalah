package com.vehicleSystem.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vehicleSystem.dao.DatabaseOperations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.vehicleSystem.enums.Type;

@Setter

@Scope("prototype")
@NoArgsConstructor
public class Bike implements Vehicle {

    Integer id;
    String model;
    Type type;

    public Bike(String model, Type type) {

        this.model = model;
        this.type = type;
    }

    public Bike(Integer id, String model, Type type) {
        this.id = id;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bike [id=" + id + ", model=" + model + ", type=" + type + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

}
