package com.pixelperfect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixelperfect.entity.Gallery;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long> {

}