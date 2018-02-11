package com.example.root.barcodepractice.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by root on 2/12/18.
 */

@Entity
public class ProductKirimChiqim {
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "type")
    private Integer type;

    @Property(nameInDb = "name")
    private String name;

    @Property(nameInDb = "count")
    private Double count;

    @Property(nameInDb = "sell")
    private Double sell;

    @Property(nameInDb = "cost")
    private Double cost;

    @Generated(hash = 1274559896)
    public ProductKirimChiqim(Long id, Integer type, String name, Double count,
            Double sell, Double cost) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.count = count;
        this.sell = sell;
        this.cost = cost;
    }

    @Generated(hash = 375752455)
    public ProductKirimChiqim() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCount() {
        return this.count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public Double getSell() {
        return this.sell;
    }

    public void setSell(Double sell) {
        this.sell = sell;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
