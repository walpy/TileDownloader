/*******************************************************************************
 * Copyright (c) MOBAC developers
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package mobac.gui.mapview;

import mobac.utilities.I18nUtils;

public class GridZoom {

	private int zoom;

	public int getZoom() {
		return zoom;
	}

	public GridZoom(int zoom) {
		this.zoom = zoom;
	}

	@Override
	public String toString() {
		return String.format(I18nUtils.localizedStringForKey("map_ctrl_zoom_grid_prefix_fmt"), zoom);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof GridZoom))
			return false;
		return ((GridZoom) obj).zoom == zoom;
	}

	@Override
	public int hashCode() {
		assert false : "hashCode not designed";
		return -1;
	}

}
