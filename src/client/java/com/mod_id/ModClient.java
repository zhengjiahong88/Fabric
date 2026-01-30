package com.mod_id;

import net.fabricmc.api.ClientModInitializer;

public class ModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// 在這裡或用 ClientTickEvents 去偵測 keyBinding.wasPressed()
	}
}