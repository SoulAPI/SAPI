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
public abstract class DynamicCommand extends Command {

    @SuppressWarnings("Unused")
    protected DynamicCommand(String name, @NotNull LiteralArgumentBuilder<CommandSourceStack> builderSupplier, String... aliases) {
        super(name, "Dynamic module command", "/" + name, List.of(aliases));
    }

    @Override
    public boolean execute(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String @NotNull [] strings) {
        return executeCommand(commandSender, s, strings);
    }

    protected native boolean executeCommand(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String @NotNull [] strings);

}