package com.ants.aws.awssql.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionVO {

    private Date timeStamp;
    private String errorMessage;
    private String errorDetails;

}
