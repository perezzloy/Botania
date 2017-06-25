package vazkii.botania.common.core.handler;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public final class ModSounds {

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> evt) {
		String[] sounds = {
				"botania:airRod",
				"botania:agricarnation",
				"botania:altarCraft",
				"botania:babylonAttack",
				"botania:babylonSpawn",
				"botania:bellows",
				"botania:bifrostRod",
				"botania:blackLotus",
				"botania:dash",
				"botania:ding",
				"botania:divaCharm",
				"botania:divinationRod",
				"botania:doit",
				"botania:enchanterForm",
				"botania:enchanterFade",
				"botania:enchanterEnchant",
				"botania:endoflame",
				"botania:equipBauble",
				"botania:gaiaTrap",
				"botania:goldenLaurel",
				"botania:holyCloak",
				"botania:laputaStart",
				"botania:lexiconOpen",
				"botania:lexiconPage",
				"botania:lightRelay",
				"botania:manaBlaster",
				"botania:manaPoolCraft",
				"botania:missile",
				"botania:orechid",
				"botania:potionCreate",
				"botania:runeAltarCraft",
				"botania:runeAltarStart",
				"botania:spreaderFire",
				"botania:starcaller",
				"botania:terraBlade",
				"botania:terraformRod",
				"botania:terraPickMode",
				"botania:terrasteelCraft",
				"botania:thermalily",
				"botania:unholyCloak",
				"botania:way",
				"botania:music.gaia1",
				"botania:music.gaia2"
		};

		for (String s : sounds) {
			ResourceLocation loc = new ResourceLocation(s);
			evt.getRegistry().register(new SoundEvent(loc).setRegistryName(loc));
		}
	}

	private ModSounds() {}
}
