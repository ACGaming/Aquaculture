package rebelkeithy.mods.aquaculture;

import rebelkeithy.mods.aquaculture.block.AquacultureBlock;
import rebelkeithy.mods.aquaculture.block.gui.AquacultureGuiHandler;
import rebelkeithy.mods.aquaculture.enchantments.AquacultureEnchants;
import rebelkeithy.mods.aquaculture.items.AquacultureItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = Aquaculture.MOD_ID, name = Aquaculture.MOD_NAME, version = Aquaculture.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Aquaculture {
	public final static String MOD_ID = "Aquaculture";
	public final static String MOD_NAME = "Aquaculture";
	public final static String MOD_VERSION = "1.2.3";

	@Instance(MOD_ID)
	public static Aquaculture instance;

	@SidedProxy(clientSide = "rebelkeithy.mods.aquaculture.ClientProxy", serverSide = "rebelkeithy.mods.aquaculture.CommonProxy")
	public static CommonProxy proxy;
	public static AquacultureTab tab;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Config.INSTANCE.init(event.getSuggestedConfigurationFile());
		tab = new AquacultureTab("Aquaculture");

		AquacultureItems.INSTANCE.register();
		AquacultureBlock.INSTANCE.register();
		NetworkRegistry.instance().registerGuiHandler(this, new AquacultureGuiHandler());
		proxy.registerModelRenderers();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

		AquacultureRecipes.INSTANCE.addRecipes();

		EntityRegistry.registerGlobalEntityID(EntityCustomFishHook.class, "CustomFishHook", 174);
		AquacultureEnchants.init();

		tab.setItemID(AquacultureItems.ironFishingRod.itemID);

		proxy.registerModelRenderers();
	}
}
