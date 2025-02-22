package com.tahadeta.androidsecuritystarter.util

import android.os.Build
import java.io.File

object RootDetectionUtil {
    /**
     * function that check a couple of extension if exist in the rootFiles
     */
    fun isRootedFilesExist(): Boolean {
        val rootFiles = arrayOf(
            "/system/xbin/su",
            "/system/bin/su",
            "/system/app/Superuser.apk",
            "/system/sbin/su",
            "/sbin/su",
            "/vendor/bin/su",
        )

        for (path in rootFiles) {
            if (File(path).exists()) {
                return true
            }
        }
        return false
    }

    /**
     * function that check the test-keys in buildTags
     */
    fun isTestKeysExist(): Boolean {
        val buildTags = Build.TAGS
        return buildTags != null && buildTags.contains("test-keys")
    }

    /**
     * function that assemble result of the above checks
     */
    fun checkRootedPhone() : Boolean{
        return isRootedFilesExist() && isTestKeysExist()
    }
}