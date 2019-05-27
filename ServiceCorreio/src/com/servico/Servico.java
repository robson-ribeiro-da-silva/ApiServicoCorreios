package com.servico;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.rpc.ServiceException;

import org.tempuri.CResultado;
import org.tempuri.CServico;
import org.tempuri.CalcPrecoPrazoWS;
import org.tempuri.CalcPrecoPrazoWSLocator;
import org.tempuri.CalcPrecoPrazoWSSoap;

import com.model.PrecoPrazo;


@Path("/servico")
public class Servico {

	/*
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{nome}")
	public String olaJson(@PathParam("nome") String nome){
		
		
		String response =  "{\"nome\":\""+nome+"\"}";
		
		return response;
	}*/
	
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{nCdEmpresa}/{sDsSenha}/{nCdServico}/{sCepOrigem}/{sCepDestino}/{nVlPeso}/{nCdFormato}/{nVlComprimento}/{nVlAltura}/{nVlLargura}/{nVlDiametro}/{sCdMaoPropria}/{nVlValorDeclarado}/{sCdAvisoRecebimento}")
	public String servico(@PathParam("nCdEmpresa") String nnCdEmpresa, @PathParam("sDsSenha") String nsDsSenha, @PathParam("nCdServico") String nnCdServico,
			@PathParam("sCepOrigem") String nsCepOrigem, @PathParam("sCepDestino") String nsCepDestino, @PathParam("nVlPeso") String nnVlPeso,
			@PathParam("nCdFormato") int nnCdFormato, @PathParam("nVlComprimento") BigDecimal nnVlComprimento,  @PathParam("nVlAltura") BigDecimal nnVlAltura,
			@PathParam("nVlLargura") BigDecimal nnVlLargura, @PathParam("nVlDiametro") BigDecimal nnVlDiametro, @PathParam("sCdMaoPropria") String nsCdMaoPropria,
			@PathParam("nVlValorDeclarado") BigDecimal nnVlValorDeclarado, @PathParam("sCdAvisoRecebimento") String nsCdAvisoRecebimento) throws ServiceException, RemoteException{
		
		CalcPrecoPrazoWSSoap interfaceProxy;
		CalcPrecoPrazoWS calcPrecoPrazo = new CalcPrecoPrazoWSLocator();
		interfaceProxy = calcPrecoPrazo.getCalcPrecoPrazoWSSoap();
		
		
		String nCdEmpresa = nnCdEmpresa;//teclado.nextLine();
		String sDsSenha = nsDsSenha;//teclado.nextLine();
		String nCdServico = nnCdServico;//teclado.nextLine(); //PAC 41106 | SEDEX 40010
		String sCepOrigem = nsCepOrigem; //teclado.nextLine(); //"01310909";
		String sCepDestino = nsCepDestino;//teclado.nextLine(); //"59856000";
		String nVlPeso = nnVlPeso;//teclado.nextLine(); //"5,5";
		int nCdFormato = nnCdFormato;//teclado.nextInt(); //1; //1 caixa/pacote | 2 rolo/prisma | 3 envelope
		BigDecimal nVlComprimento = nnVlComprimento; // teclado.nextBigDecimal(); //new BigDecimal(16.0);
		BigDecimal nVlAltura = nnVlAltura;// teclado.nextBigDecimal(); //new BigDecimal(20.0);
		BigDecimal nVlLargura = nnVlLargura; //teclado.nextBigDecimal(); //new BigDecimal(20.0);
		BigDecimal nVlDiametro = nnVlDiametro;// teclado.nextBigDecimal(); //new BigDecimal(50.0);
		String sCdMaoPropria = nsCdMaoPropria; //teclado.nextLine(); //"S";
		BigDecimal nVlValorDeclarado = nnVlValorDeclarado; //teclado.nextBigDecimal(); //new BigDecimal(0);
		String sCdAvisoRecebimento = nsCdAvisoRecebimento;// teclado.nextLine(); //"S";
		
		CResultado resultado = interfaceProxy.calcPrecoPrazo(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura,nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento);
		
	
		CServico[] lista = resultado.getServicos();
		String prazo = "";
        String preco = "";
		
        for (CServico cServico : lista) {
            prazo = cServico.getPrazoEntrega();
            preco = cServico.getValor();
        }
		
		
		String response =  "{\"prazo\":\""+prazo+"\",\"preco\":\""+preco+"\"}";
		
		
		return response;
	} */
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{nCdServico}/{sCepOrigem}/{sCepDestino}/{nVlPeso}/{nCdFormato}/{nVlComprimento}/{nVlAltura}/{nVlLargura}/{nVlDiametro}/{sCdMaoPropria}/{nVlValorDeclarado}/{sCdAvisoRecebimento}")
	public String servico(@PathParam("nCdServico") String nnCdServico,
			@PathParam("sCepOrigem") String nsCepOrigem, @PathParam("sCepDestino") String nsCepDestino, @PathParam("nVlPeso") String nnVlPeso,
			@PathParam("nCdFormato") int nnCdFormato, @PathParam("nVlComprimento") BigDecimal nnVlComprimento,  @PathParam("nVlAltura") BigDecimal nnVlAltura,
			@PathParam("nVlLargura") BigDecimal nnVlLargura, @PathParam("nVlDiametro") BigDecimal nnVlDiametro, @PathParam("sCdMaoPropria") String nsCdMaoPropria,
			@PathParam("nVlValorDeclarado") BigDecimal nnVlValorDeclarado, @PathParam("sCdAvisoRecebimento") String nsCdAvisoRecebimento) throws ServiceException, RemoteException{
		
		CalcPrecoPrazoWSSoap interfaceProxy;
		CalcPrecoPrazoWS calcPrecoPrazo = new CalcPrecoPrazoWSLocator();
		interfaceProxy = calcPrecoPrazo.getCalcPrecoPrazoWSSoap();
		
		
		String nCdEmpresa = "";//teclado.nextLine();
		String sDsSenha = "";//teclado.nextLine();
		String nCdServico = nnCdServico;//teclado.nextLine(); //PAC 41106 | SEDEX 40010
		String sCepOrigem = nsCepOrigem; //teclado.nextLine(); //"01310909";
		String sCepDestino = nsCepDestino;//teclado.nextLine(); //"59856000";
		String nVlPeso = nnVlPeso;//teclado.nextLine(); //"5,5";
		int nCdFormato = nnCdFormato;//teclado.nextInt(); //1; //1 caixa/pacote | 2 rolo/prisma | 3 envelope
		BigDecimal nVlComprimento = nnVlComprimento; // teclado.nextBigDecimal(); //new BigDecimal(16.0);
		BigDecimal nVlAltura = nnVlAltura;// teclado.nextBigDecimal(); //new BigDecimal(20.0);
		BigDecimal nVlLargura = nnVlLargura; //teclado.nextBigDecimal(); //new BigDecimal(20.0);
		BigDecimal nVlDiametro = nnVlDiametro;// teclado.nextBigDecimal(); //new BigDecimal(50.0);
		String sCdMaoPropria = nsCdMaoPropria; //teclado.nextLine(); //"S";
		BigDecimal nVlValorDeclarado = nnVlValorDeclarado; //teclado.nextBigDecimal(); //new BigDecimal(0);
		String sCdAvisoRecebimento = nsCdAvisoRecebimento;// teclado.nextLine(); //"S";
		
		CResultado resultado = interfaceProxy.calcPrecoPrazo(nCdEmpresa, sDsSenha, nCdServico, sCepOrigem, sCepDestino, nVlPeso, nCdFormato, nVlComprimento, nVlAltura,nVlLargura, nVlDiametro, sCdMaoPropria, nVlValorDeclarado, sCdAvisoRecebimento);
		
	
		CServico[] lista = resultado.getServicos();
		String prazo = "";
        String preco = "";
		
        for (CServico cServico : lista) {
            prazo = cServico.getPrazoEntrega();
            preco = cServico.getValor();
        }
		
		
		String response =  "{\"prazo\":\""+prazo+"\",\"preco\":\""+preco+"\"}";
	
		return response;
	}
}
