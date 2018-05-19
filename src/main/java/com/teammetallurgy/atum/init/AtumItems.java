package com.teammetallurgy.atum.init;

import com.teammetallurgy.atum.blocks.BlockAtumPlank;
import com.teammetallurgy.atum.items.*;
import com.teammetallurgy.atum.items.artifacts.*;
import com.teammetallurgy.atum.items.artifacts.atum.ItemAtumsBounty;
import com.teammetallurgy.atum.items.artifacts.atum.ItemBodyOfAtum;
import com.teammetallurgy.atum.items.artifacts.atum.ItemEyesOfAtum;
import com.teammetallurgy.atum.items.tools.*;
import com.teammetallurgy.atum.utils.Constants;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.teammetallurgy.atum.utils.AtumRegistry.registerItem;

@GameRegistry.ObjectHolder(value = Constants.MOD_ID)
public class AtumItems {
    //TODO Move ArmorMaterials to somewhere else
    private static final ArmorMaterial MUMMY_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("MUMMY", "mummy", 5, new int[]{2, 3, 2, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    private static final ArmorMaterial WANDERER_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("WANDERER", "wanderer", 10, new int[]{2, 3, 3, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    private static final ArmorMaterial DESERT_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("DESERT", "desert", 20, new int[]{3, 6, 5, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);

    public static final Item DIRTY_COIN = new ItemCoin();
    public static final Item GOLD_COIN = new ItemCoin();
    public static final Item SCRAP = new Item();
    public static final Item LINEN = new Item();
    public static final Item SCARAB = new ItemScarab();
    public static final Item FERTILE_SOIL_PILE = new Item();
    public static final Item DATE = new ItemFood(4, 0.3F, false);
    public static final Item GOLDEN_DATE = new ItemDateGold(5, 1.5F, false).setAlwaysEdible();
    public static final Item ENCHANTED_GOLDEN_DATE = new ItemDateGoldEnchanted(5, 1.5F, false).setAlwaysEdible();
    public static final Item SCIMITAR = new ItemSword(ToolMaterial.IRON);
    public static final Item GREATSWORD = new ItemGreatsword(ToolMaterial.IRON);
    public static final Item SHORT_BOW = new ItemBaseBow();
    public static final Item STONEGUARD_SWORD = new ItemSword(ToolMaterial.IRON);
    public static final Item SCEPTER = new ItemSword(ToolMaterial.GOLD);
    public static final Item PTAHS_DECADENCE = new ItemPtahsDecadence(ToolMaterial.DIAMOND);
    public static final Item SOBEKS_RAGE = new ItemSobeksRage(ToolMaterial.DIAMOND);
    public static final Item OSIRIS_WILL = new ItemOsirisWill(ToolMaterial.DIAMOND);
    public static final Item AKERS_TOIL = new ItemAkersToil(ToolMaterial.DIAMOND);
    public static final Item GEBS_BLESSING = new ItemGebsBlessing(ToolMaterial.DIAMOND);
    public static final Item ATENS_FURY = new ItemAtensFury();
    public static final Item EYES_OF_ATUM = new ItemEyesOfAtum();
    public static final Item BODY_OF_ATUM = new ItemBodyOfAtum();
    public static final Item NUTS_AGILITY = new ItemNutsAgility();
    public static final Item HORUS_FLIGHT = new ItemHorusFlight();
    public static final Item MONTHUS_STRIKE = new ItemMonthusStrike(ToolMaterial.DIAMOND);
    public static final Item ANHURS_MIGHT = new ItemAnhursMight(ToolMaterial.DIAMOND);
    public static final Item HEDETETS_STING = new ItemHedetetsSting(ToolMaterial.DIAMOND);
    public static final Item HORUS_SOARING = new ItemHorusSoaring();
    public static final Item SHUS_BREATH = new ItemShusBreath();
    public static final Item PTAHS_DESTRUCTION = new ItemPtahsDestruction(ToolMaterial.DIAMOND);
    public static final Item MONTHUS_BLAST = new ItemMonthusBlast();
    public static final Item NUS_FLUX = new ItemNusFlux(ToolMaterial.DIAMOND);
    public static final Item MNEVIS_HORNS = new ItemMnevisHorns(ArmorMaterial.DIAMOND, 0, EntityEquipmentSlot.HEAD).setTextureFile("ruby_artifact_armor_1");
    public static final Item ISIS_EMBRACE = new ItemIsisEmbrace(ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.CHEST).setTextureFile("ruby_artifact_armor_1");
    public static final Item MAATS_BALANCE = new ItemMaatsBalance(ArmorMaterial.DIAMOND, 2, EntityEquipmentSlot.LEGS).setTextureFile("ruby_artifact_armor_2");
    public static final Item HEDETETS_VENOM = new ItemHedetetsVenom();
    public static final Item GEBS_SOLIDARITY = new ItemGebsSolidarity(ArmorMaterial.DIAMOND, 3, EntityEquipmentSlot.FEET).setTextureFile("ruby_artifact_armor_1");
    public static final Item NUTS_CALL = new ItemNutsCall();
    public static final Item ATUMS_BOUNTY = new ItemAtumsBounty();
    public static final Item MAFDETS_QUICKNESS = new ItemMafdetsQuickness();
    public static final Item ISIS_HEALING = new ItemIsisHealing();
    public static final Item AMUNETS_HOMECOMING = new ItemAmunetsHomecoming();
    public static final Item ANUBIS_MERCY = new ItemAnubisMercy();
    public static final Item LIMESTONE_SHOVEL = new ItemLimestoneShovel(ToolMaterial.STONE);
    public static final Item LIMESTONE_PICKAXE = new ItemLimestonePickaxe(ToolMaterial.STONE);
    public static final Item LIMESTONE_AXE = new ItemLimestoneAxe(ToolMaterial.STONE);
    public static final Item LIMESTONE_SWORD = new ItemLimestoneSword(ToolMaterial.STONE);
    public static final Item LIMESTONE_HOE = new ItemLimestoneHoe(ToolMaterial.STONE);
    public static final Item MUMMY_HELMET = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setRepairItem(SCRAP).setTextureFile("mummy_armor_1");
    public static final Item MUMMY_CHEST = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setRepairItem(SCRAP).setTextureFile("mummy_armor_1");
    public static final Item MUMMY_LEGS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setRepairItem(SCRAP).setTextureFile("mummy_armor_2");
    public static final Item MUMMY_BOOTS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setRepairItem(SCRAP).setTextureFile("mummy_armor_1");
    public static final Item WANDERER_HELMET = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setRepairItem(LINEN).setTextureFile("wanderer_armor_1");
    public static final Item WANDERER_CHEST = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setRepairItem(LINEN).setTextureFile("wanderer_armor_1");
    public static final Item WANDERER_LEGS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setRepairItem(LINEN).setTextureFile("wanderer_armor_2");
    public static final Item WANDERER_BOOTS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setRepairItem(LINEN).setTextureFile("wanderer_armor_1");
    public static final Item DESERT_HELMET = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.HEAD).setRepairItem(Items.IRON_INGOT).setTextureFile("desert_armor_1");
    public static final Item DESERT_CHEST = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.CHEST).setRepairItem(Items.IRON_INGOT).setTextureFile("desert_armor_1");
    public static final Item DESERT_LEGS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.LEGS).setRepairItem(Items.IRON_INGOT).setTextureFile("desert_armor_2");
    public static final Item DESERT_BOOTS = new ItemTexturedArmor(MUMMY_ARMOR_MATERIAL, 0, EntityEquipmentSlot.FEET).setRepairItem(Items.IRON_INGOT).setTextureFile("desert_armor_1");
    public static final Item PAPYRUS_PLANT = new ItemBlockSpecial(AtumBlocks.PAPYRUS);
    public static final Item ECTOPLASM = new Item();
    public static final Item MANDIBLES = new Item();
    public static final Item DUSTY_BONE = new Item();
    public static final Item STONE_CHUNK = new Item();
    public static final Item SCROLL = new Item();
    public static final Item WOLF_PELT = new Item();
    public static final Item FLAX = new Item();
    public static final Item FLAX_SEED = new ItemSeeds(AtumBlocks.FLAX, Blocks.FARMLAND);
    public static final Item FORSAKEN_FISH = new ItemFish(ItemFish.FishType.FORSAKEN);
    public static final Item MUMMIFIED_FISH = new ItemFish(ItemFish.FishType.MUMMIFIED);
    public static final Item JEWELED_FISH = new ItemFish(ItemFish.FishType.JEWELED);
    public static final Item SKELETAL = new ItemFish(ItemFish.FishType.SKELETAL);
    public static final Item NEITHS_AUDACITY = new ItemNeithsAudacity();
    public static final Item DEADWOOD_BEETLE = new ItemDeadwoodBeetle();

    public static void registerItems() {
        BlockAtumPlank.registerSticks();
        registerItem(DIRTY_COIN, "coin_dirty");
        registerItem(GOLD_COIN, "coin_gold");
        ItemLoot.createLootItems();
        registerItem(SCRAP, "cloth_scrap");
        registerItem(LINEN, "linen");
        registerItem(SCARAB, "scarab");
        registerItem(DATE, "date");
        registerItem(GOLDEN_DATE, "golden_date");
        registerItem(ENCHANTED_GOLDEN_DATE, "golden_date_enchanted");
        registerItem(SCIMITAR, "scimitar");
        registerItem(GREATSWORD, "greatsword");
        registerItem(SHORT_BOW, "short_bow");
        registerItem(STONEGUARD_SWORD, "stoneguard_sword");
        registerItem(SCEPTER, "scepter");
        registerItem(PTAHS_DECADENCE, "ptahs_decadence");
        registerItem(SOBEKS_RAGE, "sobeks_rage");
        registerItem(OSIRIS_WILL, "osiris_will");
        registerItem(AKERS_TOIL, "akers_toil");
        registerItem(GEBS_BLESSING, "gebs_blessing");
        registerItem(ATENS_FURY, "atens_fury");
        registerItem(EYES_OF_ATUM, "eyes_of_atum");
        registerItem(BODY_OF_ATUM, "body_of_atum");
        registerItem(NUTS_AGILITY, "nuts_agility");
        registerItem(HORUS_FLIGHT, "horus_flight");
        registerItem(MONTHUS_STRIKE, "monthus_strike");
        registerItem(ANHURS_MIGHT, "anhurs_might");
        registerItem(HEDETETS_STING, "hedetets_sting");
        registerItem(HORUS_SOARING, "horus_soaring");
        registerItem(SHUS_BREATH, "shus_breath");
        registerItem(PTAHS_DESTRUCTION, "ptahs_destruction");
        registerItem(MONTHUS_BLAST, "monthus_blast");
        registerItem(NUS_FLUX, "nus_flux");
        registerItem(MNEVIS_HORNS, "mnevis_horns");
        registerItem(ISIS_EMBRACE, "isis_embrace");
        registerItem(MAATS_BALANCE, "maats_balance");
        registerItem(HEDETETS_VENOM, "hedetets_venom");
        registerItem(GEBS_SOLIDARITY, "gebs_solidarity");
        registerItem(NUTS_CALL, "nuts_call");
        registerItem(ATUMS_BOUNTY, "atums_bounty");
        registerItem(MAFDETS_QUICKNESS, "mafdets_quickness");
        registerItem(ISIS_HEALING, "isis_healing");
        registerItem(AMUNETS_HOMECOMING, "amunets_homecoming");
        registerItem(ANUBIS_MERCY, "anubis_mercy");
        registerItem(LIMESTONE_SHOVEL, "limestone_shovel");
        registerItem(LIMESTONE_PICKAXE, "limestone_pickaxe");
        registerItem(LIMESTONE_AXE, "limestone_axe");
        registerItem(LIMESTONE_SWORD, "limestone_sword");
        registerItem(LIMESTONE_HOE, "limestone_hoe");
        registerItem(MUMMY_HELMET, "mummy_helmet");
        registerItem(MUMMY_CHEST, "mummy_chest");
        registerItem(MUMMY_LEGS, "mummy_legs");
        registerItem(MUMMY_BOOTS, "mummy_boots");
        registerItem(WANDERER_HELMET, "wanderer_helmet");
        registerItem(WANDERER_CHEST, "wanderer_chest");
        registerItem(WANDERER_LEGS, "wanderer_legs");
        registerItem(WANDERER_BOOTS, "wanderer_boots");
        registerItem(DESERT_HELMET, "desert_helmet");
        registerItem(DESERT_CHEST, "desert_chest");
        registerItem(DESERT_LEGS, "desert_legs");
        registerItem(DESERT_BOOTS, "desert_boots");
        registerItem(PAPYRUS_PLANT, "papyrus_plant");
        registerItem(ECTOPLASM, "ectoplasm");
        registerItem(MANDIBLES, "mandibles");
        registerItem(DUSTY_BONE, "dusty_bone", "bone");
        registerItem(STONE_CHUNK, "stone_chunk");
        registerItem(SCROLL, "scroll");
        registerItem(WOLF_PELT, "wolf_pelt");
        registerItem(FERTILE_SOIL_PILE, "fertile_soil_pile");
        registerItem(FLAX, "flax");
        registerItem(FLAX_SEED, "flax_seeds");
        registerItem(FORSAKEN_FISH, "fish_forsaken");
        registerItem(MUMMIFIED_FISH, "fish_mummified");
        registerItem(JEWELED_FISH, "fish_jeweled");
        registerItem(SKELETAL, "fish_skeletal");
        registerItem(NEITHS_AUDACITY, "neiths_audacity");
        registerItem(DEADWOOD_BEETLE, "deadwood_beetle");
    }
}