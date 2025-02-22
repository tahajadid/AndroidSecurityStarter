# Keep all public classes and methods in your package
-keep class com.tahadeta.androidsecuritystarter.** { *; }

# Remove debugging information
-dontusemixedcaseclassnames
-dontpreverify
-dontobfuscate
-optimizationpasses 5
-allowaccessmodification
-renamesourcefileattribute SourceFile

# Keep annotation-related classes
-keepattributes *Annotation*

# Keep native methods (if using JNI/NDK)
-keepclasseswithmembernames class * {
    native <methods>;
}

# Keep all Parcelable implementations
-keep class * implements android.os.Parcelable { *; }

# Keep Serializable classes
-keep class * implements java.io.Serializable { *; }

# Keep the SecureWording class but obfuscate its methods
-keep class com.tahadeta.androidsecuritystarter.util.SecureWording {
    public <init>();
}

# Remove or inline sensitive method
-assumenosideeffects class com.tahadeta.androidsecuritystarter.util.SecureWording {
    public java.lang.String getSecretWord();
}