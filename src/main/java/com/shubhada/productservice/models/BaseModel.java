package com.shubhada.productservice.models;

import lombok.*;

import java.util.Date;

@Getter
@Setter
public class BaseModel {
    private Long id;
    private Date created_at;
    private Date lastUpdated_at;
    private boolean isDeleted;
}
