package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {

    public static String generateFileNameAndType(String prefix, String timeStamp, String fileType) {
        String fileName = prefix + timeStamp + fileType;
        return fileName;
    }
}
