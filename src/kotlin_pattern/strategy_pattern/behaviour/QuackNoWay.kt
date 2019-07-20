package kotlin_pattern.strategy_pattern.behaviour

class QuackNoWay : QuackBehaviour{
    override fun quack() {
        print("Oh I dont know how to quack  ")
    }
}