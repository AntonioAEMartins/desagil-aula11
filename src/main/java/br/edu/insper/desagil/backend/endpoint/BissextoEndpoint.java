package br.edu.insper.desagil.backend.endpoint;

import br.pro.hashi.nfp.rest.server.Args;
import br.pro.hashi.nfp.rest.server.Endpoint;

public class BissextoEndpoint extends Endpoint<Boolean>{
	public BissextoEndpoint() {
		super("/bissexto");
	}
	
	@Override
	public Boolean get(Args args) {
		int ano = args.getInt("a");
		if(ano % 100 == 0) {
			return false;
		}
		else if ((ano % 400 == 0) && (ano % 4 == 0)) {
			return true;
		}
		return false;
	}
}