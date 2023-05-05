package com.likedancesport.common.dto.preview;

import com.likedancesport.common.model.domain.learning.Lecturer;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LecturerPreview {
    private final long id;
    private final String name;
    private final String avatarS3Key;

    public static LecturerPreview of(Lecturer lecturer) {
        return LecturerPreview.builder()
                .id(lecturer.getId())
                .name(lecturer.getName())
                .build();
    }
}
