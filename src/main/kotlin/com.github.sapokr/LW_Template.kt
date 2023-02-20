import com.discord.sapokr.litewaffle.LiteWaffle
import com.discord.sapokr.litewaffle.LiteWaffle.Companion.LWUtility
import com.github.sapokr.LWListener
import org.bukkit.plugin.java.JavaPlugin

class LW_Template: JavaPlugin() {
    companion object {
        private const val PluginName: String = "LW_Template"
        var LiteUtility : LWUtility = LiteWaffle.LWInitialize(PluginName)
    }
    override fun onEnable() {
        // 1 listener 1 class
        LiteUtility.addListenerHandler(LWListener())
        LiteUtility.setDisplayname("Template") // display this name
        logger.info("Enable Plugin")
    }

    override fun onDisable() {
        logger.info("Disable Plugin")
    }
}