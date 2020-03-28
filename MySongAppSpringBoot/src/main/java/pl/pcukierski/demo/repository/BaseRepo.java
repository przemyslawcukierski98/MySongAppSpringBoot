package pl.pcukierski.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.pcukierski.demo.database.BaseEntity;

import java.io.Serializable;

public interface BaseRepo <T extends BaseEntity, K extends Serializable> extends JpaRepository<T,K>, JpaSpecificationExecutor<T> {

}
