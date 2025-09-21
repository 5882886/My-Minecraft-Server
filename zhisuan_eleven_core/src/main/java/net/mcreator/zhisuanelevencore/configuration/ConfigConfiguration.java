package net.mcreator.zhisuanelevencore.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<String> TITLE;
	public static final ForgeConfigSpec.ConfigValue<Boolean> TELEPORT;
	static {
		TITLE = BUILDER.comment("The words on display when players join in the world ").define("WelcomeTitle", "Welcome to the world");
		TELEPORT = BUILDER.comment("Use teleport command").define("TeleportCommand", true);

		SPEC = BUILDER.build();
	}

}
