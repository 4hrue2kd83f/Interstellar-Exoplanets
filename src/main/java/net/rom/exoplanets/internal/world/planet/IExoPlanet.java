/**
 * Copyright (C) 2020 Interstellar:  Exoplanets
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.rom.exoplanets.internal.world.planet;

import java.util.ArrayList;

import asmodeuscore.api.space.IExBody;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.world.AtmosphereInfo;
import micdoodle8.mods.galacticraft.api.world.EnumAtmosphericGas;
import net.rom.exoplanets.internal.enums.EnumDiscMethod;
import net.rom.exoplanets.internal.enums.EnumPlanetType;
import net.rom.exoplanets.internal.enums.EnumTPHClass;
import net.rom.exoplanets.internal.world.WorldProviderExoPlanet;

/**
 * The Interface IExoPlanet.
 */
public interface IExoPlanet extends IExBody {
		
	/**
	 * Gets the planet name.
	 *
	 * @return the planetName
	 */
	public String getPlanetName();
	
	/**
	 * Gets Solar System the planet belongs too.
	 *
	 * @return the planetSystem
	 */
	public SolarSystem getPlanetSystem();
	
	/**
	 * Gets planets Host star.
	 *
	 * @return the planetHost
	 */
	public Star getPlanetHost();
	
	/**
	 * Gets the method.
	 *
	 * @return the method
	 */
	public EnumDiscMethod getDiscoveryMethod();
	
	/**
	 * Gets the EnumTPHClass.
	 *
	 * @return the method
	 */
	public EnumTPHClass getTphClass();
	
	/**
	 * Gets the EnumPlanetType.
	 *
	 * @return the method
	 */
	public EnumPlanetType getPlanetType();
	
	/**
	 * Gets the orbit period.
	 *
	 * @return the orbitPeriod
	 */
	public double getOrbitPeriod();
	
	/**
	 * Gets the planet mass.
	 *
	 * @return the planetMass
	 */
	public double getPlanetMass();
	
	/**
	 * Gets the planet radius.
	 *
	 * @return the planetMass
	 */
	public double getPlanetRadius();
	
	/**
	 * Gets the planet temp.
	 *
	 * @return the planetTemp
	 */
	public double getPlanetTemp();
	
	/**
	 * Gets the planets gravity.
	 *
	 * @return the gravity
	 */
	public float getGravity();
	
	/**
	 * Gets the planets day length.
	 *
	 * @return the day length
	 */
	public long getDayLength();
	
	/**
	 * Checks if is breathable.
	 *
	 * @return the isBreathable
	 */
	public boolean isBreathable();
	
	/**
	 * Checks if is does rain.
	 *
	 * @return the doesRain
	 */
	public boolean isDoesRain();
	
	/**
	 * Gets the atmos.
	 *
	 * @return the atmos
	 */
	public AtmosphereInfo getAtmos();
	
	/**
	 * Gets the atmos gasses.
	 *
	 * @return the atmosGasses
	 */
	public ArrayList<EnumAtmosphericGas> getAtmosGasses();
	
	/**
	 * Gets the planet provider.
	 *
	 * @return the planetProvider
	 */
	public WorldProviderExoPlanet getPlanetProvider();
}
