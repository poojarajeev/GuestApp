package com.project.GuestApplication.guest.dao.impl.repositories;

import com.project.GuestApplication.guest.dao.entity.FileDet;
import com.project.GuestApplication.guest.dao.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileJPARepository extends JpaRepository<FileDet, Integer> {
}
