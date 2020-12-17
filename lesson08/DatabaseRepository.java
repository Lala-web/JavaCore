package ru.geekbrains.lesson08;

import ru.geekbrains.lesson08.entity.WeatherData;
import ru.geekbrains.lesson08.dto.WeatherResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

// Репозиторий для работы
public interface DatabaseRepository {

    boolean saveWeatherData(WeatherData weatherData) throws SQLException;

    List<WeatherData> getAllSavedData() throws IOException;
}
