package com.chargerwallet.app.wallet.widget

import com.facebook.react.uimanager.ViewManager
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.chargerwallet.app.wallet.viewManager.homePage.HomePageManager
import com.chargerwallet.app.wallet.selectedLabel.SelectedLabelViewManager

class TabViewPackage : ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> =
        emptyList()

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> =
        listOf(
            HomePageManager(),
            SelectedLabelViewManager()
        )
}
