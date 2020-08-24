package org.parseImage;

import ij.ImagePlus;

public class Imager {

	public static void main(String[] args) {
		String path = "C:\\Users\\Subroto\\Desktop\\outputUnet5.tif";
		new ij.ImageJ();
		ImagePlus img = new ImagePlus(path);
		img.show();
		String title = img.getTitle();
		System.out.println(title);

	}
}
