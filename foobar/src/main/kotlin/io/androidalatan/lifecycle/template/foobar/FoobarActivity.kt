package io.androidalatan.lifecycle.template.foobar

import androidx.compose.runtime.Composable
import io.androidalatan.lifecycle.handler.compose.activity.ComposeLifecycleDaggerActivity
import io.androidalatan.lifecycle.template.foobar.sub.bar.Bar
import io.androidalatan.lifecycle.template.foobar.sub.foo.Foo
import javax.inject.Inject

class FoobarActivity: ComposeLifecycleDaggerActivity() {
    @Inject
    lateinit var foo: Foo

    @Inject
    lateinit var bar: Bar
    @Composable
    override fun contentView() = FoobarActivityUi.Content(foo, bar)
}