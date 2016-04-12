package com.example.mockdemo.app;

import com.example.mockdemo.messenger.MalformedRecipientException;
import com.example.mockdemo.messenger.MessageService;
import com.example.mockdemo.messenger.SendingStatus;

public class Messenger {

	private MessageService ms;
	public String serverM;
	public String messageM;
	
	public Messenger(MessageService ms) {
		this.ms = ms;
	}

	public String getServerM() {
		return serverM;
	}


	public void setServerM(String serverM) {
		this.serverM = serverM;
	}


	public String getMessageM() {
		return messageM;
	}


	public void setMessageM(String messageM) {
		this.messageM = messageM;
	}


	public int testConnection() {
		
		switch (ms.checkConnection(serverM)) {
		case FAILURE:
			return 1;
		case SUCCESS:
			return 0;
		}
		return 1;
	}

	public int sendMessage() {

		int result = -1;

		try {
			SendingStatus sStatus = ms.send(serverM, messageM);
			switch (sStatus) {
			case SENT:
				result = 0;
				break;
			case SENDING_ERROR:
				result = 1;
				break;
			default:
				result = -1;
			}

		} catch (MalformedRecipientException e) {
			result = 2;
		}
		return result;
	}
}
