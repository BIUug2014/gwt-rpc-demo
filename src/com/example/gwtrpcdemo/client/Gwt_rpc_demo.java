package com.example.gwtrpcdemo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;


public class Gwt_rpc_demo implements EntryPoint {

	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";
	
	
	//RPC Async Service
	private CalculatorRSAsync calculatorRS = GWT.create(CalculatorRS.class);

	public void onModuleLoad() {
		HorizontalPanel hp = new HorizontalPanel();
		
		final TextBox l1TB = new TextBox();
		final TextBox l2TB = new TextBox();
		
		Button addBtn = new Button(" + ");
		final Label resultLbl = new Label();
		
		hp.add(l1TB);
		hp.add(addBtn);
		hp.add(l2TB);
		hp.add(resultLbl);
		
		RootPanel.get("maincontainer").add(hp);
		
		addBtn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				int l1 = Integer.parseInt(l1TB.getText());
				int l2 = Integer.parseInt(l2TB.getText());
				
				//RPC Async Service Call
				calculatorRS.add(l1, l2, new AsyncCallback<Long>() {
					
					@Override
					public void onSuccess(Long result) {
						resultLbl.setText(result.toString());
						
					}
					
					@Override
					public void onFailure(Throwable caught) {
						resultLbl.setText(SERVER_ERROR);
						
					}
				});
			}
		});
	}
}
