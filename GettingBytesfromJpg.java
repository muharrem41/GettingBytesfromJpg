import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GettingBytesfromJpg {

	public static void main(String[] args) throws Exception{
		
		 BufferedImage bufferedImage = ImageIO.read(
				 new File("C:/Users/mmuha/Desktop/IMG_0206.JPG"));
		
		 byte [] data =JpgParsingToByte(bufferedImage); 
		 
		 printStreamData(data);
	     
	}
	
	private static void printStreamData(byte[] data) {
   
		for(int i=0;i<data.length;i++) {
			String hdata=Integer.toHexString(data[i]);
			System.out.println(hdata);
		}		
	}

	private static byte[] JpgParsingToByte(final BufferedImage bufferedImage){
		
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	     
		 try {
			ImageIO.write(bufferedImage, "jpg",byteArrayOutputStream );
		} catch (IOException e) {
			e.printStackTrace();
		}
	     
		 byte [] data = byteArrayOutputStream.toByteArray();
		 
		 return data;
	}
}
