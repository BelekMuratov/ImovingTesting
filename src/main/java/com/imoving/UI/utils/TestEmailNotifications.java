package com.imoving.UI.utils;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.SearchCriteria;

import java.io.IOException;

public class TestEmailNotifications {
    public static void main(String[] args) throws MailosaurException, IOException {
        String apiKey = "ErstwZxh3ge5NAJK";
        String serverId = "5e7trluw";
        String serverDomain = "5e7trluw.mailosaur.net";

        MailosaurClient mailosaurClient = new MailosaurClient(apiKey);
        SearchCriteria searchCriteria = new SearchCriteria();

        searchCriteria.withSentFrom("belek.muratov@gmail.com");
        searchCriteria.withSubject("link");

        Message message = mailosaurClient.messages().get(serverId,searchCriteria);
        System.out.println(message.subject());
      //  System.out.println(message.text().body());
        System.out.println(message.html().links().get(0).href());
        String link = message.html().links().get(0).href();
        System.out.println(link);

    }
}
