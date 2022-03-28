package br.edu.insper.desagil.backend.endpoint;

import br.pro.hashi.nfp.rest.server.Args;
import br.pro.hashi.nfp.rest.server.Endpoint;

public class SomaEndpoint extends Endpoint<Integer> {
	public SomaEndpoint() {
		super("/soma");
	}

	@Override
	public Integer get(Args args) {
		int a = args.getInt("a");
		int b = args.getInt("b");
		return a + b;
	}
}
