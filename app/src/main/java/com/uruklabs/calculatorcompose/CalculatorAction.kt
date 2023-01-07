package com.uruklabs.calculatorcompose

sealed class CalculatorAction {
    data class Number(val number: Int) : CalculatorAction()
    object Clear : CalculatorAction()
    object Delete : CalculatorAction()
    object Decimal : CalculatorAction()
    object Calculete : CalculatorAction()
    data class Operation(val calculatorOperation: CalculatorOperation) : CalculatorAction()
}