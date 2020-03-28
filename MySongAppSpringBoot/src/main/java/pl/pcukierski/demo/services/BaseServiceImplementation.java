package pl.pcukierski.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pl.pcukierski.demo.database.BaseEntity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public abstract class BaseServiceImplementation<T extends BaseEntity, K extends Serializable, R extends JpaRepository<T,K>> implements BaseService<T,K,R> {

    @Override
    public T saveSong(T song) {
        return getRepository().save(song);
    }

    @Override
    public T getSong(Integer id) {
        return getRepository().getOne((K) id);
    }

    @Override
    public Collection<T> getAllSongs() {
        return getRepository().findAll().stream().collect(Collectors.toList());
    }

    public abstract R getRepository();
}
