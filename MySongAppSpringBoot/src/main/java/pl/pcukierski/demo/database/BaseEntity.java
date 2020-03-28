package pl.pcukierski.demo.database;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "created_date", updatable = false)
    private Date created_date;

    @Column(name = "updated_date", updatable = false)
    private Date updated_date;

    @PrePersist
    void prePersistMethod(){
        this.created_date = new Date();
        this.updated_date = new Date();
    }

    @PreUpdate
    void preUpdateMethod(){
        this.updated_date = new Date();
    }
}
