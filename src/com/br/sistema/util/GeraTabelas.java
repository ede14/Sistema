package com.br.sistema.util;

import javax.persistence.Persistence;

public class GeraTabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("Sistema");
	}

}
