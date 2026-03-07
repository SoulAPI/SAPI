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

    /**
     * Зарегистрировать команду в системе Brigadier. Вызывается при добавлении команды в модуль.
     * Пример:
     * <pre><code>
     *     public TestCommand() {
     *         super("test");
     *         register(test());
     *     }
     *
     *     private LiteralArgumentBuilder<CommandSourceStack> test() {
     *         return Commands.literal("test")
     *                 .executes(context -> {
     *                     CommandSender sender = context.getSource().getSender();
     *                     sender.sendRichMessage(sender.getName());
     *                     return 1;
     *                 });
     *     }
     * </code></pre>
     * @param builderSupplier - поставщик билдеров для Brigadier
     */
    protected native void register(@NotNull LiteralArgumentBuilder<CommandSourceStack> builderSupplier);
}