package com.company.learning.java.features.nio;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Set;

public class FileAttributes {

    public static void main(String argv[]) {
        // Retrieves the default file system
        FileSystem fileSystem = FileSystems.getDefault();
        Set<String> fileSystemViews = fileSystem.supportedFileAttributeViews();

        // We iterate over the available file attribute views
        // of a file system
        for (String fileSystemView : fileSystemViews) {
            System.out.println(fileSystemView);
        }
    }
}