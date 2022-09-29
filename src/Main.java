import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {


    /**
     * Each client has to know about the server,
     * the server has to know about all the clients
     *
     * 1. How to establish the initial connection between the client and server
     * 2. How to receive messages from the server
     * 3. How to send messages to the server
     *
     */

    // connection is a relationship between two machines, where two
    // pieces of software know about each other

    // to make a connection you need to know IP address and TCP port number

    /*SocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);
    // same as new InetSocketAddress ("localhost", 5000);

    SocketChannel socketChannel = SocketChannel.open(serverAddress);
    // same as SocketChannel socketChannel2 = SocketChannel.open(new InetSocketAddress("196.164.1.103", 5000));

    Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);

    BufferedReader bufferedReader = new BufferedReader(reader);
    String message = bufferedReader.readLine();

    SocketAddress serverAddr = new InetSocketAddress("localhost", 5000);

    SocketChannel socketChanl = SocketChannel.open(serverAddr);

    Writer writer = Channels.newWriter(socketChanl, StandardCharsets.UTF_8);

    PrintWriter printWriter = new PrintWriter(writer);
    writer.println("message to send");
    writer.print("another message");*/

    /**
     * To get work with multiple actions in the same, you can use separate threads
     */

    // multithreading in Java



        // multiple threading in Java means we have to look at both the threads
        // and the job that's run by the thread

        // a Thread object represents a thread of execution

        // a thread is a separate "thread of execution", a separate call stack
        // a Thread is a Java class that represents a thread
        // Using the Thread class is not the only wat to do multithreading in Java

        // to make a job for your thread, implement the Runnable interface

        MyRunnable test = new MyRunnable();

        Thread myThread = new Thread(test);

        myThread.start();
        System.out.println(Thread.currentThread().getName() + ": back in main");
        Thread.dumpStack();

        /**
         * interface ExecutorService
         * or
         * class Executor
         */

        // old-fashioned way is to create new Threads
        // and modern way is to use ExecutorService that can handle new threads by itself

        /**
         * Do not base your program's correctness on the scheduler working in a particular way!
         */

        // If you need to synchronize some threads
        // you can use CountDownLatch - it is a barrier synchronizer.
        // it allows threads to coordinate with each other.
        // Other examples are CyclicBarrier and Phaser

        /**
         * ExecutorService has two shutdown methods
         *
         * 1. ExecutorService.shutdown()
         * normal way to close pool
         * all threads can finish their jobs
         * you can use awaitTermination
         *
         * 2. ExecutorService.shutdownNow()
         * force all threads to stop running
         * jobs completion aren't allowed
         */

        


    }

}
