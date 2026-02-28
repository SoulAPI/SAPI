package com.unfamoussoul.sapi.api.event;

import com.unfamoussoul.sapi.module.SAPIModule;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Ивент разгрузки модуля
 */
@SuppressWarnings("unused")
public class ModuleDisableEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final SAPIModule module;

    public ModuleDisableEvent(@NotNull SAPIModule module) {
        this.module = module;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public SAPIModule getModule() {
        return module;
    }
}