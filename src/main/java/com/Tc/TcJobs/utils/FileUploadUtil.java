package com.Tc.TcJobs.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUploadUtil {
    public static void saveFile(String uploadDir, String fileName, MultipartFile multipartFile)throws IOException {
        Path uploadDirPath = Paths.get(uploadDir);
        if (!Files.exists(uploadDirPath)) {
            Files.createDirectories(uploadDirPath);
        }

        try(InputStream inputStream = multipartFile.getInputStream()){
            Path path = uploadDirPath.resolve(fileName);
            System.out.println("FilePath " + path);
            System.out.println("fileName " + fileName);
            Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);
        } catch(IOException e) {
            throw new IOException("Could not save file " + fileName, e);
        }
    }
}
