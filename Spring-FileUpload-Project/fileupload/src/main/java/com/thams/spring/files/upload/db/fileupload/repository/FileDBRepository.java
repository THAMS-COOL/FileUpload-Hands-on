package com.thams.spring.files.upload.db.fileupload.repository;

import com.thams.spring.files.upload.db.fileupload.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
