package com.example.gwtrpcdemo.server;

import com.example.gwtrpcdemo.client.CalculatorRS;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class CalculatorRSImpl extends RemoteServiceServlet implements CalculatorRS {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Double divide(int l1, int l2) {
		return (double) l1/l2;
	}

	@Override
	public Long add(int l1, int l2) {
		return (long) l1+l2;
	}

}
