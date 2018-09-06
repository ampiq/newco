package com.andreitop.newco.service;

import java.util.List;

public interface GenericService<T> {

    List<T> findAll();

    T findById(final Long id);

    void save(final T trip);

    void delete(final Long id);

    void update(final T newTrip);
}
