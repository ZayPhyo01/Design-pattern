package kotlin_pattern.strategy_pattern.ducks

import kotlin_pattern.strategy_pattern.behaviour.FlyBehaviour
import kotlin_pattern.strategy_pattern.behaviour.QuackBehaviour

class ModelDuck(flyBehaviour: FlyBehaviour, quackBehaviour: QuackBehaviour) : BaseDuck(flyBehaviour, quackBehaviour) {
    override fun display() {
        print(performFly())
        println(performQuack())
    }
}