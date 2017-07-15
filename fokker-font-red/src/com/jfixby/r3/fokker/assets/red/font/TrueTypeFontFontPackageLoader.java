
package com.jfixby.r3.fokker.assets.red.font;

import java.io.IOException;

import com.jfixby.r3.fokker.assets.api.font.FokkerFontPackageReader;
import com.jfixby.rana.api.format.PackageFormat;
import com.jfixby.rana.api.loader.PackageReader;
import com.jfixby.rana.api.loader.PackageReaderInput;
import com.jfixby.scarabei.api.collections.Collection;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.List;

public class TrueTypeFontFontPackageLoader implements PackageReader, FokkerFontPackageReader {

	final List<PackageFormat> acceptablePackageFormats;
	private final FokkerFontRegister redFokkerFonts;

	public TrueTypeFontFontPackageLoader (final FokkerFontRegister redFokkerFonts) {
		this.redFokkerFonts = redFokkerFonts;
		this.acceptablePackageFormats = Collections.newList();
		final PackageFormat format = new PackageFormat(FokkerFontPackageReader.PACKAGE_FORMAT);
		this.acceptablePackageFormats.add(format);
	}

	@Override
	public Collection<PackageFormat> listAcceptablePackageFormats () {
		return this.acceptablePackageFormats;
	}

	@Override
	public void doReadPackage (final PackageReaderInput input) throws IOException {
// final PackageHandler handler = input.getPackageHandler();
		final RedTTFFontGroup group = new RedTTFFontGroup(input, this.redFokkerFonts);
	}

	@Override
	public PackageReader reader () {
		return this;
	}

}
