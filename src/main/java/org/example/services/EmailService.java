package org.example.services;
import org.example.model.EmailCredentials;
import org.example.utils.PropertiesLoader;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static java.util.Objects.nonNull;

public class EmailService {
    public void sendMessage(String to, EmailCredentials credentials,
                            String message, List<File> attachments) {

        Properties properties = PropertiesLoader.getProperties();

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(credentials.getEmail(), credentials.getPassword());
            }
        });

        try {

            MimeMessage mimeMessage = new MimeMessage(session);

            mimeMessage.setFrom(new InternetAddress(credentials.getEmail()));
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            mimeMessage.setSubject("Alert");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(message);

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            if (nonNull(attachments) && !attachments.isEmpty()) {
                for (File attachment : attachments) {
                    MimeBodyPart attachmentPart = new MimeBodyPart();
                    attachmentPart.attachFile(attachment);
                    multipart.addBodyPart(attachmentPart);
                }
            }

            mimeMessage.setContent(multipart);

            Transport.send(mimeMessage);

            System.out.println("Message sent successfully");

        } catch (MessagingException mex) {
            mex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
