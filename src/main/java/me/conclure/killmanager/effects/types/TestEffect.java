package me.conclure.killmanager.effects.types;

import me.conclure.killmanager.effects.Effect;
import me.conclure.killmanager.util.logging.ColorUtil;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.entity.Player;

public class TestEffect extends Effect implements Listener {
    public TestEffect(String name, String description) {
        super("Test", "&bTest Effect", "&7This is a test Effect");
    }

    @Override
    public void runEffect(EntityDeathEvent entityDeathEvent) {
        Player player = (Player) entityDeathEvent.getEntity();
        player.getNearbyEntities(20D, 20D, 20D).forEach(ent -> {
            if (ent instanceof Player) {
                ent.getWorld().strikeLightningEffect(ent.getLocation());
                ent.sendMessage(ColorUtil.format("&cYou have been struct with lightning!"));
            }
        });
    }
}
