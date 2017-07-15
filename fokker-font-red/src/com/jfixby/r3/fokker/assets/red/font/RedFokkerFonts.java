
package com.jfixby.r3.fokker.assets.red.font;

import com.jfixby.r3.fokker.assets.api.font.FokkerFont;
import com.jfixby.r3.fokker.assets.api.font.FokkerFontPackageReader;
import com.jfixby.r3.fokker.assets.api.font.FokkerFontsComponent;
import com.jfixby.scarabei.api.assets.ID;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.Map;

public class RedFokkerFonts implements FokkerFontsComponent {

	final TrueTypeFontFontPackageLoader reader = new TrueTypeFontFontPackageLoader(this);
	final Map<ID, FokkerFont> registry = Collections.newMap();

	public void register (final ID raster_id, final FokkerFont data) {
		this.registry.put(raster_id, data);
	}

	@Override
	public FokkerFontPackageReader packageReader () {
		return this.reader;
	}

	@Override
	public FokkerFont obtainFont (final ID assetID) {
		return this.registry.get(assetID);
	}

}
