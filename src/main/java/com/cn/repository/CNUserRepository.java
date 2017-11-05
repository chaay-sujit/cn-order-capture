package com.cn.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.cn.model.CNUser;

public interface CNUserRepository extends CrudRepository<CNUser, Serializable> {

}
