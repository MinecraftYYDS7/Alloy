package top.friendcraft.game.alloy.common.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public enum VanillaMaterials {
    IRON_INGOT(Items.IRON_INGOT),
    GOLD_INGOT(Items.GOLD_INGOT),
    COAL(Items.COAL),
    DIAMOND(Items.DIAMOND),
    EMERALD(Items.EMERALD),
    COPPER_INGOT(Items.COPPER_INGOT),
    NETHERITE_INGOT(Items.NETHERITE_INGOT),
    LAPIS_LAZULI(Items.LAPIS_LAZULI),
    REDSTONE(Items.REDSTONE),
    OBSIDIAN(Items.OBSIDIAN),
    CRYING_OBSIDIAN(Items.CRYING_OBSIDIAN),
    GLOWSTONE_DUST(Items.GLOWSTONE_DUST),
    BLAZE_POWDER(Items.BLAZE_POWDER),
    FUEL_BLAZE_ROD(Items.BLAZE_ROD, 2, 1500),
    FUEL_COAL(Items.COAL, 1, 800);
    private final AlloyMaterial material;
    private final FuelMaterial fuel;

    VanillaMaterials(Item metals) {
        this.material = AlloyMaterial.getFromValina(metals);
        this.fuel = null;
    }

    VanillaMaterials(Item metals, int level, int temprature) {
        this.material = null;
        this.fuel = AlloyMaterial.getFromValina(metals, level, temprature);
    }

    public AlloyMaterial get() {
        if (material == null) {
            return fuel;
        }
        return material;
    }
}
