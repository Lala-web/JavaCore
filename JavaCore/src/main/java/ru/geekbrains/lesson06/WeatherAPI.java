package ru.geekbrains.lesson06;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class WeatherAPI {
    public static void main(String[] args) throws
            IOException {

        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?id=498817&appid=6d0f2b551d0aabffe0f0575879a26296");
        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while (in.hasNext()) {
            result = in.nextLine();
        }
        System.out.println(result);
    }
}