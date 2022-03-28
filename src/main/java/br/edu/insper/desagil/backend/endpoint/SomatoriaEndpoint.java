package br.edu.insper.desagil.backend.endpoint;
import java.util.List;

import br.pro.hashi.nfp.rest.server.Args;
import br.pro.hashi.nfp.rest.server.Endpoint;

public class SomatoriaEndpoint extends Endpoint<Integer> {
	public SomatoriaEndpoint() {
		super("/somatoria");
	}

	@Override
	public Integer get(Args args) {
		List<Integer> l = args.getListInt("l", ",");
		int s = 0;
		for (int i : l) {
			s += i;
		}
		return s;
	}
}
