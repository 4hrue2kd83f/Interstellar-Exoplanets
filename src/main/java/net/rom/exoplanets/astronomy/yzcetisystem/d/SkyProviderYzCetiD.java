package net.rom.exoplanets.astronomy.yzcetisystem.d;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.rom.api.client.SkyProviderBase;
import net.rom.exoplanets.ExoInfo;
import net.rom.exoplanets.astronomy.yzcetisystem.c.SkyProviderYzCetiC;
import net.rom.exoplanets.conf.SConfigCore;
import net.rom.exoplanets.util.CoreUtil;

public class SkyProviderYzCetiD extends SkyProviderBase {

    private static final ResourceLocation YZCETI_A_REALISTIC = new ResourceLocation(ExoInfo.MODID, "textures/celestialbodies/yz_ceti/realism/yz_ceti_starB.png");
    private static final ResourceLocation YZCETI_A = new ResourceLocation(ExoInfo.MODID, "textures/celestialbodies/yz_ceti/yz_ceti_star.png");

    private static final ResourceLocation YZCETI_B = new ResourceLocation(ExoInfo.MODID, "textures/celestialbodies/yz_ceti/yz_ceti_b.png");
    private static final ResourceLocation YZCETI_C = new ResourceLocation(ExoInfo.MODID, "textures/celestialbodies/yz_ceti/yz_ceti_c.png");

    public SkyProviderYzCetiD(float solarSize) {
        this.solarSize = solarSize;
    }

    @Override
    protected void renderObjects(float partialTicks, WorldClient world, Minecraft mc) {
        this.renderSolarAura(14.0F, 75.0F, world.getStarBrightness(partialTicks), CoreUtil.stringToRGB("217, 123, 38, 102"), partialTicks);
        if(SConfigCore.enableRealism) {
            this.renderSolar(SkyProviderYzCetiD.YZCETI_A_REALISTIC, this.solarSize, false, true, 4.0F);
        } else {
            this.renderSolar(SkyProviderYzCetiD.YZCETI_A, this.solarSize, false, true, 4.0F);
        }
        this.renderObject(1.0F, 0.0F, 150.0F, true, SkyProviderYzCetiD.YZCETI_C, partialTicks);
        this.renderObject(2.55F, 0.0F, 220.0F, true, SkyProviderYzCetiD.YZCETI_B, partialTicks);
    }

    @Override
    protected void renderStars(float starBrightness)
    {
        GlStateManager.color(starBrightness, starBrightness, starBrightness, this.getStarBrightness());
    }

    @Override
    protected int getStarCount() {
        return 100000;
    }

    @Override
    protected double getStarSpreadMultiplier() {
        return 50.0D;
    }

    @Override
    protected float getStarBrightness() {
        return 1.0F;
    }

}
