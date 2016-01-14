package com.cfu666.cs.ads.service.spi;

import com.cfu666.cs.ads.model.Ads;
import com.cfu666.cs.ads.model.AdsBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 广告相关的业务service接口。
 * @author yinlei
 * @date 2015-11-10 15:01:48
 */
public interface AdsService extends MyBatisService<Ads, AdsBean, String> {

}
