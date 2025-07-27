package com.filecompressor.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.*;
import java.util.zip.*;
import java.util.*;

@RestController
@CrossOrigin(origins = "*") // Allow frontend calls
public class FileCompressorController {

    static class CompressionResult {
        public byte[] compressedFile;
        public long originalSize;
        public long compressedSize;

        public CompressionResult(byte[] compressedFile, long originalSize, long compressedSize) {
            this.compressedFile = compressedFile;
            this.originalSize = originalSize;
            this.compressedSize = compressedSize;
        }
    }

    @PostMapping("/compress")
    public ResponseEntity<Map<String, Object>> compressFiles(@RequestParam("files") MultipartFile[] files) throws IOException {
        File zipFile = File.createTempFile("compressed-", ".zip");

        long originalSize = 0;

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile))) {
            for (MultipartFile file : files) {
                originalSize += file.getSize(); // Sum original file sizes

                ZipEntry zipEntry = new ZipEntry(file.getOriginalFilename());
                zos.putNextEntry(zipEntry);
                zos.write(file.getBytes());
                zos.closeEntry();
            }
        }

        byte[] zipBytes = Files.readAllBytes(zipFile.toPath());
        long compressedSize = zipBytes.length;

        // Prepare response body
        Map<String, Object> response = new HashMap<>();
        response.put("originalSize", originalSize);
        response.put("compressedSize", compressedSize);
        response.put("compressedFile", Base64.getEncoder().encodeToString(zipBytes)); // Send base64 encoded file to frontend

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }
}
