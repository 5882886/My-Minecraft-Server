package net.mcreator.zhisuanelevencore.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;

import java.util.ArrayList;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SpawnPointProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		String str = "";
		str = StringArgumentType.getString(arguments, "str");
		if ((str).equals("set")) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator instanceof ServerPlayer _serverPlayer)
					_serverPlayer.setRespawnPosition(_serverPlayer.level().dimension(), BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), _serverPlayer.getYRot(), true, false);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u5DF2\u8BBE\u7F6E\u5168\u5C40\u51FA\u751F\u70B9"), false);
		}
		if ((str).equals("tp")) {
			{
				Entity _ent = entity;
				_ent.teleportTo((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn()), _ent.getYRot(), _ent.getXRot());
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u5DF2\u4F20\u9001\u5230\u5F53\u524D\u4E16\u754C\u51FA\u751F\u70B9"), false);
		}
	}
}
