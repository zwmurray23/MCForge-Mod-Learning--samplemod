package net.murrayzach.samplemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.murrayzach.samplemod.SampleMod;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SampleMod.MOD_ID);

    public static final RegistryObject<Item> SILICON_WAFER = ITEMS.register("silicon_wafer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SAMPLE_TAB)));
            //() -> new SiliconWaferItem(new Item.Properties().group(SampleMod.ITEM_GROUP)))

    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SAMPLE_TAB)));

    public static final RegistryObject<Item> PCB = ITEMS.register("pcb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SAMPLE_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
