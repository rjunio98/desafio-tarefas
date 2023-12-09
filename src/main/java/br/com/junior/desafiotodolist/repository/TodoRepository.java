package br.com.junior.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.junior.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}

