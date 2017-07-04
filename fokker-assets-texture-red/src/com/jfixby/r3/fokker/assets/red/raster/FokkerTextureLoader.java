
package com.jfixby.r3.fokker.assets.red.raster;

import java.io.IOException;

import com.jfixby.r3.fokker.assets.api.raster.FokkerRasterPackageReader;
import com.jfixby.rana.api.format.PackageFormat;
import com.jfixby.rana.api.loader.PackageReader;
import com.jfixby.rana.api.loader.PackageReaderInput;
import com.jfixby.scarabei.api.collections.Collection;
import com.jfixby.scarabei.api.collections.Collections;
import com.jfixby.scarabei.api.collections.List;

public final class FokkerTextureLoader implements FokkerRasterPackageReader, PackageReader {
	public static final PackageFormat TEXTURE = new PackageFormat(FokkerRasterPackageReader.PACKAGE_FORMAT_TEXTURE);
	public static final PackageFormat ATLAS = new PackageFormat(FokkerRasterPackageReader.PACKAGE_FORMAT_ATLAS);

	final List<PackageFormat> acceptablePackageFormats = Collections.newList();
	private final RedFokkerRaster registry;

	public FokkerTextureLoader (final RedFokkerRaster registry) {
		this.acceptablePackageFormats.add(TEXTURE);
		this.acceptablePackageFormats.add(ATLAS);
		this.registry = registry;
	}

	@Override
	public Collection<PackageFormat> listAcceptablePackageFormats () {
		return this.acceptablePackageFormats;
	}

	@Override
	public void doReadPackage (final PackageReaderInput input) throws IOException {
// final PackageHandler handler = input.getPackageHandler();
// listener.onDependenciesRequired(handler, handler.listDependencies());
		final RedFokkerRasterDataGroup group = new RedFokkerRasterDataGroup(input, this, this.registry);

	}

	@Override
	public PackageReader reader () {
		return this;
	}

}
