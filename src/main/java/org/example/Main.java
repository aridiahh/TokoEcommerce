package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost", 5069), 0);

        httpServer.createContext("/", new Server()); // Inisialisasi dengan UserHandler

        httpServer.setExecutor(Executors.newSingleThreadExecutor());
        httpServer.start();
    }
}