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
package mobac.gui.components;

import javax.swing.JTextField;

import mobac.program.model.Profile;


/**
 * A {@link JTextField} that only accepts ASCII characters, numbers and spaces.
 * 
 */
public class JAtlasNameField extends JRegexTextField {

	private static final long serialVersionUID = 1L;

	public JAtlasNameField() {
		super(Profile.PROFILE_NAME_REGEX, 40);
	}

}
