package com.sboard.controller;

import com.sboard.service.FileService;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/file/download/{fno}")
    public ResponseEntity<Resource> fileDownload(@PathVariable("fno") int fno) {

        log.info(fno);

        return fileService.downloadFile(fno);

    }
}
