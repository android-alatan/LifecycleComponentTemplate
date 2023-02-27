package io.androidalatan.lifecycle.template.foobar.sub.bar

import androidx.compose.runtime.Composable
import io.androidalatan.compose.holder.ComposableHolder
import io.androidalatan.compose.holder.di.ComposableHolderComponent
import javax.inject.Inject

class Bar(componentBuilder: ComposableHolderComponent.Builder<*>) :
    ComposableHolder(componentBuilder) {
    @Inject
    lateinit var barViewModel: BarViewModel

    @Composable
    override fun render() = BarUi.Content()
}