package kotlin_pattern.observer_pattern

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}
