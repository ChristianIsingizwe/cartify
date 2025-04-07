package com.projects.cartify.services.images;

import com.projects.cartify.dto.ImageDto;
import com.projects.cartify.models.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void deleteImageById(Long id);
    void updateImage(MultipartFile file, Long productId);

}
