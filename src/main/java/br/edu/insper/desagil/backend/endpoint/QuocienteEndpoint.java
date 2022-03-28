package br.edu.insper.desagil.backend.endpoint;

import br.pro.hashi.nfp.rest.server.Args;
import br.pro.hashi.nfp.rest.server.Endpoint;

public class QuocienteEndpoint extends Endpoint<Double> {
	public QuocienteEndpoint() {
		super("/quociente");
	}

	@Override
	public Double get(Args args) {
		double a = args.getDouble("a");
		double b = args.getDouble("b");
		return a / b;
	}
}
