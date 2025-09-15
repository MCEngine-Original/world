package io.github.mcengine.spigotmc.world.original;

import io.github.mcengine.api.core.MCEngineCoreApi;
import io.github.mcengine.api.core.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main SpigotMC plugin class for the MCEngine World module.
 */
public class MCEngineWorldSpigotMC extends JavaPlugin {

    /** Metrics project id for bStats. */
    private static final int METRICS_PROJECT_ID = 22578;

    /** Command root namespace for this module. */
    private static final String COMMAND_NAMESPACE = "world";

    /**
     * Called when the plugin is enabled.
     */
    @Override
    public void onEnable() {
        new Metrics(this, METRICS_PROJECT_ID);
        saveDefaultConfig(); // Save config.yml if it doesn't exist

        boolean enabled = getConfig().getBoolean("enable", false);
        if (!enabled) {
            getLogger().warning("Plugin is disabled in config.yml (enable: false). Disabling plugin...");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
    }

    /**
     * Called when the plugin is disabled.
     */
    @Override
    public void onDisable() {
        // Plugin shutdown logic if needed
    }
}
