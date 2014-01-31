package benjibobs.cb;

import java.util.Timer;

import com.sk89q.worldguard.protection.ApplicableRegionSet;

public class CapTimer {

	private Timer capTimer;
	private Main plugin;
	
	public void startCap(ApplicableRegionSet regset){
		this.capTimer = new Timer();
		
		capTimer.schedule(arg0, (long)regset.getFlag(plugin.capTime));
	}
	
}
