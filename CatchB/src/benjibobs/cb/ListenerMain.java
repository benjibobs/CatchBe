package benjibobs.cb;

import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.api.npc.NPCRegistry;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.massivecraft.factions.entity.UPlayer;
import com.massivecraft.factions.entity.UPlayerColls;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;

public class ListenerMain implements Listener{

	private Main plugin;
	
	private static int check = 0;
	
	public ListenerMain(Main instance){
		plugin = instance;
	}
	
	@EventHandler
	public void regCheck(PlayerMoveEvent event){
		UPlayer fp = UPlayer.get(event.getPlayer());
		if(fp.getFactionId() != null && fp.getDefaultFactionId() != fp.getFactionId()){
		if(check < System.currentTimeMillis()){
		check = (int)System.currentTimeMillis() + 5000;
		Player player = event.getPlayer();
		
		ApplicableRegionSet regionset = plugin.getWorldGuard().getRegionManager(player.getWorld()).getApplicableRegions(player.getLocation());
		
		NPC reg = plugin.getCitizens().getNPCRegistry().getById(regionset.getFlag(plugin.npcid).intValue());
		
		if(regionset != null && regionset.allows(plugin.initC)){
			
		}
	}
	}
	}
	
}
