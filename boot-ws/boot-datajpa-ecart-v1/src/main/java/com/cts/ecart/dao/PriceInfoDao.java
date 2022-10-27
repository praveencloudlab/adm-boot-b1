package com.cts.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.PriceInfo;

public interface PriceInfoDao extends JpaRepository<PriceInfo, Integer>{

}
