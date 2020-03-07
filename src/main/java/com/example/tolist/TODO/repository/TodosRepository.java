package com.example.tolist.TODO.repository;


import com.example.tolist.TODO.entity.Todos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodosRepository extends CrudRepository<Todos, Long> {

    Todos findByName(String name);

    List<Todos> findByCompletedAndUserId(boolean complated, Long Id);

}
