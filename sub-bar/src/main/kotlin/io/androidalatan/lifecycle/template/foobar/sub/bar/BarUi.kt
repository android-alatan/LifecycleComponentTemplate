package io.androidalatan.lifecycle.template.foobar.sub.bar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import io.androidalatan.lifecycle.handler.compose.util.lifecycleViewModel

object BarUi {
    @Composable
    fun Content(barViewModel: BarViewModel = lifecycleViewModel()) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val text by barViewModel.text.observeAsState("")
            Text(text = text)
        }

    }
}