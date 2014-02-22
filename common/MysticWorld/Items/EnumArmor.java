package mysticworld.items;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class EnumArmor
{
	static ItemArmor.ArmorMaterial Verdite = EnumHelper.addArmorMaterial("Verdite", 262, new int[]{2, 5, 4, 1}, 5);
	static ItemArmor.ArmorMaterial Mithril = EnumHelper.addArmorMaterial("Mithril", 500, new int[]{2, 7, 6, 2}, 9);
	static ItemArmor.ArmorMaterial Adamantine = EnumHelper.addArmorMaterial("Adamantine", 3000, new int[]{4, 9, 6, 4}, 13);
	static ItemArmor.ArmorMaterial Iridium = EnumHelper.addArmorMaterial("Iridium", 4000, new int[]{4, 10, 7, 5}, 15);
}
