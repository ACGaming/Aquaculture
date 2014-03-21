package rebelkeithy.mods.aquaculture.items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import rebelkeithy.mods.aquaculture.Aquaculture;
import rebelkeithy.mods.aquaculture.BiomeType;
import rebelkeithy.mods.aquaculture.Config;
import rebelkeithy.mods.aquaculture.FishLoot;
import rebelkeithy.mods.aquaculture.items.meta.SubItem;
import rebelkeithy.mods.aquaculture.items.meta.SubItemFood;
import cpw.mods.fml.common.registry.GameRegistry;

public enum AquacultureItems {
	INSTANCE;

	public static final Item ironFishingRod = new ItemAquacultureFishingRod(Config.ironRodID, 75, 14, "Iron").setTextureName("aquaculture:IronFishingRod").setUnlocalizedName("IronFishingRod").setCreativeTab(Aquaculture.tab);
	public static final Item goldFishingRod = new ItemAquacultureFishingRod(Config.goldRodID, 50, 22, "Gold").setTextureName("aquaculture:GoldFishingRod").setUnlocalizedName("GoldFishingRod").setCreativeTab(Aquaculture.tab);
	public static final Item diamondFishingRod = new ItemAquacultureFishingRod(Config.diamondRodID, 250, 10, "Diamond").setTextureName("aquaculture:DiamondFishingRod").setUnlocalizedName("DiamondFishingRod").setCreativeTab(Aquaculture.tab);
	public static final Item adminFishingRod = new ItemAdminFishingRod(Config.adminRodID, 75).setTextureName("AdminFishingRod").setUnlocalizedName("AdminFishingRod").setCreativeTab(Aquaculture.tab);

	public static final SubItem seaweed = new SubItemFood(Config.lootID, 2, 0, false).setUnlocalizedName("Seaweed").setTextureName("aquaculture:Seaweed").setCreativeTab(Aquaculture.tab);
	public static final SubItem algae = new SubItemFood(Config.lootID, 2, 0, false).setUnlocalizedName("Algae").setTextureName("aquaculture:Algae").setCreativeTab(Aquaculture.tab);

	// Food
	public static final SubItem whaleSteak = new SubItem(Config.lootID).setUnlocalizedName("RawWhaleSteak").setTextureName("aquaculture:RawWhaleSteak").setCreativeTab(Aquaculture.tab);
	public static final SubItem fishFillet = new SubItemFood(Config.lootID, 2, 0.3F, false).setUnlocalizedName("RawFishFillet").setTextureName("aquaculture:RawFishFillet").setCreativeTab(Aquaculture.tab);
	public static final SubItem cookedFillet = new SubItemFood(Config.lootID, 5, 0.6F, false).setUnlocalizedName("CookedFishFillet").setTextureName("aquaculture:CookedFishFillet").setCreativeTab(Aquaculture.tab);
	public static final SubItem cookedWhaleSteak = new SubItemFood(Config.lootID, 10, 0.8F, false).setUnlocalizedName("CookedWhaleSteak").setTextureName("aquaculture:CookedWhaleSteak").setCreativeTab(Aquaculture.tab);
	public static final SubItem whaleBurger = new SubItemFood(Config.lootID, 20, 0.8F, false).setUnlocalizedName("Whaleburger").setTextureName("aquaculture:Whaleburger").setCreativeTab(Aquaculture.tab);
	public static final SubItem frogLegs = new SubItem(Config.lootID).setUnlocalizedName("FrogLegs").setTextureName("aquaculture:FrogLegs").setCreativeTab(Aquaculture.tab);
	public static final SubItem cookedFrogLegs = new SubItemFood(Config.lootID, 3, 0.6F, false).setUnlocalizedName("CookedFrogLegs").setTextureName("aquaculture:CookedFrogLegs").setCreativeTab(Aquaculture.tab);
	public static final SubItem turtleSoup = new SubItemFood(Config.lootID, 6, 0.6F, false).setUnlocalizedName("TurtleSoup").setTextureName("aquaculture:TurtleSoup").setCreativeTab(Aquaculture.tab);
	public static final SubItem sushi = new SubItemFood(Config.lootID, 4, 0.6F, false).setUnlocalizedName("Sushi").setTextureName("aquaculture:Sushi").setCreativeTab(Aquaculture.tab);

	public static final SubItem driftwood = new SubItem(Config.lootID).setUnlocalizedName("Driftwood").setTextureName("aquaculture:Driftwood").setCreativeTab(Aquaculture.tab);
	public static final SubItem neptuniumBar = new SubItem(Config.lootID).setUnlocalizedName("NeptuniumIngot").setTextureName("aquaculture:NeptuniumIngot").setCreativeTab(Aquaculture.tab);
	public static final SubItem tinCan = new SubItem(Config.lootID).setUnlocalizedName("TinCan").setTextureName("aquaculture:TinCan").setCreativeTab(Aquaculture.tab);
	public static final SubItem nessageInABottle = new ItemMessageInABottle(Config.lootID).setUnlocalizedName("MessageInABottle").setTextureName("aquaculture:MessageInABottle").setCreativeTab(Aquaculture.tab);
	public static final SubItem box = new ItemBox(Config.lootID).setUnlocalizedName("Box").setTextureName("aquaculture:Box").setCreativeTab(Aquaculture.tab);
	public static final SubItem lockbox = new ItemLockbox(Config.lootID).setUnlocalizedName("Lockbox").setTextureName("aquaculture:Lockbox").setCreativeTab(Aquaculture.tab);
	public static final SubItem treasureChest = new ItemTreasureChest(Config.lootID).setUnlocalizedName("TreasureChest").setTextureName("aquaculture:TreasureChest").setCreativeTab(Aquaculture.tab);
	public static final SubItem neptunesBounty = new ItemNeptunesBounty(Config.lootID).setUnlocalizedName("NeptunesBounty").setTextureName("aquaculture:NeptunesBounty").setCreativeTab(Aquaculture.tab);

	private static EnumToolMaterial neptuniumEnum = EnumHelper.addToolMaterial("Neptunium", 3, 2500, 9F, 6F, 15);

	public static final Item neptuniumPickaxe = new AquaItemPickaxe(Config.neptuniumPickaxeID, neptuniumEnum).setUnlocalizedName("NeptuniumPickaxe").setCreativeTab(Aquaculture.tab);
	public static final Item neptuniumShovel = new AquaItemSpade(Config.neptuniumShovelID, neptuniumEnum).setUnlocalizedName("NeptuniumShovel").setCreativeTab(Aquaculture.tab);
	public static final Item neptuniumAxe = new AquaItemAxe(Config.neptuniumAxeID, neptuniumEnum).setUnlocalizedName("NeptuniumAxe").setCreativeTab(Aquaculture.tab);
	public static final Item neptuniumHoe = new AquaItemHoe(Config.neptuniumHoeID, neptuniumEnum).setUnlocalizedName("NeptuniumHoe").setCreativeTab(Aquaculture.tab);
	public static final Item neptuniumSword = new AquaItemSword(Config.neptuniumSwordID, neptuniumEnum).setUnlocalizedName("NeptuniumSword").setCreativeTab(Aquaculture.tab);

	private static EnumArmorMaterial neptuniumArmorEnum = EnumHelper.addArmorMaterial("Neptunium", 75, new int[]{3, 8, 6, 3}, 15);

	public static final Item neptuniumHelmet = new NeptuniumArmor(Config.neptuniumHelmetID, neptuniumArmorEnum, 0, 0).setArmorTexture("Neptunium_1").setUnlocalizedName("NeptuniumHelmet").setCreativeTab(Aquaculture.tab);
	public static final Item neptuniumPlate = new NeptuniumArmor(Config.neptuniumPlateID, neptuniumArmorEnum, 1, 1).setArmorTexture("Neptunium_1").setUnlocalizedName("NeptuniumPlate").setCreativeTab(Aquaculture.tab);
	public static final Item neptuniumLegs = new NeptuniumArmor(Config.neptuniumLegsID, neptuniumArmorEnum, 2, 2).setArmorTexture("Neptunium_2").setUnlocalizedName("NeptuniumLegs").setCreativeTab(Aquaculture.tab);
	public static final Item neptuniumBoots = new NeptuniumArmor(Config.neptuniumBootsID, neptuniumArmorEnum, 3, 3).setArmorTexture("Neptunium_1").setUnlocalizedName("NeptuniumBoots").setCreativeTab(Aquaculture.tab);

	public static final ItemFish fish = (ItemFish) new ItemFish(Config.fishID).setUnlocalizedName("Fish").setCreativeTab(Aquaculture.tab);

	public void register() {
		register(ironFishingRod);
		register(goldFishingRod);
		register(diamondFishingRod);
		register(adminFishingRod);

		register(seaweed);
		register(algae);

		// Food
		register(whaleSteak);
		register(fishFillet);
		register(cookedFillet);
		register(cookedWhaleSteak);
		register(whaleBurger);
		register(frogLegs);
		register(cookedFrogLegs);
		register(turtleSoup);
		register(sushi);

		register(driftwood);
		register(neptuniumBar);
		register(tinCan);
		register(nessageInABottle);
		register(box);
		register(lockbox);
		register(treasureChest);
		register(neptunesBounty);

		register(neptuniumPickaxe);
		register(neptuniumShovel);
		register(neptuniumAxe);
		register(neptuniumHoe);
		register(neptuniumSword);

		register(neptuniumHelmet);
		register(neptuniumPlate);
		register(neptuniumLegs);
		register(neptuniumBoots);

		register(fish);

		// Adds fish to

		// Freshwater
		fish.addFish("Bluegill", 1, 1, 5, BiomeType.freshwater, 1);
		fish.addFish("Perch", 1, 1, 5, BiomeType.freshwater, 1);
		fish.addFish("Gar", 2, 1, 10, BiomeType.freshwater, 1);
		fish.addFish("Bass", 3, 1, 25, BiomeType.freshwater, 1);
		fish.addFish("Muskellunge", 3, 1, 35, BiomeType.freshwater, 1);
		fish.addFish("Brown Trout", 3, 1, 40, BiomeType.freshwater, 1);
		fish.addFish("Catfish", 4, 1, 50, BiomeType.freshwater, 1);
		fish.addFish("Carp", 5, 1, 100, BiomeType.freshwater, 1);

		// Saltwater
		fish.addFish("Blowfish", 3, 1, 25, BiomeType.saltwater, 1);
		fish.addFish("Red Grouper", 4, 1, 50, BiomeType.saltwater, 1);
		fish.addFish("Salmon", 5, 1, 100, BiomeType.saltwater, 1);
		fish.addFish("Tuna", 5, 1, 135, BiomeType.saltwater, 1);
		fish.addFish("Swordfish", 7, 1, 1400, BiomeType.saltwater, 1);
		fish.addFish("Shark", 8, 1, 5000, BiomeType.saltwater, 1);
		fish.addFish("Whale", 0, 1, 190000, BiomeType.saltwater, 1);
		fish.addFish("Squid", 0, 1, 1000, BiomeType.saltwater, 1);
		fish.addFish("Jellyfish", 0, 1, 500, BiomeType.saltwater, 1);

		// Brackish
		fish.addFish("Frog", 0, 1, 1, BiomeType.brackish, 1);
		fish.addFish("Turtle", 0, 1, 5, BiomeType.brackish, 1);
		fish.addFish("Leech", 0, 1, 1, BiomeType.brackish, 1);

		// Jungle
		fish.addFish("Pirahna", 1, 1, 8, BiomeType.tropical, 1);
		fish.addFish("Electric Eel", 3, 1, 45, BiomeType.tropical, 1);
		fish.addFish("Tambaqui", 4, 1, 75, BiomeType.tropical, 1);
		fish.addFish("Arapaima", 6, 1, 220, BiomeType.tropical, 1);

		// Tundra
		fish.addFish("Cod", 6, 1, 210, BiomeType.arctic, 1);
		fish.addFish("Pollock", 3, 1, 45, BiomeType.arctic, 1);
		fish.addFish("Herring", 1, 1, 3, BiomeType.arctic, 1);
		fish.addFish("Halibut", 7, 1, 700, BiomeType.arctic, 1);
		fish.addFish("Pink Salmon", 5, 1, 100, BiomeType.arctic, 1);
		fish.addFish("Rainbow Trout", 4, 1, 50, BiomeType.arctic, 1);
		fish.addFish("Blackfish", 2, 1, 10, BiomeType.arctic, 1);

		// Desert
		fish.addFish("Capitaine", 4, 1, 450, BiomeType.arid, 1);
		fish.addFish("Boulti", 2, 1, 10, BiomeType.arid, 1);
		fish.addFish("Bagrid", 3, 1, 25, BiomeType.arid, 1);
		fish.addFish("Syndontis", 1, 1, 3, BiomeType.arid, 1);

		// Mushroom Island
		fish.addFish("Red Shrooma", 0, 1, 5, BiomeType.mushroom, 1);
		fish.addFish("Brown Shrooma", 0, 1, 5, BiomeType.mushroom, 1);

		fish.addFish("Goldfish", 0, 1, 4, new BiomeType[]{}, 1);
		fish.addFish("Fish Bones", 0, 1, 1, new BiomeType[]{}, 1);

		FishLoot.instance().addJunkLoot(seaweed.getItemStack(), BiomeType.saltwater, 25);
		FishLoot.instance().addJunkLoot(algae.getItemStack(), new BiomeType[]{BiomeType.arctic, BiomeType.arid, BiomeType.brackish, BiomeType.freshwater, BiomeType.mushroom, BiomeType.tropical}, 25);
		FishLoot.instance().addJunkLoot(driftwood.getItemStack(), 25);
		FishLoot.instance().addJunkLoot(tinCan.getItemStack(), 30);
		FishLoot.instance().addJunkLoot(box.getItemStack(), 25);
		FishLoot.instance().addJunkLoot(lockbox.getItemStack(), 23);
		FishLoot.instance().addJunkLoot(treasureChest.getItemStack(), 10);
		FishLoot.instance().addJunkLoot(new ItemStack(Item.stick), 20);
		FishLoot.instance().addJunkLoot(new ItemStack(Item.bone), 20);
		FishLoot.instance().addJunkLoot(new ItemStack(Item.bootsLeather), 20);
		FishLoot.instance().addJunkLoot(new ItemStack(Item.appleRed), 20);
		FishLoot.instance().addJunkLoot(fish.getItemStackFish("Goldfish"), 10);
		FishLoot.instance().addJunkLoot(nessageInABottle.getItemStack(), 23);
		FishLoot.instance().addJunkLoot(neptunesBounty.getItemStack(), 1);

		OreDictionary.registerOre("listAllfishraw", fishFillet.getItemStack());
		OreDictionary.registerOre("listAllfishcooked", cookedFillet.getItemStack());
		OreDictionary.registerOre("cropSeaweed", seaweed.getItemStack());
	}

	public void register(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName());
		this.name(item, item.getUnlocalizedName());
	}

	public void register(SubItem item) {
		GameRegistry.registerItem(item.item, item.unlocalizedName);
		this.name(item.item, item.unlocalizedName);
	}

	private void name(Item item, String tag) {
		if(!tag.contains("item.")) {
			tag = "item." + tag;
		}
	}
}
