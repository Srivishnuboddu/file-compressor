package com.filecompressor.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.nio.file.*;
import java.util.zip.*;

@RestController
@CrossOrigin(origins = "*") // Allow frontend calls
public class FileCompressorController {

   @PostMapping("/compress")
public ResponseEntity<byte[]> compressFiles(@RequestParam("files") MultipartFile[] files) throws IOException {
    File zipFile = File.createTempFile("compressed-", ".zip");

    try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile))) {
        for (MultipartFile file : files) {
            ZipEntry zipEntry = new ZipEntry(file.getOriginalFilename());
            zos.putNextEntry(zipEntry);
            zos.write(file.getBytes());
            zos.closeEntry();
        }
    }

    byte[] zipBytes = Files.readAllBytes(zipFile.toPath());

    return ResponseEntity.ok()
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=compressed.zip")
            .contentType(MediaType.APPLICATION_OCTET_STREAM)
            .body(zipBytes);
}

}

