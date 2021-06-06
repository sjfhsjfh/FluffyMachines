package io.ncbpfluffybear.fluffymachines.machines;

import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AutoMagicWorkbench extends AutoCrafter {

    public AutoMagicWorkbench(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&6全自动魔法工作台", Material.BOOKSHELF, "&6只能合成魔法工作台", RecipeType.MAGIC_WORKBENCH);
    }
}
