package com.unfamoussoul.sapi.api.event;

import com.unfamoussoul.sapi.module.SAPIModule;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Ивент загрузки модуля
 */
public class ModuleEnableEvent extends Event implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();
    private final SAPIModule module;
    private boolean cancelled;

    public ModuleEnableEvent(@NotNull SAPIModule module) {
        this.module = module;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public SAPIModule getModule() {
        return module;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}