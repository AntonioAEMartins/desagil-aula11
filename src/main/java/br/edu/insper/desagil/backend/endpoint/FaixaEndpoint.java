package br.edu.insper.desagil.backend.endpoint;

import br.pro.hashi.nfp.rest.server.Args;
import br.pro.hashi.nfp.rest.server.Endpoint;

public class FaixaEndpoint extends Endpoint<String>{
	public FaixaEndpoint() {
		super("/faixa");
	}
	
	@Override
	public String get(Args args) {
		int a = args.getInt("a");
		if (a < 18) {
			return "Jovem";
		} else if (a < 60) {
			return "Adult";
		} else {
			return "Ma'am";
		}
	}
}
