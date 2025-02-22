package com.tahadeta.androidsecuritystarter.util


object NativeLibWrapper {
    init {
        System.loadLibrary("androidsecuritystarter")
    }
    external fun getApiKey(): String
}