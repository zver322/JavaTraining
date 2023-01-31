package AlishevCourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class lesson44 {
    // https://www.youtube.com/watch?v=nmxeAO7CYVg&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=45
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);


        pw.println("Hello world");
        pw.close();
    }
}
