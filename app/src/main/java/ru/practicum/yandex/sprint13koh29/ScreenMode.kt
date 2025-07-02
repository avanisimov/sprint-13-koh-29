package ru.practicum.yandex.sprint13koh29

import androidx.annotation.StringRes

enum class ScreenMode {
    CATALOG, CART
}

val ScreenMode.titleResId: Int
    @StringRes
    get() {
        return when (this) {
            ScreenMode.CATALOG -> R.string.catalog_title
            ScreenMode.CART -> R.string.cart_title
        }
    }
