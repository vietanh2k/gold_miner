package com.example;

import com.example.websocket.WebSocketServer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello World!" );
        new WebSocketServer(8080).run();
    }
}
