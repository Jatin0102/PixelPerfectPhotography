package com.pixelperfect.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pixelperfect.entity.Gallery;
import com.pixelperfect.exception.ResourceNotFoundException;
import com.pixelperfect.repository.GalleryRepository;
import com.pixelperfect.service.GalleryService;

@Service
public class GalleryServiceImpl implements GalleryService {

    @Autowired
    private GalleryRepository galleryRepository;

    @Override
    public Gallery saveGallery(Gallery gallery) {
        return galleryRepository.save(gallery);
    }

    @Override
    public List<Gallery> getAllGallery() {
        return galleryRepository.findAll();
    }

    @Override
    public Gallery getGalleryById(Long imageId) {
        return galleryRepository.findById(imageId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Gallery image not found with id : " + imageId));
    }

    @Override
    public Gallery updateGallery(Gallery gallery) {
        return galleryRepository.save(gallery);
    }

    @Override
    public void deleteGallery(Long imageId) {
        galleryRepository.deleteById(imageId);
    }

}