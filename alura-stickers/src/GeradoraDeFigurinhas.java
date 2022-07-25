import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeradoraDeFigurinhas {

    public void cria(InputStream inputStream, String nomeArquivo) throws Exception {

        // leitura da imagem
        //InputStream inputStream = new FileInputStream(new File("entrada/filme.jpg"));
        //InputStream inputStream = new URL("https://imersao-java-apis.s3.amazonaws.com/TopMovies_1.jpg").openStream();
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // cria nova imagem em memória com transparência e tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar a imagem original para nova imagem (em memoria)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        //configurar a fonte
        var font = new Font(Font.SANS_SERIF, Font.BOLD, 80);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(font);

        // escrever uma frase na nova imagem
        String text = "TOP";
        int tamanhoFrase = graphics.getFontMetrics().stringWidth(text);
        int localFrase = (novaImagem.getWidth() - tamanhoFrase) / 2;
        graphics.drawString(text, localFrase, novaAltura - 100);

        // escrever a nova imagem em um arquivo
        Path pastaPath = Paths.get("saida");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

        ImageIO.write(novaImagem, "png", new File("saida/" + nomeArquivo));
    }
}


