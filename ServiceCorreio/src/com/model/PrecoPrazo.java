package com.model;

import java.math.BigDecimal;

public class PrecoPrazo {
	
	private String nCdEmpresa;
	private String sDsSenha;
	private String nCdServico;
	private String sCepOrigem;
	private String sCepDestino;
	private String nVlPeso;
	int nCdFormato;
	private BigDecimal nVlComprimento;
	private BigDecimal nVlAltura;
	private BigDecimal nVlLargura;
	private BigDecimal nVlDiametro;
	private String sCdMaoPropria;
	private BigDecimal nVlValorDeclarado;
	private String sCdAvisoRecebimento;
	
	
	
	public PrecoPrazo(String nCdEmpresa, String sDsSenha, String nCdServico, String sCepOrigem, String sCepDestino,
			String nVlPeso, int nCdFormato, BigDecimal nVlComprimento, BigDecimal nVlAltura, BigDecimal nVlLargura,
			BigDecimal nVlDiametro, String sCdMaoPropria, BigDecimal nVlValorDeclarado, String sCdAvisoRecebimento) {
		super();
		this.nCdEmpresa = nCdEmpresa;
		this.sDsSenha = sDsSenha;
		this.nCdServico = nCdServico;
		this.sCepOrigem = sCepOrigem;
		this.sCepDestino = sCepDestino;
		this.nVlPeso = nVlPeso;
		this.nCdFormato = nCdFormato;
		this.nVlComprimento = nVlComprimento;
		this.nVlAltura = nVlAltura;
		this.nVlLargura = nVlLargura;
		this.nVlDiametro = nVlDiametro;
		this.sCdMaoPropria = sCdMaoPropria;
		this.nVlValorDeclarado = nVlValorDeclarado;
		this.sCdAvisoRecebimento = sCdAvisoRecebimento;
	}
	
	public String getnCdEmpresa() {
		return nCdEmpresa;
	}
	public void setnCdEmpresa(String nCdEmpresa) {
		this.nCdEmpresa = nCdEmpresa;
	}
	public String getsDsSenha() {
		return sDsSenha;
	}
	public void setsDsSenha(String sDsSenha) {
		this.sDsSenha = sDsSenha;
	}
	public String getnCdServico() {
		return nCdServico;
	}
	public void setnCdServico(String nCdServico) {
		this.nCdServico = nCdServico;
	}
	public String getsCepOrigem() {
		return sCepOrigem;
	}
	public void setsCepOrigem(String sCepOrigem) {
		this.sCepOrigem = sCepOrigem;
	}
	public String getsCepDestino() {
		return sCepDestino;
	}
	public void setsCepDestino(String sCepDestino) {
		this.sCepDestino = sCepDestino;
	}
	public String getnVlPeso() {
		return nVlPeso;
	}
	public void setnVlPeso(String nVlPeso) {
		this.nVlPeso = nVlPeso;
	}
	public int getnCdFormato() {
		return nCdFormato;
	}
	public void setnCdFormato(int nCdFormato) {
		this.nCdFormato = nCdFormato;
	}
	public BigDecimal getnVlComprimento() {
		return nVlComprimento;
	}
	public void setnVlComprimento(BigDecimal nVlComprimento) {
		this.nVlComprimento = nVlComprimento;
	}
	public BigDecimal getnVlAltura() {
		return nVlAltura;
	}
	public void setnVlAltura(BigDecimal nVlAltura) {
		this.nVlAltura = nVlAltura;
	}
	public BigDecimal getnVlLargura() {
		return nVlLargura;
	}
	public void setnVlLargura(BigDecimal nVlLargura) {
		this.nVlLargura = nVlLargura;
	}
	public BigDecimal getnVlDiametro() {
		return nVlDiametro;
	}
	public void setnVlDiametro(BigDecimal nVlDiametro) {
		this.nVlDiametro = nVlDiametro;
	}
	public String getsCdMaoPropria() {
		return sCdMaoPropria;
	}
	public void setsCdMaoPropria(String sCdMaoPropria) {
		this.sCdMaoPropria = sCdMaoPropria;
	}
	public BigDecimal getnVlValorDeclarado() {
		return nVlValorDeclarado;
	}
	public void setnVlValorDeclarado(BigDecimal nVlValorDeclarado) {
		this.nVlValorDeclarado = nVlValorDeclarado;
	}
	public String getsCdAvisoRecebimento() {
		return sCdAvisoRecebimento;
	}
	public void setsCdAvisoRecebimento(String sCdAvisoRecebimento) {
		this.sCdAvisoRecebimento = sCdAvisoRecebimento;
	}
	
	

}
