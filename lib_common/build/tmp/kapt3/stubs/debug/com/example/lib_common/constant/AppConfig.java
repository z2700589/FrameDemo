package com.example.lib_common.constant;

import java.lang.System;

/**
 * * 其中的 moduleApps 是一个静态的 String 数组，我们将需要初始化的组件的 Application 的完整类名放入到这个数组中
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/example/lib_common/constant/AppConfig;", "", "()V", "ModuleGank", "", "ModuleMap", "ModuleSearch", "ModuleShare", "ModuleUserCenter", "moduleApps", "", "getModuleApps", "()[Ljava/lang/String;", "setModuleApps", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "lib_common_debug"})
public final class AppConfig {
    private static final java.lang.String ModuleGank = "com.longyi.module_gank.GankApplication";
    private static final java.lang.String ModuleMap = "com.longyi.module_map.MapApplication";
    private static final java.lang.String ModuleSearch = "com.longyi.module_search.SearchMainApplication";
    private static final java.lang.String ModuleShare = "com.longyi.module_share.ShareApplication";
    private static final java.lang.String ModuleUserCenter = "com.longyi.module_usercenter.UserApplication";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String[] moduleApps;
    public static final com.example.lib_common.constant.AppConfig INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getModuleApps() {
        return null;
    }
    
    public final void setModuleApps(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    private AppConfig() {
        super();
    }
}