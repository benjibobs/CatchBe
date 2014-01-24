package benjibobs.cb;

import net.citizensnpcs.api.CitizensPlugin;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.mewin.WGCustomFlags.WGCustomFlagsPlugin;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.flags.IntegerFlag;
import com.sk89q.worldguard.protection.flags.StateFlag;

public class Main extends JavaPlugin{
	
	public StateFlag initC = new StateFlag("conquerable", false);
	public IntegerFlag npcid = new IntegerFlag("npcID");
	public ListenerMain lm = new ListenerMain(this);
	
	@Override
	public void onEnable() {
		getWGCustomFlags().addCustomFlag(initC);
		getWGCustomFlags().addCustomFlag(npcid);
		getServer().getPluginManager().registerEvents(lm, this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public WGCustomFlagsPlugin getWGCustomFlags()
	{
	  Plugin plugin = getServer().getPluginManager().getPlugin("WGCustomFlags");
	  
	  if (plugin == null || !(plugin instanceof WGCustomFlagsPlugin))
	  {
	    return null;
	  }

	  return (WGCustomFlagsPlugin) plugin;
	}
	
	public WorldGuardPlugin getWorldGuard()
	{
	  Plugin plugin = getServer().getPluginManager().getPlugin("WorldGuard");
	  
	  if (plugin == null || !(plugin instanceof WorldGuardPlugin))
	  {
	    return null;
	  }

	  return (WorldGuardPlugin) plugin;
	}
	
	public CitizensPlugin getCitizens()
	{
	  Plugin plugin = getServer().getPluginManager().getPlugin("Citizens");
	  
	  if (plugin == null || !(plugin instanceof CitizensPlugin))
	  {
	    return null;
	  }

	  return (CitizensPlugin) plugin;
	}

}
