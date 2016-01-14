package com.cfu666.cs.product.action;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cfu666.cs.product.model.ProductNet;
import com.cfu666.cs.product.service.spi.ProductNetService;

import com.vteba.web.action.GenericAction;
import com.vteba.web.action.JsonBean;

/**
 * 基金净值控制器
 * @author yinlei
 * @date 2015-11-11 17:45:45
 */
@Controller
@RequestMapping("/productNet")
public class ProductNetAction extends GenericAction<ProductNet> {
	private static final Logger LOGGER = LogManager.getLogger(ProductNetAction.class);
	
	@Inject
	private ProductNetService productNetServiceImpl;
	
	/**
     * 获得基金净值List，初始化列表页。
     * @param model 参数
     * @return 基金净值List
     */
    @RequestMapping("/initial")
    public String initial(ProductNet model, Map<String, Object> maps) {
    	try {
    		List<ProductNet> list = productNetServiceImpl.pagedList(model);
            maps.put("list", list);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "productNet/initial";
    }
	
	/**
	 * 获得基金净值List，Json格式。
	 * @param model 参数
	 * @return 基金净值List
	 */
	@ResponseBody
	@RequestMapping("/list")
	public List<ProductNet> list(ProductNet model) {
		List<ProductNet> list = null;
		try {
			list = productNetServiceImpl.pagedList(model);
		} catch (Exception e) {
			LOGGER.error("get record list error, errorMsg=[{}].", e.getMessage());
		}
		return list;
	}
	
	/**
     * 根据Id获得基金净值实体，Json格式。
     * @param id 参数id
     * @return 基金净值实体
     */
    @ResponseBody
    @RequestMapping("/get")
    public ProductNet get(String id) {
    	ProductNet model = null;
    	try {
    		model = productNetServiceImpl.get(id);
		} catch (Exception e) {
			LOGGER.error("get record error, errorMsg=[{}].", e.getMessage());
		}
        return model;
    }
	
	/**
     * 跳转到新增页面
     * @return 新增页面逻辑视图
     */
    @RequestMapping("/add")
    public String add() {
        return "productNet/add";
    }
    
    /**
     * 执行实际的新增操作
     * @param model 要新增的数据
     * @return 新增页面逻辑视图
     */
    @ResponseBody
    @RequestMapping("/doAdd")
    public JsonBean doAdd(ProductNet model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = productNetServiceImpl.save(model);
            if (result == 1) {
                bean.setMessage(SUCCESS);
                bean.setCode(1);
                LOGGER.info("save record success.");
            } else {
                bean.setMessage(ERROR);
                LOGGER.error("save record error.");
            }
		} catch (Exception e) {
			LOGGER.error("save record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage(ERROR);
		}
        return bean;
    }
    
    /**
     * 查看基金净值详情页。
     * @param model 查询参数，携带ID
     * @return 基金净值详情页
     */
    @RequestMapping("/detail")
    public String detail(ProductNet model, Map<String, Object> maps) {
    	try {
    		model = productNetServiceImpl.get(model.getId());
            maps.put("model", model);//将model放入视图中，供页面视图使用
		} catch (Exception e) {
			LOGGER.error("query record detail, errorMsg=[{}].", e.getMessage());
			return "common/error";
		}
        return "productNet/detail";
    }
    
    /**
     * 跳转到编辑信息页面
     * @param model 查询参数，携带ID
     * @return 编辑页面
     */
    @RequestMapping("/edit")
    public String edit(ProductNet model, Map<String, Object> maps) {
        model = productNetServiceImpl.get(model.getId());
        maps.put("model", model);
        return "productNet/edit";
    }
    
    /**
     * 更新基金净值信息
     * @param model 要更新的基金净值信息，含有ID
     * @return 操作结果信息
     */
    @ResponseBody
    @RequestMapping("/update")
    public JsonBean update(ProductNet model) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = productNetServiceImpl.updateById(model);
            if (result == 1) {
                bean.setMessage(SUCCESS);
                bean.setCode(1);
                LOGGER.info("update record success.");
            } else {
                bean.setMessage(ERROR);
                LOGGER.error("update record error.");
            }
		} catch (Exception e) {
			LOGGER.error("update record error, errorMsg=[{}].", e.getMessage());
			bean.setMessage(ERROR);
		}
        return bean;
    }
    
    /**
     * 删除基金净值信息
     * @param id 要删除的基金净值ID
     */
    @ResponseBody
    @RequestMapping("/delete")
    public JsonBean delete(String id) {
    	JsonBean bean = new JsonBean();
    	try {
    		int result = productNetServiceImpl.deleteById(id);
    		if (result == 1) {
    			bean.setMessage(SUCCESS);
    			bean.setCode(1);
    			LOGGER.info("delete record success, id=[{}].", id);
    		} else {
    			bean.setMessage(ERROR);
    			LOGGER.error("delete record error.");
    		}
		} catch (Exception e) {
			LOGGER.error("delete record error, id=[{}], errorMsg=[{}].", id, e.getMessage());
			bean.setMessage(ERROR);
		}
        return bean;
    }
}
