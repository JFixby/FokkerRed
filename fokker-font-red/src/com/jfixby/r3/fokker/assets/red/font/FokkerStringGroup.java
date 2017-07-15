
package com.jfixby.r3.fokker.assets.red.font;

import com.jfixby.r3.fokker.api.FontParameters;
import com.jfixby.r3.fokker.assets.api.font.FokkerString;
import com.jfixby.scarabei.api.assets.ID;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.Map;

public class FokkerStringGroup {
	final Map<ID, FokkerStringGroup> registry = Collections.newMap();

	public FokkerString resolve (final FontParameters fontParams, final String stringValue) {
		return null;
	}

}
