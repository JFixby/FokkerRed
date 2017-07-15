
package com.jfixby.r3.fokker.assets.red.font;

import com.jfixby.r3.fokker.assets.api.font.FokkerFont;
import com.jfixby.scarabei.api.assets.ID;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.Map;

public class FokkerFontRegister {

	final TrueTypeFontFontPackageLoader reader = new TrueTypeFontFontPackageLoader(this);
	final Map<ID, FokkerFont> registry = Collections.newMap();

	public void register (final ID raster_id, final FokkerFont data) {
		this.registry.put(raster_id, data);
	}

	public FokkerFont get (final ID assetID) {
		return this.registry.get(assetID);
	}

}
