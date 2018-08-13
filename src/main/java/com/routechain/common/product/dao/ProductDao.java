package com.routechain.common.product.dao;

import java.util.List;

import com.routechain.common.product.vo.ProductVo;

public interface ProductDao {
	public boolean insertProduct(ProductVo ProductVo);
	public boolean updateProduct(ProductVo ProductVo);
	public boolean deleteProduct(ProductVo ProductVo);
	
	public ProductVo showProduct(ProductVo ProductVo);
	public List<ProductVo> listProduct(ProductVo ProductVo);
}
