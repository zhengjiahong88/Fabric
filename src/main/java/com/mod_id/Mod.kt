package com.mod_id

import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier

const val NAMESPACE: String = "mod_id"

val String.id: Identifier get() = Identifier.of(NAMESPACE, this)

class Mod : ModInitializer {
    override fun onInitialize() {
    }
}