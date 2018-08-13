package com.routechain.common.product.dao;

import java.util.List;

import com.routechain.common.product.vo.ProductTransferVo;

public interface ProductTransferDao {
	public boolean insertProductTransfer(ProductTransferVo ProductTransferVo);
	public boolean updateProductTransfer(ProductTransferVo ProductTransferVo);
	public boolean deleteProductTransfer(ProductTransferVo ProductTransferVo);
	
	public ProductTransferVo showProductTransfer(ProductTransferVo ProductTransferVo);
	public List<ProductTransferVo> listProductTransfer(ProductTransferVo ProductTransferVo);
}
