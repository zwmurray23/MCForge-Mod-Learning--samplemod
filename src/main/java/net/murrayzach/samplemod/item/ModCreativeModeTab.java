package net.murrayzach.samplemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab SAMPLE_TAB = new CreativeModeTab("sample_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_SILICON.get());
        }


    };


}
