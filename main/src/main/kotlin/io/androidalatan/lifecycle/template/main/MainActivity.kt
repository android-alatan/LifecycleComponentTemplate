package io.androidalatan.lifecycle.template.main

import androidx.compose.runtime.Composable
import io.androidalatan.lifecycle.handler.compose.activity.ComposeLifecycleDaggerActivity
import javax.inject.Inject

class MainActivity : ComposeLifecycleDaggerActivity() {
    @Inject
    lateinit var viewModel: MainActivityViewModel

    @Composable
    override fun contentView() = MainActivityUi.Content()
}