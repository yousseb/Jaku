package com.jaku.api;

import java.io.IOException;

import com.jaku.core.JakuRequest;
import com.jaku.request.InstallRequest;

public class InstallRequests {

	private InstallRequests() {
		
	}
	
	public static final void installRequest(String url, String appId) throws IOException {
		InstallRequest installRequest = new InstallRequest(url, appId);
		
		JakuRequest request = new JakuRequest(installRequest, null);
		request.send();
	}
}
