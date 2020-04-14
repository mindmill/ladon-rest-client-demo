package org.example;

import de.mc.ladon.client.DocumentOrder;
import de.mc.ladon.client.LadonClient;

import java.util.UUID;

public class LadonClientDemo {


    public static void main(String[] args) {
        LadonClient ladon = LadonClient.connect("http://localhost:8080/", "P3jF0Xp88jhlATTKdFY6", "QKBvwOzaICXfgRoxfJkxU1LdAX18HeN8R9t42mFY");

        String bucket = UUID.randomUUID().toString();

        ladon.createBucket(bucket);

        ladon.createDocument(bucket, "test1.txt", "content".getBytes());

        System.out.println(ladon.listAllDocuments(bucket, "", DocumentOrder.created));

    }
}
