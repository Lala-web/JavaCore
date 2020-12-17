package ru.geekbrains.lesson08;

import ru.geekbrains.lesson08.entity.WeatherData;
import ru.geekbrains.lesson08.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}