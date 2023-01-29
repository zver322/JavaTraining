package AlishevCourse.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class lesson40 {
    // https://www.youtube.com/watch?v=9gw81XDJoKs&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=41

    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | IllegalAccessException e) { // multi catch
            throw new RuntimeException(e);
        }  catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void run() throws IOException, ParseException, IllegalAccessException {

    }
}
