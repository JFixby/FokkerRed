
package com.jfixby.r3.fokker.assets.red.font;

import com.jfixby.r3.fokker.api.StringHandler;
import com.jfixby.r3.fokker.assets.api.font.FokkerFont;
import com.jfixby.r3.fokker.assets.api.font.FokkerFontPackageReader;
import com.jfixby.r3.fokker.assets.api.font.FokkerFontsComponent;
import com.jfixby.r3.fokker.assets.api.font.FokkerString;
import com.jfixby.scarabei.api.assets.ID;

public class RedFokkerFonts implements FokkerFontsComponent {

	final FokkerFontRegister fontRegister = new FokkerFontRegister();
	final FokkerStringRegister stringRegister = new FokkerStringRegister();

	@Override
	public FokkerFontPackageReader packageReader () {
		return this.fontRegister.reader;
	}

	@Override
	public FokkerFont obtainFont (final ID assetID) {
		return this.fontRegister.get(assetID);
	}

	@Override
	public FokkerString obtainString (final StringHandler stringID) {
		return this.stringRegister.get(stringID);
	}

}
