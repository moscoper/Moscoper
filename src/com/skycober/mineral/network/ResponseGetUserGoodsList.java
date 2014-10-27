package com.skycober.mineral.network;

import java.util.List;

import com.skycober.mineral.bean.ProductRec;

public class ResponseGetUserGoodsList extends BaseResponse {
	private List<ProductRec> productRecs;
	private ProductRec productRec;
	public List<ProductRec> getProductRecs() {
		return productRecs;
	}

	public void setProductRecs(List<ProductRec> productRecs) {
		this.productRecs = productRecs;
	}

	public ProductRec getProductRec() {
		return productRec;
	}

	public void setProductRec(ProductRec productRec) {
		this.productRec = productRec;
	}

}
