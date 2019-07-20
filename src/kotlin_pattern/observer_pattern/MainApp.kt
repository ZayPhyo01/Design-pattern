package kotlin_pattern.observer_pattern


fun main(args: Array<String>) {
    val weatherData = WeatherData()
    val currentConditionsDisplay = CurrentConditionDisplay(weatherData)
    currentConditionsDisplay.update(1.22.toFloat(), 2.toFloat(), 3.toFloat())

    val staticDisplay = StaticDisplay(weatherData)
    weatherData.setMeasurements(121.toFloat(), 12.toFloat(), 12.toFloat())
    weatherData.removeObserver(currentConditionsDisplay)
    weatherData.setMeasurements(40.1.toFloat(), 11.toFloat(), 10.toFloat())
    weatherData.registerObserver(currentConditionsDisplay)
    weatherData.setMeasurements(1000f,1000f,1000f)




}