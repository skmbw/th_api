package com.cfu666.cs.version.service.spi;

import com.cfu666.cs.version.model.Version;
import com.cfu666.cs.version.model.VersionBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 版本相关的业务service接口。
 * @author yinlei
 * @date 2015-11-9 9:17:36
 */
public interface VersionService extends MyBatisService<Version, VersionBean, String> {

}
