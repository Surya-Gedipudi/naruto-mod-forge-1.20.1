package net.surya.narutomod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.surya.narutomod.NarutoMod;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NarutoMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NARUTO_TAB = CREATIVE_MODE_TABS.register("naruto_mods_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EYE_OF_KURAMA.get()))
                    .title(Component.translatable("creativetab.naruto_mods_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.EYE_OF_KURAMA.get());
                        pOutput.accept(ModItems.SASUKE_KATANA.get());


                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
