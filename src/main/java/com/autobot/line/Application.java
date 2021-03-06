package com.autobot.line;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.autobot.model.BotModel;
import com.autobot.simsimi.RequestParam;
import com.autobot.simsimi.SimsimiAPI;
import com.google.gson.Gson;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

@SpringBootApplication
@LineMessageHandler
public class Application {
	
	SimsimiAPI simsimiAPI = new SimsimiAPI(); 
	RequestParam requestParam = new RequestParam();
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @EventMapping
    public Message handleTextMessage(MessageEvent<TextMessageContent> e) {
        System.out.println("event: " + e);
     		
     		requestParam.setText(e.getMessage().getText());
     		requestParam.setLc("th");
     		
     		String response = simsimiAPI.request(requestParam);
     		if (response == null) {
     	        return new TextMessage("No response Data");
    		} else {
    	   		String arr[] =  response.split(":");
         		String mess = arr[1].substring(0, arr[1].length()-1);
    	        return new TextMessage(mess);
    		}

    }
}
