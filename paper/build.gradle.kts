plugins {
	id("io.papermc.paperweight.userdev") version "1.3.8"
	id("xyz.jpenilla.run-paper") version "1.0.6"
}

dependencies {
	paperDevBundle("1.18.2-R0.1-SNAPSHOT")

	compileOnly("net.civmc.civmodcore:CivModCore:2.4.0:dev-all")
	compileOnly("com.sk89q.worldedit:worldedit-bukkit:7.2.8")
    implementation("org.apache.commons:commons-math3:3.6.1")
}
