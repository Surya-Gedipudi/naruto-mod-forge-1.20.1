package net.surya.narutomod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.surya.narutomod.NarutoMod;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NarutoMod.MOD_ID);

    public static final RegistryObject<Item> EYE_OF_KURAMA = ITEMS.register("eye_of_kurama",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RINNEGAN = ITEMS.register("rinnegan",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAKRA_CRYSTAL = ITEMS.register("chakra_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURE_CHAKRA = ITEMS.register("pure_chakra",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
