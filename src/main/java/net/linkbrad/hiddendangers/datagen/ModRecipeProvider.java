package net.linkbrad.hiddendangers.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.linkbrad.hiddendangers.block.ModBlocks;
import net.linkbrad.hiddendangers.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static List<ItemConvertible> GENERAL_SMELTABLES = List.of(ModItems.POLLUTIONSCANNER
            );

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {



        offerSmelting(recipeExporter, GENERAL_SMELTABLES, RecipeCategory.MISC, ModItems.POLLUTIONSCANNER,
                0.7f, 200 , "plastic");
        offerBlasting(recipeExporter, GENERAL_SMELTABLES, RecipeCategory.MISC, ModItems.POLLUTIONSCANNER,
                0.7f, 100 , "plastic");





        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PLASTICSHEET, RecipeCategory.MISC,
                ModBlocks.PLASTICBLOCK);



        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.POLLUTIONSCANNER,1)
                .pattern(" # ")
                .pattern("@P@")
                .pattern("S#S")
                .input('S', Items.STICK)
                .input('#',ModBlocks.TARBLOCK)
                .input('@',Items.GLASS)
                .input('P',Items.GLASS_BOTTLE)
                .criterion(hasItem(ModBlocks.TARBLOCK),conditionsFromItem(ModBlocks.TARBLOCK))
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .offerTo(recipeExporter, Identifier.of(getRecipeName(ModItems.POLLUTIONSCANNER)));




    }
}
