package com.sriram.class12.practice.corejava.examples;

import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Data;

@Data
public class ErrorCode {
 public static final ErrorCode INVALID_PORT_CONFIGURATION = null;
public String errorCode;
 public String errorMsg;
 public LocalDateTime when;

}
