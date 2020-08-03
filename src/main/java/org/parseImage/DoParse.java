package org.parseImage;

import java.util.concurrent.Callable;

import ij.ImagePlus;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "DoParse", mixinStandardHelpOptions = true, description = "Returns ImagePlus object", version = "1.0")
public class DoParse implements Callable<Integer> {
	@Option(names = "-r", description = "The r option")
	String rValue;

	@Override
	public Integer call() {
		System.out.printf("-r=%s%n", rValue);
		new ij.ImageJ();
		ImagePlus img = new ImagePlus(rValue);
		img.show();

		return 0;
	}

	public static void main(String... args) {
		System.exit(new CommandLine(new DoParse()).execute(args));
	}

}
