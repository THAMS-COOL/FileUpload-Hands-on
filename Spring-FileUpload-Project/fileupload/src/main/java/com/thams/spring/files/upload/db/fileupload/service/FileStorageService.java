package com.thams.spring.files.upload.db.fileupload.service;

import com.thams.spring.files.upload.db.fileupload.model.FileDB;
import com.thams.spring.files.upload.db.fileupload.repository.FileDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Service
public class FileStorageService {

    @Autowired
    private FileDBRepository fileDBRepository;

    public FileDB store(MultipartFile file) throws IOException {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        FileDB fileDB = new FileDB(filename,file.getContentType(),file.getBytes());
        return fileDBRepository.save(fileDB);
    }

    public FileDB getFile(String id) {
        return fileDBRepository.findById(id).get();
    }

    public Stream<FileDB> getAllFiles(){
        return fileDBRepository.findAll().stream();
    }






}
