package com.example.root.barcodepractice.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by root on 2/12/18.
 */

@Entity
public class Owner {
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "name")
    private String name;

    @Generated(hash = 1961513222)
    public Owner(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 748179547)
    public Owner() {
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

}
