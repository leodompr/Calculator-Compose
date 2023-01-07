package com.uruklabs.calculatorcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.uruklabs.calculatorcompose.ui.theme.CalculatorComposeTheme
import com.uruklabs.calculatorcompose.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorComposeTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val butonSpacing = 8.dp
                Calculator(
                    state = state,
                    onAction = viewModel::onAction,
                    modifieer = Modifier
                        .fillMaxSize()
                        .background(MediumGray)
                        .padding(16.dp)
                )
            }
        }
    }
}

