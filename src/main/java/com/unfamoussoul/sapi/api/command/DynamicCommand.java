package com.unfamoussoul.sapi.api.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Абстрактный класс для создания команд
 */
@SuppressWarnings("unused")
public abstract class DynamicCommand extends Command {

    protected DynamicCommand(String name, String... aliases) {
        super(name, "Dynamic module command", "/" + name, List.of(aliases));
    }

    @Override
    public boolean execute(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String @NotNull [] strings) {
        return false;
    }

    protected native void register(@NotNull LiteralArgumentBuilder<CommandSourceStack> builderSupplier);
}