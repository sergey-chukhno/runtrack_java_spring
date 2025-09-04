package com.example.demo.repository;

import com.example.demo.model.Person;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person, Long> {
    public Person findByName(String name);
    public Person findByAge(int age);

    public void deleteAll();

    public  Person save(Person person);

    @Modifying
    @Transactional
    @Query("Update Person p SET p.age = :age WHERE p.id = :id")
    public int updateAgeById(@Param("id") Long id, @Param("age") int age);


}
