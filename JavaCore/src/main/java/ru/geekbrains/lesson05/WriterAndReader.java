package ru.geekbrains.lesson05;


import java.io.*;

public class WriterAndReader {
    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("demo.txt"))) {
            {
                writer.write("Value1; Value2; Value3\n" +
                        "100; 200; 123");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("demo.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

