package com.example.gwtrpcdemo.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("calc")
public interface CalculatorRS extends RemoteService {

	public Double divide(int l1, int l2);
	
	public Long add(int l1, int l2);
	
}
