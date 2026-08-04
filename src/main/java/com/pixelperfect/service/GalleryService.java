package com.pixelperfect.service;

import java.util.List;

import com.pixelperfect.entity.Gallery;

public interface GalleryService {

    Gallery saveGallery(Gallery gallery);

    List<Gallery> getAllGallery();

    Gallery getGalleryById(Long imageId);

    Gallery updateGallery(Gallery gallery);

    void deleteGallery(Long imageId);

}