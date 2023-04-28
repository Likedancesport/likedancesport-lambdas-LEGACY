package com.likedancesport.service;

import com.likedancesport.common.model.domain.impl.Lecturer;
import com.likedancesport.request.LecturerUpdateRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ILecturerService {
    List<Lecturer> findAll();

    Page<Lecturer> findAllPaginated(Pageable pageable);

    Lecturer getLecturer(Long lecturerId);

    Lecturer createLecturer(Lecturer lecturer);

    Lecturer updateLecturer(Long lecturerId, LecturerUpdateRequest updateRequest);

    void delete(Long lecturerId);
}
