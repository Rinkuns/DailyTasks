package com.rinku.dto;

import lombok.Data;

@Data
public class TwilioSmsDto {

	private String to;
    private String message;
}
