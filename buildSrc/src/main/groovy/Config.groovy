class Config {

    static applicationId = 'com.example.framedemo'
    static appName = 'FrameDemo'
    static compileSdkVersion = 28
    static buildToolsVersion = '28.0.0'
    static minSdkVersion = 21
    static targetSdkVersion = 28
    static versionCode = 2
    static versionName = '1.0.1'


    static version = [
        androidSupportSdkVersion: "28.0.0",
        kotlinSdkVersion        : "1.3.31",
        junit                   : "4.12",
        testrunner              : "1.0.2",
        espressoSdkVersion      : "3.0.2",
        dagger2SdkVersion       : "2.19",
        constraintlayoutVersion : "1.1.3",
        arouter_api             : "1.4.1",
        arouter_compiler        : "1.2.2",
        retrofit2               : "2.6.0",
        okhttp3                 : "4.0.0",
        logging                 : "4.0.0",
        logger                  : "2.2.0",
        PersistentCookieJar     : "v1.0.1",
        rxjava2                 : "2.2.10",
        rxandroid               : "2.1.1",
        glide                   : "4.9.0",
        photo_view              : "2.3.0",
        picker_view             : "4.1.8",
        event_bus               : "3.1.1",
        statusbarutil           : "1.5.1",
        swipebacklayout         : "1.2.0",
        bottom_navigation_bar   : "2.1.0",
        easypermissions         : "3.0.0",
        BasePopup               : "2.2.1",
        BRVAH                   : "2.9.30",
        bugly                   : "latest.release",
        banner                  : "1.4.10",
        agentweb                : "4.0.3-beta",
        number_progress         : "1.4@aar",
        nav_version             : "2.1.0",
        room_version            : "2.2.0-rc01",
        paging_version          : "2.1.1",
        lifecycle_version       : "2.1.0",

    ]


    static dependencies = [
        //support
        "appcompat-v7"             : 'androidx.appcompat:appcompat:1.0.0',
        "kotlin"                   : "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${version["kotlinSdkVersion"]}",
        "design"                   : "com.android.support:design:${version["androidSupportSdkVersion"]}",
        "support-v4"               : "com.android.support:support-v4:${version["androidSupportSdkVersion"]}",
        "cardview-v7"              : "com.android.support:cardview-v7:${version["androidSupportSdkVersion"]}",
        "annotations"              : "com.android.support:support-annotations:${version["androidSupportSdkVersion"]}",
        "junit"                    : "junit:junit:${version["junit"]}",
        "testrunner"               : 'androidx.test:runner:1.1.0',
        "espresso"                 : 'androidx.test.espresso:espresso-core:3.1.0',
        "constraintlayout"         : 'androidx.constraintlayout:constraintlayout:1.1.3',
        "recyclerview-v7"          : "com.android.support:recyclerview-v7:${version["androidSupportSdkVersion"]}",
        "arouter-api"              : "com.alibaba:arouter-api:${version["arouter_api"]}",
        "arouter-compiler"         : "com.alibaba:arouter-compiler:${version["arouter_compiler"]}",
        "retrofit2"                : "com.squareup.retrofit2:retrofit:${version["retrofit2"]}",
        "converter_gson"           : "com.squareup.retrofit2:converter-gson:${version["retrofit2"]}",
        "okhttp3"                  : "com.squareup.okhttp3:okhttp:${version["okhttp3"]}",
        "logging-interceptor"      : "com.squareup.okhttp3:logging-interceptor:${version["logging"]}",
        "logger"                   : "com.orhanobut:logger:${version["logger"]}",
        "PersistentCookieJar"      : "com.github.franmontiel:PersistentCookieJar:${version["PersistentCookieJar"]}",
        "rxjava2"                  : "io.reactivex.rxjava2:rxjava:${version["rxjava2"]}",
        "adapter-rxjava2"          : "com.squareup.retrofit2:adapter-rxjava2:${version["retrofit2"]}",
        "rxandroid"                : "io.reactivex.rxjava2:rxandroid:${version["rxandroid"]}",
        "glide"                    : "com.github.bumptech.glide:glide:${version["glide"]}",
        "glide_compiler"           : "com.github.bumptech.glide:compiler:${version["glide"]}",
        "photo_view"               : "com.github.chrisbanes:PhotoView:${version["photo_view"]}",
        "picker_view"              : "com.contrarywind:Android-PickerView:${version["picker_view"]}",
        "event_bus"                : "org.greenrobot:eventbus:${version["event_bus"]}",
        "statusbarutil"            : "com.jaeger.statusbarutil:library:${version["statusbarutil"]}",
        "swipebacklayout"          : "cn.bingoogolapple:bga-swipebacklayout:${version["swipebacklayout"]}@aar",
        "bottom_navigation_bar"    : "com.ashokvarma.android:bottom-navigation-bar:${version["bottom_navigation_bar"]}",
        "easypermissions"          : "pub.devrel:easypermissions:${version["easypermissions"]}",
        "BasePopup"                : "com.github.razerdp:BasePopup:${version["BasePopup"]}",
        "BRVAH"                    : "com.github.CymChad:BaseRecyclerViewAdapterHelper:${version["BRVAH"]}",
        "crashreport_upgrade"      : "com.tencent.bugly:crashreport_upgrade:${version["bugly"]}",
        "nativecrashreport"        : "com.tencent.bugly:nativecrashreport:${version["bugly"]}",
        "banner"                   : "com.youth.banner:banner:${version["banner"]}",
        "agentweb"                 : "com.just.agentweb:agentweb:${version["agentweb"]}",
        "number_progress"          : "com.daimajia.numberprogressbar:library:${version["number_progress"]}",
        "room"                     : "androidx.room:room-runtime:${version.room_version}",
        "room_compiler"            : "androidx.room:room-compiler:${version.room_version}",
        "paging_runtime_ktx"       : "androidx.paging:paging-runtime-ktx:${version.paging_version}",
        "lifecycle"                : "androidx.lifecycle:lifecycle-extensions:${version.lifecycle_version}",
        "navigation_fragment"      : "androidx.navigation:navigation-fragment-ktx:${version.nav_version}",
        "navigation_ui"            : "androidx.navigation:navigation-ui-ktx:${version.nav_version}"
    ]

}