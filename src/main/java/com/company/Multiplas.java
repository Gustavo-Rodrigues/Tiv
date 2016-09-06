package com.company;
//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem.
// Gerado em: 2016.08.15 às 03:10:36 PM BRT
//


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de anonymous complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoArquivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoInscricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroInscricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codConvenio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numParanTransmicao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dsAmbienteCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroBanco" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroDigAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroConta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dsDigConta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dsNomeEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dsNomeBanco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroNsa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dsResEmpresa" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="numeroVersao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="horaGeracaoArq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataGeracaoArq" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="numeroAgencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numQtdeLotes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoOrigemSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conteudoRemessa" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="lotes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroLoteServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="codTipoServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="codFormaLancamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="codTipoInscricao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="numeroInscricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="codConvenio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="codTipoCompromisso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="codCompromisso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dsParanTransmissao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="numeroAgencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="numeroDigAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numeroConta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dsDigConta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dsNomeEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dsMsgAviso" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="dsLogradouro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numeroLocal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dsComplemento" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="dsCidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numeroCep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dsComplementoCep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="dsSiglaEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numeroVersao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="numeroValorTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="numeroValorTotalValido" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="numeroQtdeRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="conteudoLote" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="pagamentos" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codConvenio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codSituacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="codProduto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="codFinalidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="numeroBancoCred" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numeroAgenciaCread" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="numeroAcAgenciaCred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numeroContaCred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numeroAcContaCred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dsNomeFavorecido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dsCpfCnpjFavorecido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numeroTipoPessoaFavorecido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="numeroValor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="numeroNossoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numeroSisNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numeroSeuNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codLote" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="finalidadeDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numeroLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dsComplemento" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="dsBairro" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="dsCidade" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="numeroCep" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="numeroCompleCep" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="dsSiglaEstado" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="tipoConta" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="dsLogradouro" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="CodMovimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="CodIdentProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodSegEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodSicap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DSNomePagador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DsCampoLivreBarra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NumDVCodBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numeroValorDocumento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="numeroValorTitulo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="numeroValorDesconto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="numeroValorMulta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="FatorVencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Camara" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Info01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Info02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dataPagamento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="QtdParcelas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="IndBloqueio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IndParcelamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PeriodoVencimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="NroParcela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="AvisoFavorecido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ocorrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="autenticacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numeroQtdeRegistroDetalhe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="segmento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="conteudoPagamento" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="detalhesB" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesC" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesD" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesE" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesF" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesH" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesI" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesJ" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesL" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesM" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesP" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesQ" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesR" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesS" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesT" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesU" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesW" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesY" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="detalhesZ" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "tipoArquivo",
        "tipoInscricao",
        "numeroInscricao",
        "codConvenio",
        "numParanTransmicao",
        "dsAmbienteCliente",
        "numeroBanco",
        "numeroDigAgencia",
        "numeroConta",
        "dsDigConta",
        "dsNomeEmpresa",
        "dsNomeBanco",
        "numeroNsa",
        "dsResEmpresa",
        "numeroVersao",
        "horaGeracaoArq",
        "dataGeracaoArq",
        "numeroAgencia",
        "status",
        "numQtdeLotes",
        "tipoOrigemSistema",
        "conteudoRemessa",
        "lotes"
})
@XmlRootElement(name = "Multiplas")
public class Multiplas {

    @XmlElement(required = true)
    protected String tipoArquivo;
    @XmlElement(required = true)
    protected String tipoInscricao;
    @XmlElement(required = true)
    protected String numeroInscricao;
    @XmlElement(required = true)
    protected String codConvenio;
    @XmlElement(required = true)
    protected String numParanTransmicao;
    @XmlElement(required = true)
    protected String dsAmbienteCliente;
    protected int numeroBanco;
    protected String numeroDigAgencia;
    @XmlElement(required = true)
    protected String numeroConta;
    @XmlElement(required = true)
    protected String dsDigConta;
    @XmlElement(required = true)
    protected String dsNomeEmpresa;
    @XmlElement(required = true)
    protected String dsNomeBanco;
    protected int numeroNsa;
    @XmlElement(required = true)
    protected Object dsResEmpresa;
    @XmlElement(required = true)
    protected String numeroVersao;
    @XmlElement(required = true)
    protected String horaGeracaoArq;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataGeracaoArq;
    @XmlElement(required = true)
    protected String numeroAgencia;
    protected int status;
    protected int numQtdeLotes;
    protected String tipoOrigemSistema;
    protected Object conteudoRemessa;
    protected List<Multiplas.Lotes> lotes;

    /**
     * Obtém o valor da propriedade tipoArquivo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoArquivo() {
        return tipoArquivo;
    }

    /**
     * Define o valor da propriedade tipoArquivo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoArquivo(String value) {
        this.tipoArquivo = value;
    }

    /**
     * Obtém o valor da propriedade tipoInscricao.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoInscricao() {
        return tipoInscricao;
    }

    /**
     * Define o valor da propriedade tipoInscricao.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoInscricao(String value) {
        this.tipoInscricao = value;
    }

    /**
     * Obtém o valor da propriedade numeroInscricao.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroInscricao() {
        return numeroInscricao;
    }

    /**
     * Define o valor da propriedade numeroInscricao.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroInscricao(String value) {
        this.numeroInscricao = value;
    }

    /**
     * Obtém o valor da propriedade codConvenio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodConvenio() {
        return codConvenio;
    }

    /**
     * Define o valor da propriedade codConvenio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodConvenio(String value) {
        this.codConvenio = value;
    }

    /**
     * Obtém o valor da propriedade numParanTransmicao.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumParanTransmicao() {
        return numParanTransmicao;
    }

    /**
     * Define o valor da propriedade numParanTransmicao.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumParanTransmicao(String value) {
        this.numParanTransmicao = value;
    }

    /**
     * Obtém o valor da propriedade dsAmbienteCliente.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDsAmbienteCliente() {
        return dsAmbienteCliente;
    }

    /**
     * Define o valor da propriedade dsAmbienteCliente.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDsAmbienteCliente(String value) {
        this.dsAmbienteCliente = value;
    }

    /**
     * Obtém o valor da propriedade numeroBanco.
     *
     */
    public int getNumeroBanco() {
        return numeroBanco;
    }

    /**
     * Define o valor da propriedade numeroBanco.
     *
     */
    public void setNumeroBanco(int value) {
        this.numeroBanco = value;
    }

    /**
     * Obtém o valor da propriedade numeroDigAgencia.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroDigAgencia() {
        return numeroDigAgencia;
    }

    /**
     * Define o valor da propriedade numeroDigAgencia.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroDigAgencia(String value) {
        this.numeroDigAgencia = value;
    }

    /**
     * Obtém o valor da propriedade numeroConta.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * Define o valor da propriedade numeroConta.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroConta(String value) {
        this.numeroConta = value;
    }

    /**
     * Obtém o valor da propriedade dsDigConta.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDsDigConta() {
        return dsDigConta;
    }

    /**
     * Define o valor da propriedade dsDigConta.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDsDigConta(String value) {
        this.dsDigConta = value;
    }

    /**
     * Obtém o valor da propriedade dsNomeEmpresa.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDsNomeEmpresa() {
        return dsNomeEmpresa;
    }

    /**
     * Define o valor da propriedade dsNomeEmpresa.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDsNomeEmpresa(String value) {
        this.dsNomeEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade dsNomeBanco.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDsNomeBanco() {
        return dsNomeBanco;
    }

    /**
     * Define o valor da propriedade dsNomeBanco.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDsNomeBanco(String value) {
        this.dsNomeBanco = value;
    }

    /**
     * Obtém o valor da propriedade numeroNsa.
     *
     */
    public int getNumeroNsa() {
        return numeroNsa;
    }

    /**
     * Define o valor da propriedade numeroNsa.
     *
     */
    public void setNumeroNsa(int value) {
        this.numeroNsa = value;
    }

    /**
     * Obtém o valor da propriedade dsResEmpresa.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getDsResEmpresa() {
        return dsResEmpresa;
    }

    /**
     * Define o valor da propriedade dsResEmpresa.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setDsResEmpresa(Object value) {
        this.dsResEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade numeroVersao.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroVersao() {
        return numeroVersao;
    }

    /**
     * Define o valor da propriedade numeroVersao.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroVersao(String value) {
        this.numeroVersao = value;
    }

    /**
     * Obtém o valor da propriedade horaGeracaoArq.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHoraGeracaoArq() {
        return horaGeracaoArq;
    }

    /**
     * Define o valor da propriedade horaGeracaoArq.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHoraGeracaoArq(String value) {
        this.horaGeracaoArq = value;
    }

    /**
     * Obtém o valor da propriedade dataGeracaoArq.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDataGeracaoArq() {
        return dataGeracaoArq;
    }

    /**
     * Define o valor da propriedade dataGeracaoArq.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDataGeracaoArq(XMLGregorianCalendar value) {
        this.dataGeracaoArq = value;
    }

    /**
     * Obtém o valor da propriedade numeroAgencia.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    /**
     * Define o valor da propriedade numeroAgencia.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroAgencia(String value) {
        this.numeroAgencia = value;
    }

    /**
     * Obtém o valor da propriedade status.
     *
     */
    public int getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     *
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade numQtdeLotes.
     *
     */
    public int getNumQtdeLotes() {
        return numQtdeLotes;
    }

    /**
     * Define o valor da propriedade numQtdeLotes.
     *
     */
    public void setNumQtdeLotes(int value) {
        this.numQtdeLotes = value;
    }

    /**
     * Obtém o valor da propriedade tipoOrigemSistema.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoOrigemSistema() {
        return tipoOrigemSistema;
    }

    /**
     * Define o valor da propriedade tipoOrigemSistema.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoOrigemSistema(String value) {
        this.tipoOrigemSistema = value;
    }

    /**
     * Obtém o valor da propriedade conteudoRemessa.
     *
     * @return
     *     possible object is
     *     {@link Object }
     *
     */
    public Object getConteudoRemessa() {
        return conteudoRemessa;
    }

    /**
     * Define o valor da propriedade conteudoRemessa.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     *
     */
    public void setConteudoRemessa(Object value) {
        this.conteudoRemessa = value;
    }

    /**
     * Gets the value of the lotes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Multiplas.Lotes }
     *
     *
     */
    public List<Multiplas.Lotes> getLotes() {
        if (lotes == null) {
            lotes = new ArrayList<Multiplas.Lotes>();
        }
        return this.lotes;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="numeroLoteServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="codTipoServico" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="codFormaLancamento" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="codTipoInscricao" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="numeroInscricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="codConvenio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="codTipoCompromisso" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="codCompromisso" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="dsParanTransmissao" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="numeroAgencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="numeroDigAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numeroConta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dsDigConta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dsNomeEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dsMsgAviso" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="dsLogradouro" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numeroLocal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dsComplemento" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="dsCidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numeroCep" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dsComplementoCep" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="dsSiglaEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numeroVersao" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="numeroValorTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="numeroValorTotalValido" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="numeroQtdeRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="conteudoLote" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="pagamentos" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codConvenio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codSituacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="codProduto" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="codFinalidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="numeroBancoCred" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numeroAgenciaCread" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="numeroAcAgenciaCred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numeroContaCred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numeroAcContaCred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dsNomeFavorecido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dsCpfCnpjFavorecido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numeroTipoPessoaFavorecido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="numeroValor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="numeroNossoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numeroSisNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numeroSeuNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codLote" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="finalidadeDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numeroLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dsComplemento" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="dsBairro" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="dsCidade" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="numeroCep" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="numeroCompleCep" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="dsSiglaEstado" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="tipoConta" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="dsLogradouro" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="CodMovimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="CodIdentProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodSegEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodSicap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DSNomePagador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DsCampoLivreBarra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NumDVCodBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numeroValorDocumento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="numeroValorTitulo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="numeroValorDesconto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="numeroValorMulta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="FatorVencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Camara" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Info01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Info02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dataPagamento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="QtdParcelas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="IndBloqueio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IndParcelamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PeriodoVencimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="NroParcela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="AvisoFavorecido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ocorrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="autenticacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numeroQtdeRegistroDetalhe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="segmento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="conteudoPagamento" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="detalhesB" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesC" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesD" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesE" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesF" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesH" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesI" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesJ" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesL" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesM" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesP" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesQ" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesR" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesS" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesT" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesU" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesW" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesY" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="detalhesZ" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "numeroLoteServico",
            "codTipoServico",
            "codFormaLancamento",
            "codTipoInscricao",
            "numeroInscricao",
            "codConvenio",
            "codTipoCompromisso",
            "codCompromisso",
            "dsParanTransmissao",
            "numeroAgencia",
            "numeroDigAgencia",
            "numeroConta",
            "dsDigConta",
            "dsNomeEmpresa",
            "dsMsgAviso",
            "dsLogradouro",
            "numeroLocal",
            "dsComplemento",
            "dsCidade",
            "numeroCep",
            "dsComplementoCep",
            "dsSiglaEstado",
            "numeroVersao",
            "numeroValorTotal",
            "numeroValorTotalValido",
            "numeroQtdeRegistro",
            "conteudoLote",
            "pagamentos"
    })
    public static class Lotes {

        protected int numeroLoteServico;
        protected int codTipoServico;
        protected int codFormaLancamento;
        protected int codTipoInscricao;
        @XmlElement(required = true)
        protected String numeroInscricao;
        @XmlElement(required = true)
        protected String codConvenio;
        protected int codTipoCompromisso;
        protected int codCompromisso;
        protected int dsParanTransmissao;
        protected int numeroAgencia;
        protected String numeroDigAgencia;
        @XmlElement(required = true)
        protected String numeroConta;
        @XmlElement(required = true)
        protected String dsDigConta;
        @XmlElement(required = true)
        protected String dsNomeEmpresa;
        @XmlElement(required = true)
        protected Object dsMsgAviso;
        @XmlElement(required = true)
        protected String dsLogradouro;
        @XmlElement(required = true)
        protected String numeroLocal;
        @XmlElement(required = true)
        protected Object dsComplemento;
        @XmlElement(required = true)
        protected String dsCidade;
        @XmlElement(required = true)
        protected String numeroCep;
        protected int dsComplementoCep;
        @XmlElement(required = true)
        protected String dsSiglaEstado;
        protected int numeroVersao;
        @XmlElement(required = true)
        protected BigDecimal numeroValorTotal;
        @XmlElement(required = true)
        protected BigDecimal numeroValorTotalValido;
        protected int numeroQtdeRegistro;
        protected Object conteudoLote;
        protected List<Multiplas.Lotes.Pagamentos> pagamentos;

        /**
         * Obtém o valor da propriedade numeroLoteServico.
         *
         */
        public int getNumeroLoteServico() {
            return numeroLoteServico;
        }

        /**
         * Define o valor da propriedade numeroLoteServico.
         *
         */
        public void setNumeroLoteServico(int value) {
            this.numeroLoteServico = value;
        }

        /**
         * Obtém o valor da propriedade codTipoServico.
         *
         */
        public int getCodTipoServico() {
            return codTipoServico;
        }

        /**
         * Define o valor da propriedade codTipoServico.
         *
         */
        public void setCodTipoServico(int value) {
            this.codTipoServico = value;
        }

        /**
         * Obtém o valor da propriedade codFormaLancamento.
         *
         */
        public int getCodFormaLancamento() {
            return codFormaLancamento;
        }

        /**
         * Define o valor da propriedade codFormaLancamento.
         *
         */
        public void setCodFormaLancamento(int value) {
            this.codFormaLancamento = value;
        }

        /**
         * Obtém o valor da propriedade codTipoInscricao.
         *
         */
        public int getCodTipoInscricao() {
            return codTipoInscricao;
        }

        /**
         * Define o valor da propriedade codTipoInscricao.
         *
         */
        public void setCodTipoInscricao(int value) {
            this.codTipoInscricao = value;
        }

        /**
         * Obtém o valor da propriedade numeroInscricao.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroInscricao() {
            return numeroInscricao;
        }

        /**
         * Define o valor da propriedade numeroInscricao.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroInscricao(String value) {
            this.numeroInscricao = value;
        }

        /**
         * Obtém o valor da propriedade codConvenio.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCodConvenio() {
            return codConvenio;
        }

        /**
         * Define o valor da propriedade codConvenio.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCodConvenio(String value) {
            this.codConvenio = value;
        }

        /**
         * Obtém o valor da propriedade codTipoCompromisso.
         *
         */
        public int getCodTipoCompromisso() {
            return codTipoCompromisso;
        }

        /**
         * Define o valor da propriedade codTipoCompromisso.
         *
         */
        public void setCodTipoCompromisso(int value) {
            this.codTipoCompromisso = value;
        }

        /**
         * Obtém o valor da propriedade codCompromisso.
         *
         */
        public int getCodCompromisso() {
            return codCompromisso;
        }

        /**
         * Define o valor da propriedade codCompromisso.
         *
         */
        public void setCodCompromisso(int value) {
            this.codCompromisso = value;
        }

        /**
         * Obtém o valor da propriedade dsParanTransmissao.
         *
         */
        public int getDsParanTransmissao() {
            return dsParanTransmissao;
        }

        /**
         * Define o valor da propriedade dsParanTransmissao.
         *
         */
        public void setDsParanTransmissao(int value) {
            this.dsParanTransmissao = value;
        }

        /**
         * Obtém o valor da propriedade numeroAgencia.
         *
         */
        public int getNumeroAgencia() {
            return numeroAgencia;
        }

        /**
         * Define o valor da propriedade numeroAgencia.
         *
         */
        public void setNumeroAgencia(int value) {
            this.numeroAgencia = value;
        }

        /**
         * Obtém o valor da propriedade numeroDigAgencia.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroDigAgencia() {
            return numeroDigAgencia;
        }

        /**
         * Define o valor da propriedade numeroDigAgencia.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroDigAgencia(String value) {
            this.numeroDigAgencia = value;
        }

        /**
         * Obtém o valor da propriedade numeroConta.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroConta() {
            return numeroConta;
        }

        /**
         * Define o valor da propriedade numeroConta.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroConta(String value) {
            this.numeroConta = value;
        }

        /**
         * Obtém o valor da propriedade dsDigConta.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDsDigConta() {
            return dsDigConta;
        }

        /**
         * Define o valor da propriedade dsDigConta.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDsDigConta(String value) {
            this.dsDigConta = value;
        }

        /**
         * Obtém o valor da propriedade dsNomeEmpresa.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDsNomeEmpresa() {
            return dsNomeEmpresa;
        }

        /**
         * Define o valor da propriedade dsNomeEmpresa.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDsNomeEmpresa(String value) {
            this.dsNomeEmpresa = value;
        }

        /**
         * Obtém o valor da propriedade dsMsgAviso.
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */
        public Object getDsMsgAviso() {
            return dsMsgAviso;
        }

        /**
         * Define o valor da propriedade dsMsgAviso.
         *
         * @param value
         *     allowed object is
         *     {@link Object }
         *
         */
        public void setDsMsgAviso(Object value) {
            this.dsMsgAviso = value;
        }

        /**
         * Obtém o valor da propriedade dsLogradouro.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDsLogradouro() {
            return dsLogradouro;
        }

        /**
         * Define o valor da propriedade dsLogradouro.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDsLogradouro(String value) {
            this.dsLogradouro = value;
        }

        /**
         * Obtém o valor da propriedade numeroLocal.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroLocal() {
            return numeroLocal;
        }

        /**
         * Define o valor da propriedade numeroLocal.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroLocal(String value) {
            this.numeroLocal = value;
        }

        /**
         * Obtém o valor da propriedade dsComplemento.
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */
        public Object getDsComplemento() {
            return dsComplemento;
        }

        /**
         * Define o valor da propriedade dsComplemento.
         *
         * @param value
         *     allowed object is
         *     {@link Object }
         *
         */
        public void setDsComplemento(Object value) {
            this.dsComplemento = value;
        }

        /**
         * Obtém o valor da propriedade dsCidade.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDsCidade() {
            return dsCidade;
        }

        /**
         * Define o valor da propriedade dsCidade.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDsCidade(String value) {
            this.dsCidade = value;
        }

        /**
         * Obtém o valor da propriedade numeroCep.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroCep() {
            return numeroCep;
        }

        /**
         * Define o valor da propriedade numeroCep.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroCep(String value) {
            this.numeroCep = value;
        }

        /**
         * Obtém o valor da propriedade dsComplementoCep.
         *
         */
        public int getDsComplementoCep() {
            return dsComplementoCep;
        }

        /**
         * Define o valor da propriedade dsComplementoCep.
         *
         */
        public void setDsComplementoCep(int value) {
            this.dsComplementoCep = value;
        }

        /**
         * Obtém o valor da propriedade dsSiglaEstado.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDsSiglaEstado() {
            return dsSiglaEstado;
        }

        /**
         * Define o valor da propriedade dsSiglaEstado.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDsSiglaEstado(String value) {
            this.dsSiglaEstado = value;
        }

        /**
         * Obtém o valor da propriedade numeroVersao.
         *
         */
        public int getNumeroVersao() {
            return numeroVersao;
        }

        /**
         * Define o valor da propriedade numeroVersao.
         *
         */
        public void setNumeroVersao(int value) {
            this.numeroVersao = value;
        }

        /**
         * Obtém o valor da propriedade numeroValorTotal.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getNumeroValorTotal() {
            return numeroValorTotal;
        }

        /**
         * Define o valor da propriedade numeroValorTotal.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setNumeroValorTotal(BigDecimal value) {
            this.numeroValorTotal = value;
        }

        /**
         * Obtém o valor da propriedade numeroValorTotalValido.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getNumeroValorTotalValido() {
            return numeroValorTotalValido;
        }

        /**
         * Define o valor da propriedade numeroValorTotalValido.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setNumeroValorTotalValido(BigDecimal value) {
            this.numeroValorTotalValido = value;
        }

        /**
         * Obtém o valor da propriedade numeroQtdeRegistro.
         *
         */
        public int getNumeroQtdeRegistro() {
            return numeroQtdeRegistro;
        }

        /**
         * Define o valor da propriedade numeroQtdeRegistro.
         *
         */
        public void setNumeroQtdeRegistro(int value) {
            this.numeroQtdeRegistro = value;
        }

        /**
         * Obtém o valor da propriedade conteudoLote.
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */
        public Object getConteudoLote() {
            return conteudoLote;
        }

        /**
         * Define o valor da propriedade conteudoLote.
         *
         * @param value
         *     allowed object is
         *     {@link Object }
         *
         */
        public void setConteudoLote(Object value) {
            this.conteudoLote = value;
        }

        /**
         * Gets the value of the pagamentos property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pagamentos property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPagamentos().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Multiplas.Lotes.Pagamentos }
         *
         *
         */
        public List<Multiplas.Lotes.Pagamentos> getPagamentos() {
            if (pagamentos == null) {
                pagamentos = new ArrayList<Multiplas.Lotes.Pagamentos>();
            }
            return this.pagamentos;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="codConvenio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codSituacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="codProduto" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="codFinalidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="numeroBancoCred" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numeroAgenciaCread" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="numeroAcAgenciaCred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numeroContaCred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numeroAcContaCred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dsNomeFavorecido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dsCpfCnpjFavorecido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numeroTipoPessoaFavorecido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="numeroValor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="numeroNossoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numeroSisNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numeroSeuNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codLote" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="finalidadeDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numeroLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dsComplemento" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="dsBairro" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="dsCidade" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="numeroCep" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="numeroCompleCep" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="dsSiglaEstado" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="tipoConta" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="dsLogradouro" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="CodMovimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="CodIdentProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodSegEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodSicap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DSNomePagador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DsCampoLivreBarra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NumDVCodBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numeroValorDocumento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="numeroValorTitulo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="numeroValorDesconto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="numeroValorMulta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="FatorVencimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Camara" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Info01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Info02" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dataPagamento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="QtdParcelas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="IndBloqueio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IndParcelamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PeriodoVencimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="NroParcela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="AvisoFavorecido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ocorrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="autenticacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numeroQtdeRegistroDetalhe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="segmento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="conteudoPagamento" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="detalhesB" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesC" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesD" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesE" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesF" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesH" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesI" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesJ" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesL" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesM" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesP" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesQ" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesR" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesS" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesT" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesU" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesW" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesY" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="detalhesZ" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "codConvenio",
                "codSituacao",
                "codProduto",
                "codFinalidade",
                "numeroBancoCred",
                "numeroAgenciaCread",
                "numeroAcAgenciaCred",
                "numeroContaCred",
                "numeroAcContaCred",
                "dsNomeFavorecido",
                "dsCpfCnpjFavorecido",
                "numeroTipoPessoaFavorecido",
                "numeroValor",
                "numeroNossoNumero",
                "numeroSisNumero",
                "numeroSeuNumero",
                "codLote",
                "finalidadeDoc",
                "numeroLocal",
                "dsComplemento",
                "dsBairro",
                "dsCidade",
                "numeroCep",
                "numeroCompleCep",
                "dsSiglaEstado",
                "tipoConta",
                "dsLogradouro",
                "codMovimento",
                "codIdentProduto",
                "codSegEmpresa",
                "codSicap",
                "dsNomePagador",
                "dsCampoLivreBarra",
                "numDVCodBarras",
                "numeroValorDocumento",
                "numeroValorTitulo",
                "numeroValorDesconto",
                "numeroValorMulta",
                "fatorVencimento",
                "camara",
                "info01",
                "info02",
                "dataVencimento",
                "dataPagamento",
                "qtdParcelas",
                "indBloqueio",
                "indParcelamento",
                "periodoVencimento",
                "nroParcela",
                "avisoFavorecido",
                "ocorrencia",
                "autenticacao",
                "numeroQtdeRegistroDetalhe",
                "segmento",
                "conteudoPagamento",
                "detalhesB",
                "detalhesC",
                "detalhesD",
                "detalhesE",
                "detalhesF",
                "detalhesH",
                "detalhesI",
                "detalhesJ",
                "detalhesL",
                "detalhesM",
                "detalhesP",
                "detalhesQ",
                "detalhesR",
                "detalhesS",
                "detalhesT",
                "detalhesU",
                "detalhesW",
                "detalhesY",
                "detalhesZ"
        })
        public static class Pagamentos {

            @XmlElement(required = true)
            protected String codConvenio;
            protected int codSituacao;
            protected int codProduto;
            protected int codFinalidade;
            @XmlElement(required = true)
            protected String numeroBancoCred;
            protected Integer numeroAgenciaCread;
            protected String numeroAcAgenciaCred;
            protected String numeroContaCred;
            protected String numeroAcContaCred;
            protected String dsNomeFavorecido;
            protected String dsCpfCnpjFavorecido;
            protected Integer numeroTipoPessoaFavorecido;
            protected Double numeroValor;
            protected String numeroNossoNumero;
            protected String numeroSisNumero;
            @XmlElement(required = true)
            protected String numeroSeuNumero;
            protected Integer codLote;
            protected String finalidadeDoc;
            protected String numeroLocal;
            protected Object dsComplemento;
            protected Object dsBairro;
            protected Object dsCidade;
            protected Integer numeroCep;
            protected Object numeroCompleCep;
            protected Object dsSiglaEstado;
            protected Object tipoConta;
            protected Object dsLogradouro;
            @XmlElement(name = "CodMovimento")
            protected Integer codMovimento;
            @XmlElement(name = "CodIdentProduto")
            protected String codIdentProduto;
            @XmlElement(name = "CodSegEmpresa")
            protected String codSegEmpresa;
            @XmlElement(name = "CodSicap")
            protected String codSicap;
            @XmlElement(name = "DSNomePagador")
            protected String dsNomePagador;
            @XmlElement(name = "DsCampoLivreBarra")
            protected String dsCampoLivreBarra;
            @XmlElement(name = "NumDVCodBarras")
            protected String numDVCodBarras;
            protected BigDecimal numeroValorDocumento;
            protected BigDecimal numeroValorTitulo;
            protected BigDecimal numeroValorDesconto;
            protected BigDecimal numeroValorMulta;
            @XmlElement(name = "FatorVencimento")
            protected String fatorVencimento;
            @XmlElement(name = "Camara")
            protected String camara;
            @XmlElement(name = "Info01")
            protected String info01;
            @XmlElement(name = "Info02")
            protected String info02;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dataVencimento;
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dataPagamento;
            @XmlElement(name = "QtdParcelas")
            protected Integer qtdParcelas;
            @XmlElement(name = "IndBloqueio")
            protected String indBloqueio;
            @XmlElement(name = "IndParcelamento", required = true)
            protected String indParcelamento;
            @XmlElement(name = "PeriodoVencimento")
            protected Integer periodoVencimento;
            @XmlElement(name = "NroParcela")
            protected Integer nroParcela;
            @XmlElement(name = "AvisoFavorecido")
            protected String avisoFavorecido;
            protected String ocorrencia;
            protected String autenticacao;
            protected Integer numeroQtdeRegistroDetalhe;
            @XmlElement(required = true)
            protected String segmento;
            protected Object conteudoPagamento;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesB> detalhesB;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesC> detalhesC;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesD> detalhesD;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesE> detalhesE;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesF> detalhesF;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesH> detalhesH;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesI> detalhesI;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesJ> detalhesJ;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesL> detalhesL;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesM> detalhesM;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesP> detalhesP;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesQ> detalhesQ;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesR> detalhesR;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesS> detalhesS;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesT> detalhesT;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesU> detalhesU;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesW> detalhesW;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesY> detalhesY;
            protected List<Multiplas.Lotes.Pagamentos.DetalhesZ> detalhesZ;

            /**
             * Obtém o valor da propriedade codConvenio.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCodConvenio() {
                return codConvenio;
            }

            /**
             * Define o valor da propriedade codConvenio.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCodConvenio(String value) {
                this.codConvenio = value;
            }

            /**
             * Obtém o valor da propriedade codSituacao.
             *
             */
            public int getCodSituacao() {
                return codSituacao;
            }

            /**
             * Define o valor da propriedade codSituacao.
             *
             */
            public void setCodSituacao(int value) {
                this.codSituacao = value;
            }

            /**
             * Obtém o valor da propriedade codProduto.
             *
             */
            public int getCodProduto() {
                return codProduto;
            }

            /**
             * Define o valor da propriedade codProduto.
             *
             */
            public void setCodProduto(int value) {
                this.codProduto = value;
            }

            /**
             * Obtém o valor da propriedade codFinalidade.
             *
             */
            public int getCodFinalidade() {
                return codFinalidade;
            }

            /**
             * Define o valor da propriedade codFinalidade.
             *
             */
            public void setCodFinalidade(int value) {
                this.codFinalidade = value;
            }

            /**
             * Obtém o valor da propriedade numeroBancoCred.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNumeroBancoCred() {
                return numeroBancoCred;
            }

            /**
             * Define o valor da propriedade numeroBancoCred.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNumeroBancoCred(String value) {
                this.numeroBancoCred = value;
            }

            /**
             * Obtém o valor da propriedade numeroAgenciaCread.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getNumeroAgenciaCread() {
                return numeroAgenciaCread;
            }

            /**
             * Define o valor da propriedade numeroAgenciaCread.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setNumeroAgenciaCread(Integer value) {
                this.numeroAgenciaCread = value;
            }

            /**
             * Obtém o valor da propriedade numeroAcAgenciaCred.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNumeroAcAgenciaCred() {
                return numeroAcAgenciaCred;
            }

            /**
             * Define o valor da propriedade numeroAcAgenciaCred.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNumeroAcAgenciaCred(String value) {
                this.numeroAcAgenciaCred = value;
            }

            /**
             * Obtém o valor da propriedade numeroContaCred.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNumeroContaCred() {
                return numeroContaCred;
            }

            /**
             * Define o valor da propriedade numeroContaCred.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNumeroContaCred(String value) {
                this.numeroContaCred = value;
            }

            /**
             * Obtém o valor da propriedade numeroAcContaCred.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNumeroAcContaCred() {
                return numeroAcContaCred;
            }

            /**
             * Define o valor da propriedade numeroAcContaCred.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNumeroAcContaCred(String value) {
                this.numeroAcContaCred = value;
            }

            /**
             * Obtém o valor da propriedade dsNomeFavorecido.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDsNomeFavorecido() {
                return dsNomeFavorecido;
            }

            /**
             * Define o valor da propriedade dsNomeFavorecido.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDsNomeFavorecido(String value) {
                this.dsNomeFavorecido = value;
            }

            /**
             * Obtém o valor da propriedade dsCpfCnpjFavorecido.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDsCpfCnpjFavorecido() {
                return dsCpfCnpjFavorecido;
            }

            /**
             * Define o valor da propriedade dsCpfCnpjFavorecido.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDsCpfCnpjFavorecido(String value) {
                this.dsCpfCnpjFavorecido = value;
            }

            /**
             * Obtém o valor da propriedade numeroTipoPessoaFavorecido.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getNumeroTipoPessoaFavorecido() {
                return numeroTipoPessoaFavorecido;
            }

            /**
             * Define o valor da propriedade numeroTipoPessoaFavorecido.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setNumeroTipoPessoaFavorecido(Integer value) {
                this.numeroTipoPessoaFavorecido = value;
            }

            /**
             * Obtém o valor da propriedade numeroValor.
             *
             * @return
             *     possible object is
             *     {@link Double }
             *
             */
            public Double getNumeroValor() {
                return numeroValor;
            }

            /**
             * Define o valor da propriedade numeroValor.
             *
             * @param value
             *     allowed object is
             *     {@link Double }
             *
             */
            public void setNumeroValor(Double value) {
                this.numeroValor = value;
            }

            /**
             * Obtém o valor da propriedade numeroNossoNumero.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNumeroNossoNumero() {
                return numeroNossoNumero;
            }

            /**
             * Define o valor da propriedade numeroNossoNumero.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNumeroNossoNumero(String value) {
                this.numeroNossoNumero = value;
            }

            /**
             * Obtém o valor da propriedade numeroSisNumero.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNumeroSisNumero() {
                return numeroSisNumero;
            }

            /**
             * Define o valor da propriedade numeroSisNumero.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNumeroSisNumero(String value) {
                this.numeroSisNumero = value;
            }

            /**
             * Obtém o valor da propriedade numeroSeuNumero.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNumeroSeuNumero() {
                return numeroSeuNumero;
            }

            /**
             * Define o valor da propriedade numeroSeuNumero.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNumeroSeuNumero(String value) {
                this.numeroSeuNumero = value;
            }

            /**
             * Obtém o valor da propriedade codLote.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getCodLote() {
                return codLote;
            }

            /**
             * Define o valor da propriedade codLote.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setCodLote(Integer value) {
                this.codLote = value;
            }

            /**
             * Obtém o valor da propriedade finalidadeDoc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFinalidadeDoc() {
                return finalidadeDoc;
            }

            /**
             * Define o valor da propriedade finalidadeDoc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFinalidadeDoc(String value) {
                this.finalidadeDoc = value;
            }

            /**
             * Obtém o valor da propriedade numeroLocal.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNumeroLocal() {
                return numeroLocal;
            }

            /**
             * Define o valor da propriedade numeroLocal.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNumeroLocal(String value) {
                this.numeroLocal = value;
            }

            /**
             * Obtém o valor da propriedade dsComplemento.
             *
             * @return
             *     possible object is
             *     {@link Object }
             *
             */
            public Object getDsComplemento() {
                return dsComplemento;
            }

            /**
             * Define o valor da propriedade dsComplemento.
             *
             * @param value
             *     allowed object is
             *     {@link Object }
             *
             */
            public void setDsComplemento(Object value) {
                this.dsComplemento = value;
            }

            /**
             * Obtém o valor da propriedade dsBairro.
             *
             * @return
             *     possible object is
             *     {@link Object }
             *
             */
            public Object getDsBairro() {
                return dsBairro;
            }

            /**
             * Define o valor da propriedade dsBairro.
             *
             * @param value
             *     allowed object is
             *     {@link Object }
             *
             */
            public void setDsBairro(Object value) {
                this.dsBairro = value;
            }

            /**
             * Obtém o valor da propriedade dsCidade.
             *
             * @return
             *     possible object is
             *     {@link Object }
             *
             */
            public Object getDsCidade() {
                return dsCidade;
            }

            /**
             * Define o valor da propriedade dsCidade.
             *
             * @param value
             *     allowed object is
             *     {@link Object }
             *
             */
            public void setDsCidade(Object value) {
                this.dsCidade = value;
            }

            /**
             * Obtém o valor da propriedade numeroCep.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getNumeroCep() {
                return numeroCep;
            }

            /**
             * Define o valor da propriedade numeroCep.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setNumeroCep(Integer value) {
                this.numeroCep = value;
            }

            /**
             * Obtém o valor da propriedade numeroCompleCep.
             *
             * @return
             *     possible object is
             *     {@link Object }
             *
             */
            public Object getNumeroCompleCep() {
                return numeroCompleCep;
            }

            /**
             * Define o valor da propriedade numeroCompleCep.
             *
             * @param value
             *     allowed object is
             *     {@link Object }
             *
             */
            public void setNumeroCompleCep(Object value) {
                this.numeroCompleCep = value;
            }

            /**
             * Obtém o valor da propriedade dsSiglaEstado.
             *
             * @return
             *     possible object is
             *     {@link Object }
             *
             */
            public Object getDsSiglaEstado() {
                return dsSiglaEstado;
            }

            /**
             * Define o valor da propriedade dsSiglaEstado.
             *
             * @param value
             *     allowed object is
             *     {@link Object }
             *
             */
            public void setDsSiglaEstado(Object value) {
                this.dsSiglaEstado = value;
            }

            /**
             * Obtém o valor da propriedade tipoConta.
             *
             * @return
             *     possible object is
             *     {@link Object }
             *
             */
            public Object getTipoConta() {
                return tipoConta;
            }

            /**
             * Define o valor da propriedade tipoConta.
             *
             * @param value
             *     allowed object is
             *     {@link Object }
             *
             */
            public void setTipoConta(Object value) {
                this.tipoConta = value;
            }

            /**
             * Obtém o valor da propriedade dsLogradouro.
             *
             * @return
             *     possible object is
             *     {@link Object }
             *
             */
            public Object getDsLogradouro() {
                return dsLogradouro;
            }

            /**
             * Define o valor da propriedade dsLogradouro.
             *
             * @param value
             *     allowed object is
             *     {@link Object }
             *
             */
            public void setDsLogradouro(Object value) {
                this.dsLogradouro = value;
            }

            /**
             * Obtém o valor da propriedade codMovimento.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getCodMovimento() {
                return codMovimento;
            }

            /**
             * Define o valor da propriedade codMovimento.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setCodMovimento(Integer value) {
                this.codMovimento = value;
            }

            /**
             * Obtém o valor da propriedade codIdentProduto.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCodIdentProduto() {
                return codIdentProduto;
            }

            /**
             * Define o valor da propriedade codIdentProduto.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCodIdentProduto(String value) {
                this.codIdentProduto = value;
            }

            /**
             * Obtém o valor da propriedade codSegEmpresa.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCodSegEmpresa() {
                return codSegEmpresa;
            }

            /**
             * Define o valor da propriedade codSegEmpresa.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCodSegEmpresa(String value) {
                this.codSegEmpresa = value;
            }

            /**
             * Obtém o valor da propriedade codSicap.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCodSicap() {
                return codSicap;
            }

            /**
             * Define o valor da propriedade codSicap.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCodSicap(String value) {
                this.codSicap = value;
            }

            /**
             * Obtém o valor da propriedade dsNomePagador.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDSNomePagador() {
                return dsNomePagador;
            }

            /**
             * Define o valor da propriedade dsNomePagador.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDSNomePagador(String value) {
                this.dsNomePagador = value;
            }

            /**
             * Obtém o valor da propriedade dsCampoLivreBarra.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDsCampoLivreBarra() {
                return dsCampoLivreBarra;
            }

            /**
             * Define o valor da propriedade dsCampoLivreBarra.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDsCampoLivreBarra(String value) {
                this.dsCampoLivreBarra = value;
            }

            /**
             * Obtém o valor da propriedade numDVCodBarras.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNumDVCodBarras() {
                return numDVCodBarras;
            }

            /**
             * Define o valor da propriedade numDVCodBarras.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNumDVCodBarras(String value) {
                this.numDVCodBarras = value;
            }

            /**
             * Obtém o valor da propriedade numeroValorDocumento.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getNumeroValorDocumento() {
                return numeroValorDocumento;
            }

            /**
             * Define o valor da propriedade numeroValorDocumento.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setNumeroValorDocumento(BigDecimal value) {
                this.numeroValorDocumento = value;
            }

            /**
             * Obtém o valor da propriedade numeroValorTitulo.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getNumeroValorTitulo() {
                return numeroValorTitulo;
            }

            /**
             * Define o valor da propriedade numeroValorTitulo.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setNumeroValorTitulo(BigDecimal value) {
                this.numeroValorTitulo = value;
            }

            /**
             * Obtém o valor da propriedade numeroValorDesconto.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getNumeroValorDesconto() {
                return numeroValorDesconto;
            }

            /**
             * Define o valor da propriedade numeroValorDesconto.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setNumeroValorDesconto(BigDecimal value) {
                this.numeroValorDesconto = value;
            }

            /**
             * Obtém o valor da propriedade numeroValorMulta.
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getNumeroValorMulta() {
                return numeroValorMulta;
            }

            /**
             * Define o valor da propriedade numeroValorMulta.
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setNumeroValorMulta(BigDecimal value) {
                this.numeroValorMulta = value;
            }

            /**
             * Obtém o valor da propriedade fatorVencimento.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFatorVencimento() {
                return fatorVencimento;
            }

            /**
             * Define o valor da propriedade fatorVencimento.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFatorVencimento(String value) {
                this.fatorVencimento = value;
            }

            /**
             * Obtém o valor da propriedade camara.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCamara() {
                return camara;
            }

            /**
             * Define o valor da propriedade camara.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCamara(String value) {
                this.camara = value;
            }

            /**
             * Obtém o valor da propriedade info01.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getInfo01() {
                return info01;
            }

            /**
             * Define o valor da propriedade info01.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setInfo01(String value) {
                this.info01 = value;
            }

            /**
             * Obtém o valor da propriedade info02.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getInfo02() {
                return info02;
            }

            /**
             * Define o valor da propriedade info02.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setInfo02(String value) {
                this.info02 = value;
            }

            /**
             * Obtém o valor da propriedade dataVencimento.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getDataVencimento() {
                return dataVencimento;
            }

            /**
             * Define o valor da propriedade dataVencimento.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setDataVencimento(XMLGregorianCalendar value) {
                this.dataVencimento = value;
            }

            /**
             * Obtém o valor da propriedade dataPagamento.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getDataPagamento() {
                return dataPagamento;
            }

            /**
             * Define o valor da propriedade dataPagamento.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setDataPagamento(XMLGregorianCalendar value) {
                this.dataPagamento = value;
            }

            /**
             * Obtém o valor da propriedade qtdParcelas.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getQtdParcelas() {
                return qtdParcelas;
            }

            /**
             * Define o valor da propriedade qtdParcelas.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setQtdParcelas(Integer value) {
                this.qtdParcelas = value;
            }

            /**
             * Obtém o valor da propriedade indBloqueio.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIndBloqueio() {
                return indBloqueio;
            }

            /**
             * Define o valor da propriedade indBloqueio.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIndBloqueio(String value) {
                this.indBloqueio = value;
            }

            /**
             * Obtém o valor da propriedade indParcelamento.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIndParcelamento() {
                return indParcelamento;
            }

            /**
             * Define o valor da propriedade indParcelamento.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIndParcelamento(String value) {
                this.indParcelamento = value;
            }

            /**
             * Obtém o valor da propriedade periodoVencimento.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getPeriodoVencimento() {
                return periodoVencimento;
            }

            /**
             * Define o valor da propriedade periodoVencimento.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setPeriodoVencimento(Integer value) {
                this.periodoVencimento = value;
            }

            /**
             * Obtém o valor da propriedade nroParcela.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getNroParcela() {
                return nroParcela;
            }

            /**
             * Define o valor da propriedade nroParcela.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setNroParcela(Integer value) {
                this.nroParcela = value;
            }

            /**
             * Obtém o valor da propriedade avisoFavorecido.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAvisoFavorecido() {
                return avisoFavorecido;
            }

            /**
             * Define o valor da propriedade avisoFavorecido.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAvisoFavorecido(String value) {
                this.avisoFavorecido = value;
            }

            /**
             * Obtém o valor da propriedade ocorrencia.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOcorrencia() {
                return ocorrencia;
            }

            /**
             * Define o valor da propriedade ocorrencia.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOcorrencia(String value) {
                this.ocorrencia = value;
            }

            /**
             * Obtém o valor da propriedade autenticacao.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAutenticacao() {
                return autenticacao;
            }

            /**
             * Define o valor da propriedade autenticacao.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAutenticacao(String value) {
                this.autenticacao = value;
            }

            /**
             * Obtém o valor da propriedade numeroQtdeRegistroDetalhe.
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getNumeroQtdeRegistroDetalhe() {
                return numeroQtdeRegistroDetalhe;
            }

            /**
             * Define o valor da propriedade numeroQtdeRegistroDetalhe.
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setNumeroQtdeRegistroDetalhe(Integer value) {
                this.numeroQtdeRegistroDetalhe = value;
            }

            /**
             * Obtém o valor da propriedade segmento.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSegmento() {
                return segmento;
            }

            /**
             * Define o valor da propriedade segmento.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSegmento(String value) {
                this.segmento = value;
            }

            /**
             * Obtém o valor da propriedade conteudoPagamento.
             *
             * @return
             *     possible object is
             *     {@link Object }
             *
             */
            public Object getConteudoPagamento() {
                return conteudoPagamento;
            }

            /**
             * Define o valor da propriedade conteudoPagamento.
             *
             * @param value
             *     allowed object is
             *     {@link Object }
             *
             */
            public void setConteudoPagamento(Object value) {
                this.conteudoPagamento = value;
            }

            /**
             * Gets the value of the detalhesB property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesB property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesB().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesB }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesB> getDetalhesB() {
                if (detalhesB == null) {
                    detalhesB = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesB>();
                }
                return this.detalhesB;
            }

            /**
             * Gets the value of the detalhesC property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesC property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesC().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesC }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesC> getDetalhesC() {
                if (detalhesC == null) {
                    detalhesC = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesC>();
                }
                return this.detalhesC;
            }

            /**
             * Gets the value of the detalhesD property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesD property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesD().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesD }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesD> getDetalhesD() {
                if (detalhesD == null) {
                    detalhesD = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesD>();
                }
                return this.detalhesD;
            }

            /**
             * Gets the value of the detalhesE property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesE property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesE().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesE }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesE> getDetalhesE() {
                if (detalhesE == null) {
                    detalhesE = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesE>();
                }
                return this.detalhesE;
            }

            /**
             * Gets the value of the detalhesF property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesF property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesF().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesF }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesF> getDetalhesF() {
                if (detalhesF == null) {
                    detalhesF = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesF>();
                }
                return this.detalhesF;
            }

            /**
             * Gets the value of the detalhesH property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesH property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesH().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesH }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesH> getDetalhesH() {
                if (detalhesH == null) {
                    detalhesH = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesH>();
                }
                return this.detalhesH;
            }

            /**
             * Gets the value of the detalhesI property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesI property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesI().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesI }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesI> getDetalhesI() {
                if (detalhesI == null) {
                    detalhesI = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesI>();
                }
                return this.detalhesI;
            }

            /**
             * Gets the value of the detalhesJ property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesJ property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesJ().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesJ }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesJ> getDetalhesJ() {
                if (detalhesJ == null) {
                    detalhesJ = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesJ>();
                }
                return this.detalhesJ;
            }

            /**
             * Gets the value of the detalhesL property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesL property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesL().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesL }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesL> getDetalhesL() {
                if (detalhesL == null) {
                    detalhesL = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesL>();
                }
                return this.detalhesL;
            }

            /**
             * Gets the value of the detalhesM property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesM property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesM().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesM }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesM> getDetalhesM() {
                if (detalhesM == null) {
                    detalhesM = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesM>();
                }
                return this.detalhesM;
            }

            /**
             * Gets the value of the detalhesP property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesP property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesP().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesP }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesP> getDetalhesP() {
                if (detalhesP == null) {
                    detalhesP = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesP>();
                }
                return this.detalhesP;
            }

            /**
             * Gets the value of the detalhesQ property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesQ property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesQ().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesQ }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesQ> getDetalhesQ() {
                if (detalhesQ == null) {
                    detalhesQ = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesQ>();
                }
                return this.detalhesQ;
            }

            /**
             * Gets the value of the detalhesR property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesR property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesR().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesR }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesR> getDetalhesR() {
                if (detalhesR == null) {
                    detalhesR = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesR>();
                }
                return this.detalhesR;
            }

            /**
             * Gets the value of the detalhesS property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesS property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesS().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesS }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesS> getDetalhesS() {
                if (detalhesS == null) {
                    detalhesS = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesS>();
                }
                return this.detalhesS;
            }

            /**
             * Gets the value of the detalhesT property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesT property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesT().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesT }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesT> getDetalhesT() {
                if (detalhesT == null) {
                    detalhesT = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesT>();
                }
                return this.detalhesT;
            }

            /**
             * Gets the value of the detalhesU property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesU property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesU().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesU }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesU> getDetalhesU() {
                if (detalhesU == null) {
                    detalhesU = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesU>();
                }
                return this.detalhesU;
            }

            /**
             * Gets the value of the detalhesW property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesW property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesW().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesW }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesW> getDetalhesW() {
                if (detalhesW == null) {
                    detalhesW = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesW>();
                }
                return this.detalhesW;
            }

            /**
             * Gets the value of the detalhesY property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesY property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesY().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesY }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesY> getDetalhesY() {
                if (detalhesY == null) {
                    detalhesY = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesY>();
                }
                return this.detalhesY;
            }

            /**
             * Gets the value of the detalhesZ property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalhesZ property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalhesZ().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Multiplas.Lotes.Pagamentos.DetalhesZ }
             *
             *
             */
            public List<Multiplas.Lotes.Pagamentos.DetalhesZ> getDetalhesZ() {
                if (detalhesZ == null) {
                    detalhesZ = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesZ>();
                }
                return this.detalhesZ;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesB {

                protected List<Object> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 *
                 *
                 */
                public List<Object> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Object>();
                    }
                    return this.conteudo;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesC {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesC.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesC.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesC.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesC.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesD {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesD.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesD.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesD.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesD.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesE {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesE.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesE.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesE.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesE.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesF {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesF.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesF.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesF.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesF.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesH {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesH.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesH.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesH.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesH.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesI {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesI.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesI.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesI.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesI.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesJ {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesJ.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesJ.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesJ.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesJ.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesL {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesL.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesL.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesL.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesL.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesM {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesM.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesM.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesM.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesM.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesP {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesP.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesP.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesP.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesP.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesQ {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesQ.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesQ.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesQ.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesQ.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesR {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesR.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesR.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesR.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesR.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesS {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesS.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesS.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesS.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesS.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesT {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesT.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesT.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesT.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesT.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesU {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesU.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesU.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesU.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesU.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesW {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesW.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesW.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesW.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesW.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesY {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesY.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesY.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesY.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesY.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="conteudo" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "conteudo"
            })
            public static class DetalhesZ {

                protected List<Multiplas.Lotes.Pagamentos.DetalhesZ.Conteudo> conteudo;

                /**
                 * Gets the value of the conteudo property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the conteudo property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConteudo().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Multiplas.Lotes.Pagamentos.DetalhesZ.Conteudo }
                 *
                 *
                 */
                public List<Multiplas.Lotes.Pagamentos.DetalhesZ.Conteudo> getConteudo() {
                    if (conteudo == null) {
                        conteudo = new ArrayList<Multiplas.Lotes.Pagamentos.DetalhesZ.Conteudo>();
                    }
                    return this.conteudo;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Conteudo {


                }

            }

        }

    }

}

