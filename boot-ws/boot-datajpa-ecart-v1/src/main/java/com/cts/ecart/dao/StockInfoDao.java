package com.cts.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.PriceInfo;
import com.cts.ecart.entity.StockInfo;

public interface StockInfoDao extends JpaRepository<StockInfo, Integer>{

}
