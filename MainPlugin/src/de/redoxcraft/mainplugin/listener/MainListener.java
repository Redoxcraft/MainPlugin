package de.redoxcraft.mainplugin.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import de.redoxcraft.mainplugin.main.Main;

public class MainListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if(p.hasPlayedBefore()) {
			if(p.isOp()) {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
					public void run() {
						p.sendMessage(ChatColor.WHITE + "Willkommen zurück, " + ChatColor.RED + p.getDisplayName());
					}
				}, 5);
				int randomMessage = (int) (Math.random()*(6));
				if(randomMessage == 0) {
					e.setJoinMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " ist gekommen");
					return;
				}else if(randomMessage == 1) {
					e.setJoinMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " hat den Server betreten");
					return;
				}else if(randomMessage == 2) {
					e.setJoinMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " ist jetzt online");
					return;
				}else if(randomMessage == 3) {
					e.setJoinMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " ist zu uns gestoßen");
					return;
				}else if(randomMessage == 4) {
					e.setJoinMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " betritt die Fantasiewelt");
					return;
				}else if(randomMessage == 5) {
					e.setJoinMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " ist da!");
					return;
				}
			}else {
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
					public void run() {
						p.sendMessage(ChatColor.WHITE + "Willkommen zurück, " + ChatColor.BLUE + p.getDisplayName());
					}
				}, 5);
				int randomMessage = (int) (Math.random()*(6));
				if(randomMessage == 0) {
					e.setJoinMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " ist gekommen");
					return;
				}else if(randomMessage == 1) {
					e.setJoinMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " hat den Server betreten");
					return;
				}else if(randomMessage == 2) {
					e.setJoinMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " ist jetzt online");
					return;
				}else if(randomMessage == 3) {
					e.setJoinMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " ist zu uns gestoßen");
					return;
				}else if(randomMessage == 4) {
					e.setJoinMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " betritt die Fantasiewelt");
					return;
				}else if(randomMessage == 5) {
					e.setJoinMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " ist da!");
					return;
				}
			}
		}else {
			Location arg0 = new Location(Bukkit.getWorld("world"), 0.5, 63, 0.5);
			p.teleport(arg0);
			e.setJoinMessage(ChatColor.WHITE + "Willkommen " + ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + "," + "\nViel Spaß auf dem " + ChatColor.BLUE + "Server für Festlichkeiten" + ChatColor.WHITE + " !");
			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
				public void run() {
					p.sendMessage(ChatColor.WHITE + "Tippe /geschichte um zu erfahren, was passiert ist!" + ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + " *Du versuchst angestrengt dich an das Geschehene zu erinnern*");	
				}
			}, 5);
			return;
		}
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		
		if(p.isOp()) {
			int randomMessage = (int) (Math.random()*(6));
			if(randomMessage == 0) {
				e.setQuitMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " musste los");
				return;
			}else if(randomMessage == 1) {
				e.setQuitMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " hat den Server verlassen");
				return;
			}else if(randomMessage == 2) {
				e.setQuitMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " ist jetzt offline");
				return;
			}else if(randomMessage == 3) {
				e.setQuitMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " ist abgehauen");
				return;
			}else if(randomMessage == 4) {
				e.setQuitMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " betritt nun wieder die reale Welt");
				return;
			}else if(randomMessage == 5) {
				e.setQuitMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " verlässt uns");
				return;
			}
		}else {
			int randomMessage = (int) (Math.random()*(6));
			if(randomMessage == 0) {
				e.setQuitMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " musste los");
				return;
			}else if(randomMessage == 1) {
				e.setQuitMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " hat den Server verlassen");
				return;
			}else if(randomMessage == 2) {
				e.setQuitMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " ist jetzt offline");
				return;
			}else if(randomMessage == 3) {
				e.setQuitMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " ist abgehauen");
				return;
			}else if(randomMessage == 4) {
				e.setQuitMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " betritt nun wieder die reale Welt");
				return;
			}else if(randomMessage == 5) {
				e.setQuitMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " verlässt uns");
				return;
			}
		}
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		Player p = e.getEntity();
		
		if(p.isOp()) {
			e.setDeathMessage(ChatColor.RED + p.getDisplayName() + ChatColor.WHITE + " wurde wohl mit unfairen Mitteln getötet!");
			return;
		}
		int randomMessage = (int) (Math.random()*(6));
        if(randomMessage == 0) {
       		e.setDeathMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " hatte " + ChatColor.GREEN + p.getLevel() + " Level" + ChatColor.WHITE + ", und lebt nun nicht mehr auf dieser Welt");
       		return;
      	}else if(randomMessage == 1) {
      		e.setDeathMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " hatte " + ChatColor.GREEN + p.getLevel() + " Level" + ChatColor.WHITE + ", und ist gestorben");
      		return;
        }else if(randomMessage == 2) {
        	e.setDeathMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " hatte " + ChatColor.GREEN + p.getLevel() + " Level" + ChatColor.WHITE + ", und erlag seinen Schmerzen");
        	return;
        }else if(randomMessage == 3) {
        	e.setDeathMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " hatte " + ChatColor.GREEN + p.getLevel() + " Level" + ChatColor.WHITE + ", und ist ins Jenseits aufgestiegen");
        	return;
        }else if(randomMessage == 4) {
        	e.setDeathMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " hatte " + ChatColor.GREEN + p.getLevel() + " Level" + ChatColor.WHITE + ", und ist nun tot");
        	return;
        }else if(randomMessage == 5) {
        	e.setDeathMessage(ChatColor.BLUE + p.getDisplayName() + ChatColor.WHITE + " hatte " + ChatColor.GREEN + p.getLevel() + " Level" + ChatColor.WHITE + ", und verendete");
        	return;
        }
		
	}
	
	@EventHandler
	public void onPlayerRespawn(PlayerRespawnEvent e) {
		Player p = e.getPlayer();
		if(p.getBedSpawnLocation() == null) {
			Location loc = new Location(Bukkit.getWorld("world"), 0.5, 63, 0.5);
			e.setRespawnLocation(loc);
			return;
		}return;
	}
	
}
