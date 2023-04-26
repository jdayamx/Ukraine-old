package jday.ukraine.painting;

import jday.ukraine.Ukraine;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import net.minecraft.util.registry.Registry;

public class UkrainePainting {
    public static final PaintingMotive UKRAINE_TARAS = registerPainting("taras", new PaintingMotive(32,32));
    public static final PaintingMotive UKRAINE_LESYA = registerPainting("lesya", new PaintingMotive(32,32));
    public static final PaintingMotive UKRAINE_ZELENSKIY = registerPainting("zelenskiy", new PaintingMotive(32,32));
    public static final PaintingMotive UKRAINE_BANDERA = registerPainting("bandera", new PaintingMotive(32,32));
    public static final PaintingMotive UKRAINE_BOHDAN = registerPainting("bohdan", new PaintingMotive(32,32));
    public static final PaintingMotive UKRAINE_KIEV = registerPainting("kiev", new PaintingMotive(64,32));
    public static final PaintingMotive UKRAINE_PIVEN = registerPainting("piven", new PaintingMotive(64,64));
    public static final PaintingMotive UKRAINE_IVAN = registerPainting("ivan", new PaintingMotive(32,32));
    public static final PaintingMotive UKRAINE_VALERA = registerPainting("valera", new PaintingMotive(32,32));
    private static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {
        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(Ukraine.MOD_ID, name), paintingMotive);
    }
    public static void registerPaintings() {
        LogManager.getLogger().info("Register paintings for " + Ukraine.MOD_ID);
    }
}
