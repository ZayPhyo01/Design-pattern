package kotlin_pattern.observer_pattern


class WeatherData : Subject {
    val observers: ArrayList<Observer>
    var temperature: Float = 0.toFloat()
    var humidity: Float = 0.toFloat()
    var pressure: Float = 0.toFloat()

    init {
        observers = ArrayList<Observer>()
    }

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val i = observers.indexOf(o)
        if (i >= 0) {
            observers.removeAt(i)
        }
    }

    override fun notifyObservers() {
        for (i in observers.indices) {
            val observer = observers[i]
            observer.update(temperature, humidity, pressure)
        }
    }

    fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}
