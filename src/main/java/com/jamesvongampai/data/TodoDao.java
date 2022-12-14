package com.jamesvongampai.data;

import com.jamesvongampai.models.Todo;

import java.util.List;

public interface TodoDao {
    Todo add(Todo todo);
    List<Todo> getAll();

    Todo findById(int id);

    boolean update(Todo todo);

    boolean deleteById(int id);

}
