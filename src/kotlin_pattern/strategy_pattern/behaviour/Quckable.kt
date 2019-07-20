package kotlin_pattern.strategy_pattern.behaviour

class Quckable : QuackBehaviour {
    override fun quack() {
        print("Quack ! Quack ! ")
    }
}