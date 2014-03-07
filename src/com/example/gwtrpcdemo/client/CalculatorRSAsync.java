package com.example.gwtrpcdemo.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CalculatorRSAsync {

	void add(int l1, int l2, AsyncCallback<Long> callback);

	void divide(int l1, int l2, AsyncCallback<Double> callback);

}
