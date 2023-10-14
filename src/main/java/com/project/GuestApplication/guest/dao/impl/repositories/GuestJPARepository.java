package com.project.GuestApplication.guest.dao.impl.repositories;

import com.project.GuestApplication.guest.dao.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestJPARepository extends JpaRepository<Guest, Integer> {


}
