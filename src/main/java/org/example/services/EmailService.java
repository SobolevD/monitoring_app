package org.example.services;

import lombok.extern.slf4j.Slf4j;
import org.example.model.common.EmailCredentials;
import org.example.utils.PropertiesLoader;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static java.util.Objects.nonNull;

@Slf4j
public class EmailService {
    public void sendMessage(String to, EmailCredentials credentials,
                            String message, File attachment) {

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

            if (nonNull(attachment)) {
                MimeBodyPart attachmentPart = new MimeBodyPart();
                attachmentPart.attachFile(attachment);
                multipart.addBodyPart(attachmentPart);
            }

            mimeMessage.setContent(multipart);

            Transport.send(mimeMessage);

            log.info("Message sent successfully");

        } catch (MessagingException mex) {
            mex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
