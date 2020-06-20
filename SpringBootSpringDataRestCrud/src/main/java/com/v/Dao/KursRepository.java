package com.v.Dao;

import com.v.Domain.Kurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="kurslar")
public interface KursRepository extends JpaRepository<Kurs,Integer> {
}
