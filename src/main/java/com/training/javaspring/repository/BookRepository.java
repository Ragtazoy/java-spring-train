package com.training.javaspring.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.javaspring.models.BookModel;

public interface BookRepository extends CrudRepository<BookModel, Long> {

}
