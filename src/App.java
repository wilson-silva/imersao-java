import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // Fazer uma conexão HTTP e buscar os tops 250 filmes
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopTVs.json";
        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";

        ClienteHttp http = new ClienteHttp();
        String json = http.buscaDados(url);

        // exibir e manipular os dados
        ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();
        //ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new GeradoraDeFigurinhas();

        for (int i = 0; i < conteudos.size(); i++) {

            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            String nomeArquivo = conteudo.getTitulo().replace(":", " - ") + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println("\u001b[38;2;255;255;255m\u001b[48;2;42;122;228m" + conteudo.getTitulo() + "\u001b[m");
            System.out.println();
        }
    }
}
