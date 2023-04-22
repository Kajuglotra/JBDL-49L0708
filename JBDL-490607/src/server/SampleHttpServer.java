package server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SampleHttpServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8080) , 2);
        server.createContext("/hello", new HelloHandler());
        //blocking queue -> 5
        server.setExecutor(Executors.newFixedThreadPool(5));
        server.start();
    }
}
