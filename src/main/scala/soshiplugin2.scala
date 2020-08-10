import java.util.Objects
import org.bukkit.plugin.java.JavaPlugin

private object soshiplugin2 extends JavaPlugin{
    override def onEnable(): Unit = {
        getLogger.info("Plugin activation")
    }

    override def onDisable(): Unit = {
        getLogger.info("Plugin shutdown")
    }

}
