package com.unfamoussoul.sapi.api.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import org.bukkit.command.Command;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Абстрактный класс для создания команд
 */
public abstract class DynamicCommand extends Command {

    protected DynamicCommand(String name, @NotNull LiteralArgumentBuilder<CommandSourceStack> builderSupplier, String... aliases) {
        super(name, "Dynamic module command", "/" + name, List.of(aliases));
    }
}