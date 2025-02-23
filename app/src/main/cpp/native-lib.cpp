//
// Created by Taha JADID on 22/2/2025.
//

#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_tahadeta_androidsecuritystarter_util_NativeLibWrapper_getApiKey(JNIEnv *env,jobject th) {
    std::string apiKey = "MY_API_KEY";
    return env->NewStringUTF(apiKey.c_str());
}