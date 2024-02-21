package com.rinku.binding;

import lombok.Data;

@Data
public class SmtpEmailRequest {
	private String to;
    private String subject;
    private String text;
}
