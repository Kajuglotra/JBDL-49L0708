package server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String data = "Hello From :" +Thread.currentThread().getName();
        exchange.sendResponseHeaders(200, data.length());
        OutputStream outputStream= exchange.getResponseBody();
        outputStream.write(data.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
