package pl.pcukierski.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pl.pcukierski.demo.database.BaseEntity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;

@Service
public interface BaseService<T extends BaseEntity, K extends Serializable, R extends JpaRepository<T,K>> {

    T saveSong(T song);
    T getSong(Integer id);
    Collection<T> getAllSongs();
    R getRepository();

}
