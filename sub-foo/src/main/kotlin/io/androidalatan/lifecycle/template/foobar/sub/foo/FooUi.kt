package io.androidalatan.lifecycle.template.foobar.sub.foo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import io.androidalatan.component.view.compose.api.view.onClick
import io.androidalatan.lifecycle.handler.compose.activity.localowners.LocalComposeEventTriggerOwner
import io.androidalatan.lifecycle.handler.compose.util.lifecycleViewModel

object FooUi {
    @Composable
    fun Content(fooViewModel: FooViewModel = lifecycleViewModel()) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val text by fooViewModel.text.observeAsState(initial = "")
            Text(text = text)
        }

    }
}