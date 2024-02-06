package com.tauynd.service;


import com.tauynd.model.AbstractEntity;
import com.tauynd.repository.Repository;

public class Service<T extends AbstractEntity> {

    private Repository<T> repository;

    private final Class<T> entityClass;

    public Service(Class<T> entityClass) {
        this.entityClass = entityClass;
        repository = new Repository<>(this.entityClass);
    }
    
    public T create(T entity) {
        return repository.create(entity);
    }

    public T read(T entity) {
        return repository.read(entity);        
    }

    public T update(T entity) {
        return repository.update(entity);
    }

    public void delete(T entity) {
        repository.delete(entity);     
    }

    public Long count() {
        return repository.count();
    }
    
}
