package ru.geekbrains.lesson07;

import ru.geekbrains.lesson07.enums.Periods;
import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException;

}