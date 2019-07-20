package kotlin_pattern.strategy_pattern.ducks

import kotlin_pattern.strategy_pattern.behaviour.FlyBehaviour
import kotlin_pattern.strategy_pattern.behaviour.QuackBehaviour

abstract class BaseDuck constructor(val flyBehaviour: FlyBehaviour,val quackBehaviour: QuackBehaviour) {




    fun performFly() {
        flyBehaviour.fly()
    }

    fun performQuack() {
        quackBehaviour.quack()
    }

    abstract fun display()


}