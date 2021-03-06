package view;

import com.sun.net.httpserver.HttpExchange;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void render(HttpExchange t) throws IOException {
        File file = new File("template/main.html").getCanonicalFile();

        OutputStream os = t.getResponseBody();
        FileInputStream fs = new FileInputStream(file);
        final byte[] buffer = new byte[0x10000];
        int count = 0;
        while ((count = fs.read(buffer)) >= 0) {
            os.write(buffer, 0, count);
        }
        fs.close();
        //os.close();
    }
}
