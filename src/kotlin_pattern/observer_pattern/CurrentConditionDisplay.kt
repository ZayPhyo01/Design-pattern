package kotlin_pattern.observer_pattern


class CurrentConditionDisplay( weatherData: Subject) : Observer, DisplayElement {
     var temperature: Float = 0.toFloat()
    var humidity: Float = 0.toFloat()

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current Conditions : $temperature F degrees and $humidity% humidity")
    }
}
