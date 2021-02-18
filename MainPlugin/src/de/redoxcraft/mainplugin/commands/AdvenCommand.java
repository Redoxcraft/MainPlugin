package de.redoxcraft.mainplugin.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdvenCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand (CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if(p.isOp() == true) {
				p.setGameMode(GameMode.ADVENTURE);
				return true;
			}return false;
		}return false;
	}	

}
