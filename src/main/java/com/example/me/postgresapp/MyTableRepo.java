package com.example.me.postgresapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTableRepo extends JpaRepository<MyTable,Integer> {

}
