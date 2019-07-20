package kotlin_pattern.strategy_pattern.ducks

import kotlin_pattern.strategy_pattern.behaviour.FlyNoWay
import kotlin_pattern.strategy_pattern.behaviour.FlyWithRocket
import kotlin_pattern.strategy_pattern.behaviour.QuackNoWay
import kotlin_pattern.strategy_pattern.behaviour.Quckable


fun main(string: Array<String>) {
    val rocketDuck = RocketDuck(FlyWithRocket(), QuackNoWay())
    rocketDuck.display()

    val modelDuck = ModelDuck(FlyNoWay(), Quckable())
    modelDuck.display()

}