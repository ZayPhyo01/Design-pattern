package kotlin_pattern.observer_pattern

class StaticDisplay(subject: Subject) : Observer, DisplayElement {
    var tempature = 0.0.toFloat()
    init {
        subject.registerObserver(this)
    }

    override fun update(tempature: Float, humidity: Float, pressure: Float) {
        this.tempature = tempature
        display()
    }

    override fun display() {
        println("StaticDisplay temp $tempature")
    }
}