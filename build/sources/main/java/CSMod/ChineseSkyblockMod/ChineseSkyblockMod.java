package CSMod.ChineseSkyblockMod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ChineseSkyblockMod.MODID, version = ChineseSkyblockMod.VERSION)
public class ChineseSkyblockMod
{
    public static final String MODID = "ChineseSkyblockMod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
