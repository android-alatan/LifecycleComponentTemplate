package io.androidalatan.lifecycle.template.foobar.sub.foo

import androidx.compose.runtime.Composable
import io.androidalatan.compose.holder.ComposableHolder
import io.androidalatan.compose.holder.di.ComposableHolderComponent
import javax.inject.Inject

class Foo(
    componentBuilder: ComposableHolderComponent.Builder<*>
) : ComposableHolder(componentBuilder) {

    @Inject
    lateinit var viewModel: FooViewModel

    @Composable
    override fun render() = FooUi.Content()
}