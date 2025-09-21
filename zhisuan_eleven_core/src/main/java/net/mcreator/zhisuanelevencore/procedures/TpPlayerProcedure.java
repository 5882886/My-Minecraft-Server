package net.mcreator.zhisuanelevencore.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.zhisuanelevencore.configuration.ConfigConfiguration;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class TpPlayerProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		Entity dest_player = null;
		Entity src_player = null;
		if (ConfigConfiguration.TELEPORT.get() == true) {
			src_player = new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "src");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity();
			dest_player = new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "dest");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity();
			{
				Entity _ent = src_player;
				_ent.teleportTo((dest_player.getX()), (dest_player.getY()), (dest_player.getZ()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((dest_player.getX()), (dest_player.getY()), (dest_player.getZ()), _ent.getYRot(), _ent.getXRot());
			}
			if (src_player instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\n" + "\u6B63\u5728\u4F20\u9001\u2026\u2026")), true);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Command not enable"), false);
		}
	}
}
