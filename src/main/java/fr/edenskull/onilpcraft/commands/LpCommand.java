package fr.edenskull.onilpcraft.commands;

import fr.edenskull.onilpcraft.OniLPCraft;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class LpCommand implements CommandExecutor {
	private final OniLPCraft plugin;

	public LpCommand(OniLPCraft plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			PlayerInventory inventory = player.getInventory();

			inventory.setBoots(createBoots());
			inventory.setChestplate(createChestplate());
			inventory.setHelmet(createHelmet());
			inventory.setLeggings(createLeggings());
			inventory.setItem(0, createSword());
			inventory.setItem(1, createPickaxeSilk());
			inventory.setItem(2, createPickaxeSpeed());
			inventory.setItem(3, createAxe());
		} else {
			sender.sendMessage("You are not a player");
			return false;
		}
		return false;
	}

	private ItemStack createSword() {
		String swordName = Color.RED + "LP Sword";
		List<String> lores = new ArrayList<>();
		lores.add(Color.TEAL + "It says that this is a streamer Sword");

		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(swordName);
		meta.setLore(lores);
		meta.setUnbreakable(true);

		meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 2, false);
		meta.addEnchant(Enchantment.MENDING, 1, false);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 3, false);

		item.setItemMeta(meta);
		return item;
	}

	private ItemStack createPickaxeSpeed() {
		String pickaxeName = Color.RED + "LP Pickaxe Speed";
		List<String> lores = new ArrayList<>();
		lores.add(Color.TEAL + "You should be able to break bedrock with it, Maybe");

		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(pickaxeName);
		meta.setLore(lores);
		meta.setUnbreakable(true);

		meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
		meta.addEnchant(Enchantment.MENDING, 1, false);

		item.setItemMeta(meta);
		return item;
	}

	private ItemStack createPickaxeSilk() {
		String pickaxeName = Color.RED + "LP Pickaxe Silk";
		List<String> lores = new ArrayList<>();
		lores.add(Color.TEAL + "With this you can mine air blocks");

		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(pickaxeName);
		meta.setLore(lores);
		meta.setUnbreakable(true);

		meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta.addEnchant(Enchantment.SILK_TOUCH, 1, false);
		meta.addEnchant(Enchantment.MENDING, 1, false);

		item.setItemMeta(meta);
		return item;
	}

	private ItemStack createAxe() {
		String axeName = Color.RED + "LP Axe";
		List<String> lores = new ArrayList<>();
		lores.add(Color.TEAL + "It says that with one hit it makes a wood stere");

		ItemStack item = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(axeName);
		meta.setLore(lores);
		meta.setUnbreakable(true);

		meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta.addEnchant(Enchantment.MENDING, 1, false);

		item.setItemMeta(meta);
		return item;
	}

	private ItemStack createHelmet() {
		String axeName = Color.RED + "LP Helmet";
		List<String> lores = new ArrayList<>();
		lores.add(Color.TEAL + "Can block even blood drip at full speed");

		ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(axeName);
		meta.setLore(lores);
		meta.setUnbreakable(true);

		meta.addEnchant(Enchantment.WATER_WORKER, 1, false);
		meta.addEnchant(Enchantment.MENDING, 1, false);
		meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
		meta.addEnchant(Enchantment.OXYGEN, 10, true);
		meta.addEnchant(Enchantment.THORNS, 10, true);

		item.setItemMeta(meta);
		return item;
	}

	private ItemStack createChestplate() {
		String chestplateName = Color.RED + "LP Chestplate";
		List<String> lores = new ArrayList<>();
		lores.add(Color.TEAL + "Visibly it can\'t be penetrate, Hope");

		ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(chestplateName);
		meta.setLore(lores);
		meta.setUnbreakable(true);

		meta.addEnchant(Enchantment.MENDING, 1, false);
		meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
		meta.addEnchant(Enchantment.THORNS, 10, true);

		item.setItemMeta(meta);
		return item;
	}

	private ItemStack createLeggings() {
		String leggingsName = Color.RED + "LP Leggings";
		List<String> lores = new ArrayList<>();
		lores.add(Color.TEAL + "It\'s not a short, I guess");

		ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(leggingsName);
		meta.setLore(lores);
		meta.setUnbreakable(true);

		meta.addEnchant(Enchantment.MENDING, 1, false);
		meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
		meta.addEnchant(Enchantment.THORNS, 10, true);

		item.setItemMeta(meta);
		return item;
	}

	private ItemStack createBoots() {
		String leggingsName = Color.RED + "LP Boots";
		List<String> lores = new ArrayList<>();
		lores.add(Color.TEAL + "Visibly you can run faster, At least it is written");

		ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(leggingsName);
		meta.setLore(lores);
		meta.setUnbreakable(true);

		meta.addEnchant(Enchantment.MENDING, 1, false);
		meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_FIRE, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 10, true);
		meta.addEnchant(Enchantment.THORNS, 10, true);
		meta.addEnchant(Enchantment.DEPTH_STRIDER, 3, false);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 10, true);

		item.setItemMeta(meta);
		return item;
	}

}
