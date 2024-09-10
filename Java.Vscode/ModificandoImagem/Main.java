package ModificandoImagem;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedImage imagem = ImageIO.read(new File("ModificandoImagem\\quadrado.png"));
            Graphics2D g2 = imagem.createGraphics();

            g2.setColor(Color.RED);
            if (imagem.getRGB(, 0))
            g2.fillRect(50, 50, 100, 100);
            g2.dispose();
            
            ImageIO.write(imagem, "png", new File("output.png"));
            System.out.println("Image modified and saved successfully!");
    
        }catch(IOException e){
            System.out.println("Erro1 " + e.getMessage());
        }
    }
}
