package com.routechain.common.product.dao;

import java.util.List;

import com.routechain.common.product.vo.ProductCategoryVo;

public interface ProductCategoryDao {
	public boolean insertProductCategory(ProductCategoryVo ProductCategoryVo);
	public boolean updateProductCategory(ProductCategoryVo ProductCategoryVo);
	public boolean deleteProductCategory(ProductCategoryVo ProductCategoryVo);
	
	public ProductCategoryVo showProductCategory(ProductCategoryVo ProductCategoryVo);
	public List<ProductCategoryVo> listProductCategory(ProductCategoryVo ProductCategoryVo);
}
