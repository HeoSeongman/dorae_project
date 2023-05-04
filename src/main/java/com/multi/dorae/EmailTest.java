package com.multi.dorae;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;


public class EmailTest {

	public static void main(String[] args) {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.naver.com");
		mailSender.setPort(587);
		mailSender.setUsername("tjdaks0804");
		mailSender.setPassword("TJDaks!@06");
		mailSender.setDefaultEncoding("UTF-8");
		
//		mailSender.setHost("smtp.gmail.com");
//		mailSender.setPort(587);
//		mailSender.setUsername("tjdaks0804@gmail.com");
//		mailSender.setPassword("TJDaks!@06");
//		mailSender.setDefaultEncoding("UTF-8");
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.checkserveridentity", "true");
		properties.put("mail.smtps.ssl.trust", "smtp.gmail.com");
		properties.put("mail.debug", "true");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//		properties.put("mail.smtp.ssl.protocols", "TLSv1.2"); // 구글은 추가해야함
//		properties.put("mail.transport.protocol", "smtp"); // 구글은 추가해야함
		
		mailSender.setJavaMailProperties(properties);
		
		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				// TODO Auto-generated method stub
				final MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				
				helper.setFrom("tjdaks0804@naver.com");
				helper.setTo("tjdaks0804@gmail.com");
//				helper.setFrom("tjdaks0804@gmail.com");
//				helper.setTo("tjdaks0804@naver.com");
				helper.setSubject("테스트 - 메일 서버 변경 후 보냄");
				helper.setText("테스트 - 메일 서버 변경 후 보냄");
			}
		};
		
		mailSender.send(preparator);
	}
}
