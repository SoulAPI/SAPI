package com.unfamoussoul.sapi.module;

import java.util.Map;

public abstract class ModuleAPI {
    
    public abstract Object call(String method, Map<String, Object> args);

    public native <T> T call(String method, Class<T> returnType, Map<String, Object> args);
}