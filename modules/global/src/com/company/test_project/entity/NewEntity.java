package com.company.test_project.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TESTPROJECT_NEW_ENTITY")
@Entity(name = "testproject_NewEntity")
public class NewEntity extends StandardEntity {
    private static final long serialVersionUID = -359025302346699773L;
}