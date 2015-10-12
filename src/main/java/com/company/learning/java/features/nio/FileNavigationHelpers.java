package com.company.learning.java.features.nio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author mohanarao_sv
 *
 */
public class FileNavigationHelpers {

    public static void main(final String[] args) {
        // Make a reference to a File
        Path src = Paths.get("/home/fred/readme.txt");
        Path dst = Paths.get("/home/fred/copy_readme.txt");
        // Make a reference to a path
        Path src1 = Paths.get("/home/fredSRC/");
        Path dst1 = Paths.get("/home/fredDST/");
        // Navigation /home/fredSRC -> /home/fredSRC/tmp
        Path tmpPath = src.resolve("tmp");
        // Create a relative path from src -> ..
        Path relativePath = tmpPath.relativize(src);
        // Convert to old File Format for your legacy apps
        File file = src.toFile();

    }
}
