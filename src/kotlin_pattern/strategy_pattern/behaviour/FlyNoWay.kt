package kotlin_pattern.strategy_pattern.behaviour

class FlyNoWay : FlyBehaviour {
    override fun fly() {
         print("Oh I don't have wings ")
    }
}