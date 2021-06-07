package me.jaypeg.jayapi.Managers.Rank.Utils;

import org.bukkit.Bukkit;

import java.io.File;


/** @ClassType Util Class */
/** @ClassInfo Removes a Rank */

public class removeRank {


    /** -------------------------------------------- */
    /** @UtilType       Void Util                    */
    /** @UtilInfo       Removes a Rank               */
    /** @ParameterInfo  • rank: Rank to remove       */
    /** -------------------------------------------- */
    /**                                              */
    public static void removeRank(String rank) {

        File file = new File(Bukkit.getServer().getPluginManager().getPlugin("JayAPI").getDataFolder() + File.separator + "Ranks", rank + ".yml");
        file.delete();

    }
    /**                                              */
    /** -------------------------------------------- */


}
