package net.theelementguy.moremetals.loot;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;

public class AddItemRollModifier extends LootModifier {

    public static final MapCodec<AddItemRollModifier> CODEC = RecordCodecBuilder.mapCodec(addItemModifierInstance -> LootModifier.codecStart(addItemModifierInstance).and(BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(e -> e.item)).and(Codec.FLOAT.fieldOf("chance").forGetter(e -> e.chance)).apply(addItemModifierInstance, AddItemRollModifier::new));

    private final Item item;

    private final float chance;

    public AddItemRollModifier(LootItemCondition[] conditionsIn, Item item, float chance) {
        super(conditionsIn);
        this.item = item;
        this.chance = chance;
    }

    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> objectArrayList, LootContext lootContext) {
        for (LootItemCondition lootItemCondition : this.conditions) {
            if (!lootItemCondition.test(lootContext)) {
                return objectArrayList;
            }
        }
        RandomSource randomSource = lootContext.getRandom();
        float randInt = randomSource.nextFloat();
        System.out.println(randInt);
        if (randInt > chance) {
            return objectArrayList;
        }
        objectArrayList.clear();
        objectArrayList.add(new ItemStack(this.item));
        return objectArrayList;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}
