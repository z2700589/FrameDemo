package com.example.lib_common.constant;

import java.lang.System;

/**
 * * 路由中心
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u000b"}, d2 = {"Lcom/example/lib_common/constant/RouterPath;", "", "()V", "AndroidJetPack", "Gank", "Map", "Search", "Share", "Todo", "UserCenter", "Web", "lib_common_debug"})
public final class RouterPath {
    public static final com.example.lib_common.constant.RouterPath INSTANCE = null;
    
    private RouterPath() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/lib_common/constant/RouterPath$UserCenter;", "", "()V", "COLLECT", "", "LOGIN", "REGISTER", "lib_common_debug"})
    public static final class UserCenter {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LOGIN = "/user_center/login";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REGISTER = "/user_center/register";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COLLECT = "/user_center/collect";
        public static final com.example.lib_common.constant.RouterPath.UserCenter INSTANCE = null;
        
        private UserCenter() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/lib_common/constant/RouterPath$Share;", "", "()V", "SHARE_APP", "", "SHARE_NATIVE", "lib_common_debug"})
    public static final class Share {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHARE_APP = "/share/app";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SHARE_NATIVE = "/share/native";
        public static final com.example.lib_common.constant.RouterPath.Share INSTANCE = null;
        
        private Share() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/lib_common/constant/RouterPath$Map;", "", "()V", "MAP_APP", "", "lib_common_debug"})
    public static final class Map {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MAP_APP = "/map/app";
        public static final com.example.lib_common.constant.RouterPath.Map INSTANCE = null;
        
        private Map() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/lib_common/constant/RouterPath$Gank;", "", "()V", "GANK_PHOTO", "", "GANK_PHOTO_DETAIL", "lib_common_debug"})
    public static final class Gank {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GANK_PHOTO = "/gank/photo";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GANK_PHOTO_DETAIL = "/gank/photo_detail";
        public static final com.example.lib_common.constant.RouterPath.Gank INSTANCE = null;
        
        private Gank() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/lib_common/constant/RouterPath$Todo;", "", "()V", "TODO_DETAIL", "", "TODO_PUBLISH", "lib_common_debug"})
    public static final class Todo {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TODO_PUBLISH = "/todo/publish";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TODO_DETAIL = "/todo/detail";
        public static final com.example.lib_common.constant.RouterPath.Todo INSTANCE = null;
        
        private Todo() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/lib_common/constant/RouterPath$Web;", "", "()V", "WEB_DETAIL", "", "lib_common_debug"})
    public static final class Web {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WEB_DETAIL = "/web/detail";
        public static final com.example.lib_common.constant.RouterPath.Web INSTANCE = null;
        
        private Web() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/lib_common/constant/RouterPath$Search;", "", "()V", "SEARCH_HOME", "", "lib_common_debug"})
    public static final class Search {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SEARCH_HOME = "/search/home";
        public static final com.example.lib_common.constant.RouterPath.Search INSTANCE = null;
        
        private Search() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/lib_common/constant/RouterPath$AndroidJetPack;", "", "()V", "CUSTOM_TAB", "", "JETPACK_HOME_DEMO", "WECHAT", "lib_common_debug"})
    public static final class AndroidJetPack {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String JETPACK_HOME_DEMO = "/jetpack/home_demo";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CUSTOM_TAB = "/jetpack/custom_tab";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WECHAT = "/jetpack/wecaht";
        public static final com.example.lib_common.constant.RouterPath.AndroidJetPack INSTANCE = null;
        
        private AndroidJetPack() {
            super();
        }
    }
}