package com.uruklabs.calculatorcompose

sealed class CalculatorOperation(val symbol : String) {
    object Add: CalculatorOperation("+")
    object Multiply: CalculatorOperation("*")
    object Subtract: CalculatorOperation("-")
    object Divider: CalculatorOperation("/")
}
