
package com.jfixby.r3.fokker.assets.red.font;

import com.jfixby.r3.fokker.api.StringHandler;
import com.jfixby.r3.fokker.assets.api.font.FokkerString;
import com.jfixby.scarabei.api.assets.ID;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.Map;

public class FokkerStringRegister {
	final Map<ID, FokkerString> registry = Collections.newMap();

	public void register (final ID raster_id, final FokkerString data) {
		this.registry.put(raster_id, data);
	}

	public FokkerString get (final StringHandler stringID) {
		return this.registry.get(stringID);
	}
}
