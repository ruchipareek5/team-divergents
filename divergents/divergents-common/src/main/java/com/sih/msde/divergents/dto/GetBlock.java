package com.sih.msde.divergents.dto;

import com.sih.msde.divergents.common.BaseDto;

public class GetBlock extends BaseDto{
	
	private String blocks;

	public String getBlocks() {
		return blocks;
	}

	public void setBlocks(String blocks) {
		this.blocks = blocks;
	}

	public GetBlock(String blocks) {
		super();
		this.blocks = blocks;
	}

	public GetBlock() {
		super();
		// TODO Auto-generated constructor stub
	}

}
