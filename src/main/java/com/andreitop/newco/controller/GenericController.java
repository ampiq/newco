package com.andreitop.newco.controller;

import java.util.List;

public interface GenericController<T> {

    List<T> findAll();

    T findById(final Long id);

    void create(final T trip);

    void delete(final Long id);

    void update(final T newTrip);
}
