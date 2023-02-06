package xyz.tangledwires.controversial;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Controversial extends JavaPlugin {
	@Override
    public void onEnable() {
		Bukkit.getServer().getLogger().info("Loaded Controversial by xWires.");
		Bukkit.getServer().getLogger().info("Found an bug? Open an issue at https://github.com/TangledWires/Controversial");
    }
    
    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info("Controversial Disabled, bye!");
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("startvote")) { 
    		return true;
    	}
    	else if (cmd.getName().equalsIgnoreCase("voteyes")) {
    		return true;
    	}
		else if (cmd.getName().equalsIgnoreCase("voteno")) {
			return true;
		}
    	return false; 
    }
}
