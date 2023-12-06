package adventofcode.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {

    public static List<String> fileContentAsString(String path) throws IOException {
        ClassLoader cl = IOUtils.class.getClassLoader();
        return fileContentAsString(new File(cl.getResource(path).getFile()));
    }

    private static List<String> fileContentAsString(File file) throws IOException {
        List<String> fileInput = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        copyFileInputToString(reader, fileInput);
        return fileInput;
    }

    private static void copyFileInputToString(BufferedReader source, List<String> target) throws IOException {
        String line;
        while ((line = source.readLine()) != null)
            target.add(line);
        source.close();
    }
}
