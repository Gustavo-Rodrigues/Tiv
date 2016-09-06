package com.company;




import org.apache.spark.*;
import org.apache.spark.api.java.function.*;
import org.apache.spark.streaming.*;
import org.apache.spark.streaming.api.java.*;
import scala.Tuple2;
import org.apache.spark.SparkConf;
import org.apache.spark.streaming.flume.*;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

public class  Main {
    public static String inputFile = null;
    public static String outputFile = null;
    public static void main(String[] args) {

        SparkConf conf = new SparkConf().setMaster("local[2]").setAppName("tivit_test");
        JavaStreamingContext jssc = new JavaStreamingContext(conf, Durations.seconds(1000));

        // Create a DStream that will connect to hostname:port, like localhost:9999
        JavaReceiverInputDStream<String> lines = jssc.socketTextStream("localhost", 9999);
        lines.print();

        inputFile = args[0];
        outputFile = args[1];
        /*
        //"/Users/user/Documents/resprojetobigdata/TIVIT_TESTE_1.txt"
        List<String> lines = lerArquivoRemessa(inputFile);


        for (String l: lines) {
            System.out.println(l);
        }*/
        //escreverArquivoRetorno(outputFile,leituraArquivoRemessa(inputFile));

        /*
        try{
            gerarXml(lerArquivoRemessa(inputFile));
        }catch (IOException | JAXBException e){
            System.out.println(e);
        }
        validarXML();
        */
    }

    static List<String> lerArquivoRemessa(String file){
        List<String> lines = new LinkedList<String>();
        Path readFile = Paths.get(file);
        Charset charset = Charset.forName("US-ASCII");
        try (BufferedReader reader = Files.newBufferedReader(readFile, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        return lines;
    }

    static void escreverArquivoRetorno(String file,List<String> linhas){
        String header = linhas.get(0);
        String trailler = linhas.get(linhas.size()-1);
        Path writeFile = Paths.get(file);
        try {
            Files.write(writeFile, linhas, Charset.forName("UTF-8"));
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        //Files.write(file, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
    }

    static String slice(String s, int startIndex, int endIndex) {
        if (startIndex < 0) startIndex = s.length() + startIndex;
        if (endIndex < 0) endIndex = s.length() + endIndex;
        return s.substring(startIndex, endIndex);
    }

    static void gerarXml(List<String> linhas) throws JAXBException, IOException {

        File f = new File(outputFile);
        JAXBContext context= JAXBContext.newInstance("com.company");
        Marshaller jaxbMarshaller = context.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        String header = linhas.get(0);
        String trailler = linhas.get(linhas.size()-1);

        ///////////////////
        //   MULTIPLAS   //
        ///////////////////
        ObjectFactory factory = new ObjectFactory();
        Multiplas multiplas = factory.createMultiplas();
        multiplas.setTipoArquivo("null");
        multiplas.setTipoInscricao("null");
        multiplas.setNumeroInscricao("null");
        multiplas.setCodConvenio("null");
        multiplas.setNumParanTransmicao("null");
        multiplas.setDsAmbienteCliente("null");
        multiplas.setNumeroBanco(0);
        multiplas.setNumeroDigAgencia("null");
        multiplas.setNumeroConta("null");
        multiplas.setDsDigConta("null");
        multiplas.setDsNomeEmpresa(slice(header,25,65));
        multiplas.setDsNomeBanco("null");
        multiplas.setNumeroNsa(0);
        //multiplas.setDsResEmpresa(null);
        multiplas.setNumeroVersao("null");
        multiplas.setHoraGeracaoArq(slice(header,86,92));
        GregorianCalendar tmpCalendar = new GregorianCalendar( Integer.valueOf(slice(header,78,82)), Integer.valueOf(slice(header,82,84)) , Integer.valueOf(slice(header,84,86)));
        try {
            XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(tmpCalendar);
            multiplas.setDataGeracaoArq(calendar);
        }catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        multiplas.setNumeroAgencia("null");
        multiplas.setStatus(0);
        multiplas.setNumQtdeLotes(1);
        multiplas.setTipoOrigemSistema("null");
        multiplas.setConteudoRemessa("null");
        List<Multiplas.Lotes> listaLotes = multiplas.getLotes();

        //////////////
        //   LOTE   //
        //////////////
        Multiplas.Lotes lote = factory.createMultiplasLotes();
        lote.setNumeroLoteServico(0);
        lote.setCodTipoServico(0);
        lote.setCodFormaLancamento(0);
        lote.setCodTipoInscricao(0);
        lote.setNumeroInscricao("null");
        lote.setCodConvenio("null");
        lote.setCodTipoCompromisso(0);
        lote.setCodCompromisso(0);
        lote.setDsParanTransmissao(0);
        //maybe here
        lote.setNumeroAgencia(0);
        lote.setNumeroDigAgencia("null");
        lote.setNumeroConta("null");
        lote.setDsDigConta("null");
        lote.setDsNomeEmpresa("null");
        lote.setDsMsgAviso("null");
        lote.setDsLogradouro("null");
        lote.setNumeroLocal("null");
        lote.setDsComplemento("null");
        lote.setDsCidade("null");
        lote.setNumeroCep("null");
        lote.setDsSiglaEstado("null");
        lote.setNumeroVersao(0);
        BigDecimal bigD = new BigDecimal(0);
        lote.setNumeroValorTotal(bigD);
        lote.setNumeroValorTotalValido(bigD);
        lote.setNumeroQtdeRegistro(0);
        lote.setConteudoLote(null);
        List<Multiplas.Lotes.Pagamentos> listaPagamentos = lote.getPagamentos();

        listaLotes.add(lote);

        for(int i = 1; i<linhas.size()-2;i++) {
            String transacao = linhas.get(i);

            ///////////////////
            //   PAGAMENTO   //
            ///////////////////
            Multiplas.Lotes.Pagamentos pagamento = factory.createMultiplasLotesPagamentos();
            pagamento.setCodConvenio("null");
            pagamento.setCodSituacao(0);
            pagamento.setCodProduto(0);
            pagamento.setCodFinalidade(0);
            pagamento.setNumeroBancoCred(slice(transacao,95,98));
            pagamento.setNumeroAgenciaCread(Integer.valueOf(slice(transacao,98,103)));
            pagamento.setNumeroAcAgenciaCred("null");
            pagamento.setNumeroContaCred(slice(transacao,104,117));
            pagamento.setNumeroAcContaCred("null");
            pagamento.setDsNomeFavorecido(slice(transacao,17,47));
            pagamento.setDsCpfCnpjFavorecido(slice(transacao,2,11));
            pagamento.setNumeroTipoPessoaFavorecido(Integer.valueOf(slice(transacao,1,2)));


            pagamento.setNumeroValor(Double.parseDouble(slice(transacao,204,219)));

            pagamento.setNumeroNossoNumero(slice(transacao,138,150));
            pagamento.setNumeroSisNumero("null");
            pagamento.setNumeroSeuNumero(slice(transacao,150,165));
            pagamento.setCodLote(1);
            pagamento.setFinalidadeDoc("null");
            pagamento.setNumeroLocal("null");
            pagamento.setDsComplemento("null");
            pagamento.setDsBairro("null");
            pagamento.setDsCidade("null");
            pagamento.setNumeroCep(Integer.valueOf(slice(transacao,87,92)));
            pagamento.setNumeroCompleCep(slice(transacao,92,95));
            pagamento.setDsSiglaEstado("null");
            pagamento.setTipoConta("null");
            pagamento.setDsLogradouro("null");
            pagamento.setCodMovimento(0);
            pagamento.setCodIdentProduto("null");
            pagamento.setCodSegEmpresa("null");
            pagamento.setCodSicap("null");
            pagamento.setDSNomePagador("null");
            pagamento.setDsCampoLivreBarra("null");
            pagamento.setNumDVCodBarras("null");

            BigDecimal valorDocumento = new BigDecimal(slice(transacao,194,204));
            pagamento.setNumeroValorDocumento(valorDocumento);

            pagamento.setNumeroValorTitulo(bigD);

            BigDecimal valorDesconto = new BigDecimal(slice(transacao,219,234));
            pagamento.setNumeroValorDesconto(valorDesconto);

            pagamento.setNumeroValorMulta(bigD);
            pagamento.setFatorVencimento("null");
            pagamento.setCamara("null");
            pagamento.setInfo01("null");
            pagamento.setInfo02("null");

            //System.out.println(slice(transacao,265,269));
            //System.out.print(slice(transacao,269,271));
            //System.out.print(slice(transacao,271,273));
            tmpCalendar = new GregorianCalendar( Integer.valueOf(slice(transacao,265,269)), Integer.valueOf(slice(transacao,269,271)), Integer.valueOf(slice(transacao,271,273)));
            try {
                XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(tmpCalendar);
                pagamento.setDataPagamento(calendar);
            }catch (DatatypeConfigurationException e) {
                e.printStackTrace();
            }

            tmpCalendar = new GregorianCalendar( Integer.valueOf(slice(transacao,165,169)), Integer.valueOf(slice(transacao,169,171)) , Integer.valueOf(slice(transacao,171,173)));
            try {
                XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(tmpCalendar);
                pagamento.setDataVencimento(calendar);
            }catch (DatatypeConfigurationException e) {
                e.printStackTrace();
            }

            pagamento.setQtdParcelas(0);
            pagamento.setIndBloqueio("null");
            pagamento.setIndParcelamento("null");
            pagamento.setPeriodoVencimento(0);
            pagamento.setNroParcela(0);
            pagamento.setAvisoFavorecido("null");
            pagamento.setOcorrencia("null");
            pagamento.setAutenticacao("null");
            pagamento.setNumeroQtdeRegistroDetalhe(0);
            pagamento.setSegmento("null");
            pagamento.setConteudoPagamento("null");


            List<Multiplas.Lotes.Pagamentos.DetalhesB> listaDetalhesB = pagamento.getDetalhesB();
            Multiplas.Lotes.Pagamentos.DetalhesB detalhesB = factory.createMultiplasLotesPagamentosDetalhesB();
            List<Object> listaConteudoB =  detalhesB.getConteudo();
            listaConteudoB.add("null");
            listaDetalhesB.add(detalhesB);

            List<Multiplas.Lotes.Pagamentos.DetalhesC> listaDetalhesC = pagamento.getDetalhesC();
            Multiplas.Lotes.Pagamentos.DetalhesC detalhesC = factory.createMultiplasLotesPagamentosDetalhesC();
            List<Multiplas.Lotes.Pagamentos.DetalhesC.Conteudo> listaConteudoC =  detalhesC.getConteudo();
            listaDetalhesC.add(detalhesC);

            List<Multiplas.Lotes.Pagamentos.DetalhesD> listaDetalhesD = pagamento.getDetalhesD();
            Multiplas.Lotes.Pagamentos.DetalhesD detalhesD = factory.createMultiplasLotesPagamentosDetalhesD();
            List<Multiplas.Lotes.Pagamentos.DetalhesD.Conteudo> listaConteudoD =  detalhesD.getConteudo();
            listaDetalhesD.add(detalhesD);

            List<Multiplas.Lotes.Pagamentos.DetalhesE> listaDetalhesE = pagamento.getDetalhesE();
            Multiplas.Lotes.Pagamentos.DetalhesE detalhesE = factory.createMultiplasLotesPagamentosDetalhesE();
            List<Multiplas.Lotes.Pagamentos.DetalhesE.Conteudo> listaConteudoE =  detalhesE.getConteudo();
            listaDetalhesE.add(detalhesE);

            List<Multiplas.Lotes.Pagamentos.DetalhesF> listaDetalhesF = pagamento.getDetalhesF();
            Multiplas.Lotes.Pagamentos.DetalhesF detalhesF = factory.createMultiplasLotesPagamentosDetalhesF();
            List<Multiplas.Lotes.Pagamentos.DetalhesF.Conteudo> listaConteudoF =  detalhesF.getConteudo();
            listaDetalhesF.add(detalhesF);

            List<Multiplas.Lotes.Pagamentos.DetalhesH> listaDetalhesH = pagamento.getDetalhesH();
            Multiplas.Lotes.Pagamentos.DetalhesH detalhesH = factory.createMultiplasLotesPagamentosDetalhesH();
            List<Multiplas.Lotes.Pagamentos.DetalhesH.Conteudo> listaConteudoH =  detalhesH.getConteudo();
            listaDetalhesH.add(detalhesH);

            List<Multiplas.Lotes.Pagamentos.DetalhesI> listaDetalhesI = pagamento.getDetalhesI();
            Multiplas.Lotes.Pagamentos.DetalhesI detalhesI = factory.createMultiplasLotesPagamentosDetalhesI();
            List<Multiplas.Lotes.Pagamentos.DetalhesI.Conteudo> listaConteudoI =  detalhesI.getConteudo();
            listaDetalhesI.add(detalhesI);

            List<Multiplas.Lotes.Pagamentos.DetalhesJ> listaDetalhesJ = pagamento.getDetalhesJ();
            Multiplas.Lotes.Pagamentos.DetalhesJ detalhesJ = factory.createMultiplasLotesPagamentosDetalhesJ();
            List<Multiplas.Lotes.Pagamentos.DetalhesJ.Conteudo> listaConteudoJ =  detalhesJ.getConteudo();
            listaDetalhesJ.add(detalhesJ);

            List<Multiplas.Lotes.Pagamentos.DetalhesL> listaDetalhesL = pagamento.getDetalhesL();
            Multiplas.Lotes.Pagamentos.DetalhesL detalhesL = factory.createMultiplasLotesPagamentosDetalhesL();
            List<Multiplas.Lotes.Pagamentos.DetalhesL.Conteudo> listaConteudoL =  detalhesL.getConteudo();
            listaDetalhesL.add(detalhesL);

            List<Multiplas.Lotes.Pagamentos.DetalhesM> listaDetalhesM = pagamento.getDetalhesM();
            Multiplas.Lotes.Pagamentos.DetalhesM detalhesM = factory.createMultiplasLotesPagamentosDetalhesM();
            List<Multiplas.Lotes.Pagamentos.DetalhesM.Conteudo> listaConteudoM =  detalhesM.getConteudo();
            listaDetalhesM.add(detalhesM);

            List<Multiplas.Lotes.Pagamentos.DetalhesP> listaDetalhesP = pagamento.getDetalhesP();
            Multiplas.Lotes.Pagamentos.DetalhesP detalhesP = factory.createMultiplasLotesPagamentosDetalhesP();
            List<Multiplas.Lotes.Pagamentos.DetalhesP.Conteudo> listaConteudoP =  detalhesP.getConteudo();
            listaDetalhesP.add(detalhesP);

            List<Multiplas.Lotes.Pagamentos.DetalhesQ> listaDetalhesQ = pagamento.getDetalhesQ();
            Multiplas.Lotes.Pagamentos.DetalhesQ detalhesQ = factory.createMultiplasLotesPagamentosDetalhesQ();
            List<Multiplas.Lotes.Pagamentos.DetalhesQ.Conteudo> listaConteudoQ =  detalhesQ.getConteudo();
            listaDetalhesQ.add(detalhesQ);

            List<Multiplas.Lotes.Pagamentos.DetalhesR> listaDetalhesR = pagamento.getDetalhesR();
            Multiplas.Lotes.Pagamentos.DetalhesR detalhesR = factory.createMultiplasLotesPagamentosDetalhesR();
            List<Multiplas.Lotes.Pagamentos.DetalhesR.Conteudo> listaConteudoR =  detalhesR.getConteudo();
            listaDetalhesR.add(detalhesR);

            List<Multiplas.Lotes.Pagamentos.DetalhesS> listaDetalhesS = pagamento.getDetalhesS();
            Multiplas.Lotes.Pagamentos.DetalhesS detalhesS = factory.createMultiplasLotesPagamentosDetalhesS();
            List<Multiplas.Lotes.Pagamentos.DetalhesS.Conteudo> listaConteudoS =  detalhesS.getConteudo();
            listaDetalhesS.add(detalhesS);

            List<Multiplas.Lotes.Pagamentos.DetalhesT> listaDetalhesT = pagamento.getDetalhesT();
            Multiplas.Lotes.Pagamentos.DetalhesT detalhesT = factory.createMultiplasLotesPagamentosDetalhesT();
            List<Multiplas.Lotes.Pagamentos.DetalhesT.Conteudo> listaConteudoT =  detalhesT.getConteudo();
            listaDetalhesT.add(detalhesT);

            List<Multiplas.Lotes.Pagamentos.DetalhesU> listaDetalhesU = pagamento.getDetalhesU();
            Multiplas.Lotes.Pagamentos.DetalhesU detalhesU = factory.createMultiplasLotesPagamentosDetalhesU();
            List<Multiplas.Lotes.Pagamentos.DetalhesU.Conteudo> listaConteudoU =  detalhesU.getConteudo();
            listaDetalhesU.add(detalhesU);

            List<Multiplas.Lotes.Pagamentos.DetalhesW> listaDetalhesW = pagamento.getDetalhesW();
            Multiplas.Lotes.Pagamentos.DetalhesW detalhesW = factory.createMultiplasLotesPagamentosDetalhesW();
            List<Multiplas.Lotes.Pagamentos.DetalhesW.Conteudo> listaConteudoW =  detalhesW.getConteudo();
            listaDetalhesW.add(detalhesW);

            List<Multiplas.Lotes.Pagamentos.DetalhesY> listaDetalhesY = pagamento.getDetalhesY();
            Multiplas.Lotes.Pagamentos.DetalhesY detalhesY = factory.createMultiplasLotesPagamentosDetalhesY();
            List<Multiplas.Lotes.Pagamentos.DetalhesY.Conteudo> listaConteudoY =  detalhesY.getConteudo();
            listaDetalhesY.add(detalhesY);

            List<Multiplas.Lotes.Pagamentos.DetalhesZ> listaDetalhesZ = pagamento.getDetalhesZ();
            Multiplas.Lotes.Pagamentos.DetalhesZ detalhesZ = factory.createMultiplasLotesPagamentosDetalhesZ();
            List<Multiplas.Lotes.Pagamentos.DetalhesZ.Conteudo> listaConteudoZ =  detalhesZ.getConteudo();
            listaDetalhesZ.add(detalhesZ);

            listaPagamentos.add(pagamento);
        }


        jaxbMarshaller.marshal(multiplas, f);
        adicionarTag("dsResEmpresa",null,"numeroVersao");
    }

    static void validarXML(){
        try {
            File schemaFile = new File("XSDContent-schMULTIPLASCAOA.xsd.xml");
            //Source xmlFile = new StreamSource(new File("schMULTIPLASCAOA_output.xml"));
            Source xmlFile = new StreamSource(new File(outputFile));
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(schemaFile);
            Validator validator = schema.newValidator();
            validator.validate(xmlFile);
            System.out.println(xmlFile.getSystemId() + " is valid");
        } catch (IOException | org.xml.sax.SAXException e) {
            System.out.println(e);
        }
    }


    static void adicionarTag(String tag, String content, String parent){
        try {
            //DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            //domFactory.setIgnoringComments(true);
            //DocumentBuilder builder = domFactory.newDocumentBuilder();
            //Document doc = builder.parse(new File("test.xml"));
            DOMParser parser = new DOMParser();
            parser.parse(outputFile);
            Document doc = parser.getDocument();

            NodeList nodes = doc.getElementsByTagName(parent);
            Text a = doc.createTextNode(content);
            Element p = doc.createElement(tag);
            p.appendChild(a);

            //nodes.item(0).appendChild(p);
            nodes.item(0).getParentNode().insertBefore(p, nodes.item(0));

            doc = parser.getDocument();
            OutputFormat format = new OutputFormat(doc);
            format.setIndenting(true);
            String filename = outputFile;
            XMLSerializer serializer = new XMLSerializer(
                    new FileOutputStream(new File(filename)), format);
            serializer.serialize(doc);
        }catch (SAXException | IOException e){
            e.printStackTrace();
        }
    }


}
