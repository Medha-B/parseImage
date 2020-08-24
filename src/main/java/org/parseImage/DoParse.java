package org.parseImage;

import ij.ImagePlus;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "DoParse", mixinStandardHelpOptions = true, description = "Returns ImagePlus object", version = "1.0")
public class DoParse implements Runnable {
	@Option(names = "-r", description = "The r option")
	String rValue;

	@Override
	public void run() {
		System.out.printf("-r=%s%n", rValue);
		new ij.ImageJ();
		ImagePlus img = new ImagePlus(rValue);
		img.show();
		String name = img.getTitle();
		System.out.println(name);

	}

	@SuppressWarnings("deprecation")
	public static void main(String... args) {
		CommandLine.run(new DoParse(), System.err, args);
	}

}
